package pl.kdreamteams.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.kdreamteams.json.GroupNameRequest;
import pl.kdreamteams.json.Schedule;

import javax.sql.DataSource;

@RestController
@RequestMapping("/schedule")
public class ScheduleController {

    @Autowired
    private DataSource dataSource;

    public Schedule findScheduleByGroupName(@RequestBody GroupNameRequest gameNameRequest) {
        return null;
    }
}
