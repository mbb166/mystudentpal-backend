package pl.kdreamteams.json;

import java.util.List;
import java.util.Map;

public class Plan {
    private String message;

    public Map<String, List<PlanPosition>> getSchedule() {
        return schedule;
    }

    public void setSchedule(Map<String, List<PlanPosition>> schedule) {
        this.schedule = schedule;
    }

    private Map<String, List<PlanPosition>> schedule;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
