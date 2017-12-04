package pl.kdreamteams.repository;

import org.springframework.stereotype.Repository;
import pl.kdreamteams.model.Schedule;

import java.util.Date;
import java.util.List;

@Repository
public class PlanForDayRepository {
    public List<Schedule> getScheduleForDay(Date date, String groupName){
        return null;
    }
}
