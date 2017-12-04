package pl.kdreamteams.repository;

import org.springframework.beans.factory.annotation.Autowired;
import pl.kdreamteams.json.Schedule;
import pl.kdreamteams.json.SchedulePosition;

import javax.sql.DataSource;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ScheduleRepository {

    @Autowired
    private DataSource dataSource;

    public Schedule findScheduleByGroupName(String groupName) {
        DateFormat dateFormat = new SimpleDateFormat("EEEE");
        Schedule schedule = new Schedule();
        schedule.setMessage("here is your awesome schedule, ");
        Map<String, List<SchedulePosition>> scheduleMap = new HashMap<String, List<SchedulePosition>>();
        return null;
    }
}
