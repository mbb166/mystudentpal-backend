package pl.kdreamteams.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pl.kdreamteams.json.GroupNameRequest;
import pl.kdreamteams.json.Schedule;
import pl.kdreamteams.service.ScheduleService;

import javax.sql.DataSource;

@RestController
@RequestMapping("/schedule")
public class ScheduleController {

    @Autowired
    private ScheduleService scheduleService;
    @RequestMapping(value="/findSchedule", method = RequestMethod.POST)
    public Schedule findScheduleByGroupName(@RequestBody GroupNameRequest gameNameRequest) {

        return scheduleService.findScheduleByGroupName(gameNameRequest.getGroup());
    }
}
