package pl.kdreamteams.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.kdreamteams.json.Schedule;
import pl.kdreamteams.json.SchedulePosition;
import pl.kdreamteams.model.Employee;
import pl.kdreamteams.repository.ConsultationRepository;

import java.sql.Time;
import java.util.*;

@Service
public class ConsultationService {

    @Autowired
    private ConsultationRepository consultationRepository;

    private String [] weekDays;

    public ConsultationService(){
        weekDays = new String[5];
        weekDays[0] = "Monday";
        weekDays[1] = "Thuesday";
        weekDays[2] = "Wednesday";
        weekDays[3] = "Thursday";
        weekDays[4] = "Friday";
    }

    public Schedule getSchedule(String teacherName){
        Employee employee = consultationRepository.getConsultation(teacherName);
        Time startTime = employee.getStartConsultationDate();
        Time endTime = employee.getStartConsultationDate();
        int startHour = startTime.getHours();
        int endHour = endTime.getHours();
        int startMinute = startTime.getMinutes();
        int endMinute = endTime.getMinutes();
        Schedule plan = new Schedule();
        plan.setMessage("Next consultation starts at " + startHour + ":" + String.format("%02d", startMinute) + " " + employee.getConsultationDay() + ".");
        SchedulePosition planPosition = new SchedulePosition();
        planPosition.setDataEnd(startHour + ":" + String.format("%02d", startMinute));
        planPosition.setDataStart(endHour + ":" + String.format("%02d", endMinute));
        planPosition.setName("Consultation");
        planPosition.setRoom(employee.getRoom().getNumber());
        plan.setSchedule(new HashMap<String, List<SchedulePosition>>());
        plan.getSchedule().put(employee.getConsultationDay(), Collections.singletonList(planPosition));
        return plan;
    }
}
