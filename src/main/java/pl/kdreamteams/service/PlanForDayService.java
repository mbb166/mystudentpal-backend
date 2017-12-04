package pl.kdreamteams.service;

import org.springframework.beans.factory.annotation.Autowired;
import pl.kdreamteams.model.Schedule;
import pl.kdreamteams.repository.PlanForDayRepository;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class PlanForDayService {

    @Autowired
    PlanForDayRepository planForDayRepository;

    public Schedule getPlanForDay(Date date, String groupName){
        List<Schedule> schedules = planForDayRepository.getScheduleForDay(date,groupName);
        String dayOfWeek = new SimpleDateFormat("EEEE", Locale.ENGLISH).format(date);
        return null;
    }
}
