package com.ironhack.Lab3_04.model;
import javax.persistence.*;

@Entity
@Table(name="airline")
public class Airline {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String flightNumber;
    private Integer customerId;

    public Airline() {
    }

    public Airline(String flightNumber, Integer customerId) {
        setId();
        setFlightNumber(flightNumber);
        setCustomerId(customerId);
    }

    //SETTERS
    public void setId() {
        this.id = id;
    }
    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }
    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }


    //GETTERS
    public Integer getId() {
        return id;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public Integer getCustomerId() {
        return customerId;
    }

}
