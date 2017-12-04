package pl.kdreamteams.model;

import java.sql.Date;
import java.sql.Time;

public class Employee {

    private Long id;
    private String name;
    private String surname;

    public String getConsultationDay() {
        return consultationDay;
    }

    public void setConsultationDay(String consultationDay) {
        this.consultationDay = consultationDay;
    }

    private String consultationDay;
    private Date birthDate;

    public Time getStartConsultationDate() {
        return startConsultationDate;
    }

    public void setStartConsultationDate(Time startConsultationDate) {
        this.startConsultationDate = startConsultationDate;
    }

    public Time getEndConsultationDate() {
        return endConsultationDate;
    }

    public void setEndConsultationDate(Time endConsultationDate) {
        this.endConsultationDate = endConsultationDate;
    }

    private Time startConsultationDate;
    private Time endConsultationDate;
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

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }
}
