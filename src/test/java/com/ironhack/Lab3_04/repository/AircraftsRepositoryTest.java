package com.ironhack.Lab3_04.repository;
import com.ironhack.Lab3_04.model.Aircrafts;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class AircraftsRepositoryTest {
    Aircrafts aircrafts;

    @Autowired
    private AircraftsRepository aircraftsRepository;

    @BeforeEach
    public void setUp() {
        aircrafts = new Aircrafts("Boeing-737", 300);
        aircraftsRepository.save(aircrafts);
    }

    @AfterEach
    public void tearDown() {
        aircraftsRepository.deleteAll();
    }

    @Test
    public void findAll_AircrafsExist_Aircraft() {
        List<Aircrafts> aircraftsList = aircraftsRepository.findAll();
        assertEquals(1, aircraftsList.size());
    }

}