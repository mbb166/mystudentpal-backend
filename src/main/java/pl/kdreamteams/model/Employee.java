package pl.kdreamteams.model;

import java.sql.Timestamp;

public class Employee {

    private Long id;
    private String name;
    private String surname;
    private Timestamp birthdate;
    private Timestamp consultationDate;
    private Room room;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Timestamp getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Timestamp birthdate) {
        this.birthdate = birthdate;
    }

    public Timestamp getConsultationDate() {
        return consultationDate;
    }

    public void setConsultationDate(Timestamp consultationDate) {
        this.consultationDate = consultationDate;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }
}
