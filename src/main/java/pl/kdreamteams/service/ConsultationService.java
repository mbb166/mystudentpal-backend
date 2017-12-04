package pl.kdreamteams.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.kdreamteams.json.Plan;
import pl.kdreamteams.json.WorkDay;
import pl.kdreamteams.repository.RoomRepository;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;

@Service
public class ConsultationService {

    @Autowired
    RoomRepository roomRepository;

    public Plan getSchedule(String teacherName){
        Date date = new Date();
        Timestamp timestamp = Timestamp.valueOf("2007-09-23 10:10:10.0");
        int hours = timestamp.getHours();
        int minutes = timestamp.getMinutes();
        String dayName = (new SimpleDateFormat("EEEE")).format(timestamp.getTime());
        Plan plan = new Plan();
        plan.setMessage("msg");
        WorkDay wrkday = new WorkDay();
        wrkday.setDataEnd(hours + ":" + minutes);
        wrkday.setDataStart(hours + ":" + minutes);
        wrkday.setName(dayName);
        wrkday.setRoom(213);
        plan.setSchedule(new HashMap<String, WorkDay>());
        plan.getSchedule().put(dayName,wrkday);
        return plan;
    }
}
