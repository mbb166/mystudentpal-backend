package pl.kdreamteams.model;

public enum DayName {
    MONDAY("Monday"),TUESDAY("Tuesday"), WEDNESDAY("Wednesday"),THURSDAY("Thursday"),FRIDAY("Friday");

    private String dayName;

    DayName(String dayName) {
        this.dayName = dayName;
    }

    public String getDayName() {
        return dayName;
    }
}
