package com.ironhack.Lab3_04.repository;
import com.ironhack.Lab3_04.model.Aircrafts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AircraftsRepository extends JpaRepository<Aircrafts, String> {
    public Aircrafts findAircraftsByAircraftName (String aircraftName);
    public List<Aircrafts> findAircraftsByAircraftNameContaining (String aircraftName);
}
