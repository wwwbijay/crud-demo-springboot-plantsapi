package com.example.plantsAPI.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.plantsAPI.entities.Plant;


public interface PlantRepository extends CrudRepository<Plant, Integer> {
    List<Plant> findByHasFruitTrue();

    List<Plant> findByHasFruitFalse();

    List<Plant> findByQuantityLessThan(Integer quantity);

    List<Plant> findByHasFruitTrueAndQuantityLessThan(Integer quantity);

    List<Plant> findByHasFruitFalseAndQuantityLessThan(Integer quantity);
}
