package com.edarias.test.starwarsapi.repositories;

import com.edarias.test.starwarsapi.models.Planeta;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface PlanetaRepository extends MongoRepository<Planeta, Integer> {
    
    Planeta findPlanetaByName(String name);
}