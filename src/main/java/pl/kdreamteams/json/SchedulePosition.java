package pl.kdreamteams.json;

public class SchedulePosition {
    private String name;
    private String dataStart;

    public String getDataStart() {
        return dataStart;
    }

    public void setDataStart(String dataStart) {
        this.dataStart = dataStart;
    }

    public String getDataEnd() {
        return dataEnd;
    }

    public void setDataEnd(String dataEnd) {
        this.dataEnd = dataEnd;
    }

    public long getRoom() {
        return room;
    }

    public void setRoom(long room) {
        this.room = room;
    }

    private String dataEnd;

    private Long room;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
