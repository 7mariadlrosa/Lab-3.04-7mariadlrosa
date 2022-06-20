package com.ironhack.Lab3_04.repository;
import com.ironhack.Lab3_04.model.Flights;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class FlightsRepositoryTest {

    Flights flights;

    @Autowired
    private FlightsRepository flightsRepository;

    @BeforeEach
    public void setUp() {
        flights = new Flights("IB255", "Boeing-255", 1300);
        flightsRepository.save(flights);
    }

    @AfterEach
    public void tearDown() {
        flightsRepository.deleteAll();
    }

    @Test
    public void findAll_AircrafsExist_Aircraft() {
        List<Flights> flightsList = flightsRepository.findAll();
        assertEqual(1, flightsList.size());
    }

    @Test
    public void findFlightsByFlightNumber_FlightNumberExist_Flight() {
        Flights flights = flightsRepository.findFlightsByFlightNumber("IB255");
        assertEquals("IB255", flights.getFlightNumber());
    }

}