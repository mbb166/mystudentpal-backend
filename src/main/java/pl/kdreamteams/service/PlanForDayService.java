package pl.kdreamteams.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.kdreamteams.json.SchedulePosition;
import pl.kdreamteams.model.Schedule;
import pl.kdreamteams.repository.PlanForDayRepository;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

@Service
public class PlanForDayService {

    @Autowired
    PlanForDayRepository planForDayRepository;

    public List<SchedulePosition> getPlanForDay(Date date, String groupName){
        List<Schedule> schedules = planForDayRepository.getScheduleForDay(date,groupName);
        List<SchedulePosition> schedulePositions = new ArrayList<SchedulePosition>();
        for(Schedule schedule : schedules){
            SchedulePosition schedulePosition = new SchedulePosition();
            schedulePosition.setDataStart(String.format("%02d",schedule.getDateStart().getHours()) + ":" + String.format("%02d",schedule.getDateStart().getMinutes()));
            schedulePosition.setDataEnd(String.format("%02d",schedule.getDateEnd().getHours()) + ":" + String.format("%02d",schedule.getDateEnd().getMinutes()));
            schedulePosition.setName(schedule.getSubject().getName());
            schedulePosition.setRoom(245);
            schedulePositions.add(schedulePosition);
        }
        return schedulePositions;
    }
}
