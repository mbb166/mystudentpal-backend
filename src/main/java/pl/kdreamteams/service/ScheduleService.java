package pl.kdreamteams.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import pl.kdreamteams.json.Schedule;
import pl.kdreamteams.json.SchedulePosition;
import pl.kdreamteams.model.DayName;
import pl.kdreamteams.repository.ScheduleRepository;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ScheduleService {
    @Autowired
    private ScheduleRepository scheduleRepository;

    private void incrementDate(Date date) {
        date.setDate(date.getDate()+1);
    }

    //private

    private Timestamp getTimestampFromDate(DateFormat dateFormat, Date date) {
        return  Timestamp.valueOf(dateFormat.format(date));
    }

    private void checkDayNameFromDate(String groupName) {
        Date actualDate = new Date();

        DateFormat timeStampDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        DateFormat dateFormat = new SimpleDateFormat("EEEE");

        String dayName = dateFormat.format(actualDate);
        if (dayName.equals(DayName.MONDAY.getDayName())) {
            //Monday
            Timestamp monday = getTimestampFromDate(dateFormat, actualDate);
            //Tuesday
            incrementDate(actualDate);
            Timestamp tuesday = getTimestampFromDate(dateFormat, actualDate);

            //Wednesday
            incrementDate(actualDate);
            Timestamp timestamp = getTimestampFromDate(dateFormat, actualDate);

            //

        }
    }

    public Schedule findScheduleByGroupName(String groupName) {
        DateFormat dateFormat = new SimpleDateFormat("EEEE");
        Schedule schedule = new Schedule();
        schedule.setMessage("here is your awesome schedule, ");
        Map<String, List<SchedulePosition>> scheduleMap = new HashMap<String, List<SchedulePosition>>();
        return null;
    }
}
