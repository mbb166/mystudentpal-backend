package pl.kdreamteams.json;

import java.util.Map;

public class Plan {
    private String message;

    public Map<String, WorkDay> getSchedule() {
        return schedule;
    }

    public void setSchedule(Map<String, WorkDay> schedule) {
        this.schedule = schedule;
    }

    private Map<String, WorkDay> schedule;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
