package pl.kdreamteams.json;

public class PlanPosition {
    private String name;
    private String dataStart;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    private String description;

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

    private long room;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
