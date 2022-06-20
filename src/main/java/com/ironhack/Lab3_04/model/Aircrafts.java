package com.ironhack.Lab3_04.model;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="aircrafts")
public class Aircrafts {
    @Id
    private String aircraftName;
    private Integer totalSeats;

    public Aircrafts() {
    }

    public Aircrafts(String aircraftName, Integer totalSeats) {
        setAircraftName(aircraftName);
        setTotalSeats(totalSeats);
    }

    //SETTERS
    public void setAircraftName(String aircraftName) {
        this.aircraftName = aircraftName;
    }
    public void setTotalSeats(Integer totalSeats) {
        this.totalSeats = totalSeats;
    }

    //GETTERS
    public String getAircraftName() {
        return aircraftName;
    }

    public int getTotalSeats() {
        return totalSeats;
    }

}
