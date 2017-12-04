package pl.kdreamteams.repository;

import org.springframework.beans.factory.annotation.Autowired;
import pl.kdreamteams.json.Schedule;
import pl.kdreamteams.json.SchedulePosition;
import pl.kdreamteams.model.DayName;

import javax.sql.DataSource;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ScheduleRepository {

    @Autowired
    private DataSource dataSource;


}
