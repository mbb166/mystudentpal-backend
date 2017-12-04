package pl.kdreamteams.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.kdreamteams.json.Plan;
import pl.kdreamteams.json.WorkDay;
import pl.kdreamteams.service.ConsultationService;

import java.util.HashMap;

@RestController
@RequestMapping("/consultation")
public class ConsultationController {

    @Autowired
    private ConsultationService consultationService;

    @RequestMapping(method = RequestMethod.POST)
    public @ResponseBody
    Plan getConsultationPlan(@RequestBody String name) {
        return consultationService.getSchedule("");
    }
}
