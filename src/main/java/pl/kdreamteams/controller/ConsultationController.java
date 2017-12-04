package pl.kdreamteams.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.kdreamteams.json.Schedule;
import pl.kdreamteams.json.TeacherNameRequest;
import pl.kdreamteams.service.ConsultationService;

@RestController
@RequestMapping("/consultation")
public class ConsultationController {

    @Autowired
    private ConsultationService consultationService;

    @RequestMapping(method = RequestMethod.POST)
    public @ResponseBody
    Schedule getConsultationPlan(@RequestBody TeacherNameRequest name) {
        return consultationService.getSchedule(name.getTeacherName());
    }
}
