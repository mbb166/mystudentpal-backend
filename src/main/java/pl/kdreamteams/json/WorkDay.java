package pl.kdreamteams.json;

public class WorkDay {
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

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }

    private String dataEnd;
    private int room;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
