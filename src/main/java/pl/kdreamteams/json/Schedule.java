package pl.kdreamteams.json;

import java.util.List;
import java.util.Map;

public class Schedule {
    private String message;

    public Map<String, List<SchedulePosition>> getSchedule() {
        return schedule;
    }

    public void setSchedule(Map<String, List<SchedulePosition>> schedule) {
        this.schedule = schedule;
    }

    private Map<String, List<SchedulePosition>> schedule;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
