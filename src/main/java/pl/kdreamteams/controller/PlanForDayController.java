package pl.kdreamteams.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.kdreamteams.json.Schedule;
import pl.kdreamteams.json.PlanForDayRequest;

import pl.kdreamteams.json.SchedulePosition;
import pl.kdreamteams.json.TeacherNameRequest;

import pl.kdreamteams.service.ConsultationService;
import pl.kdreamteams.service.PlanForDayService;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

@RestController
@RequestMapping("/planforday")
public class PlanForDayController {
    @Autowired
    private PlanForDayService planForDayService;

    private String [] weekDays;

    public PlanForDayController(){
        weekDays = new String[5];
        weekDays[0] = "Monday";
        weekDays[1] = "Thuesday";
        weekDays[2] = "Wednesday";
        weekDays[3] = "Thursday";
        weekDays[4] = "Friday";
    }

    @RequestMapping(method = RequestMethod.POST)
    public @ResponseBody
    Schedule getConsultationPlan(@RequestBody PlanForDayRequest req) throws ParseException {
        Schedule schedule = new Schedule();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss", Locale.ENGLISH);
        Date date =  df.parse(req.getDate());
        List<SchedulePosition> schedulePositions = planForDayService
                .getPlanForDay(date,req.getGroupName());
        schedule.setSchedule(new HashMap<String, List<SchedulePosition>>());
        String dayName = new SimpleDateFormat("EEEE", Locale.ENGLISH).format(date);
        for(String dayOfWeek : this.weekDays){
            if(dayOfWeek.equals(dayName)){
                schedule.getSchedule().put(dayName.toLowerCase(),schedulePositions.size() > 0 ? schedulePositions : new ArrayList<SchedulePosition>() );
            } else {
                schedule.getSchedule().put(dayOfWeek.toLowerCase(),new ArrayList<SchedulePosition>());
            }
        }
        return schedule;
    }
}
