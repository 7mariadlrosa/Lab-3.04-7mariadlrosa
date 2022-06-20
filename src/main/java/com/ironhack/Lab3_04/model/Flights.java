package com.ironhack.Lab3_04.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="fligths")
public class Flights {
    @Id
    private String flightNumber;
    private String aircraftName;
    private Integer flightMileage;

    public Flights() {
    }

    public Flights(String flightNumber, String aircraftName, Integer flightMileage) {
        setFlightNumber(flightNumber);
        setAircraftName(aircraftName);
        setFlightMileage(flightMileage);
    }

    //SETTERS
    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }
    public void setAircraftName(String aircraftName) {
        this.aircraftName = aircraftName;
    }
    public void setFlightMileage(Integer flightMileage) {
        this.flightMileage = flightMileage;
    }

    //GETTERS
    public String getFlightNumber() {
        return flightNumber;
    }

    public String getAircraftName() {
        return aircraftName;
    }

    public Integer getFlightMileage() {
        return flightMileage;
    }

}
