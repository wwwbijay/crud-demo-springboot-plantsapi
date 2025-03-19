package com.example.plantsAPI.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.plantsAPI.entities.Plant;


public interface PlantRepository extends CrudRepository<Plant, Integer> {
}
