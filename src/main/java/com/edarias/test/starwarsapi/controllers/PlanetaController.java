package com.edarias.test.starwarsapi.controllers;

import java.util.List;
import java.util.Optional;

import com.edarias.test.starwarsapi.models.Planeta;
import com.edarias.test.starwarsapi.repositories.PlanetaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlanetaController {

    @Autowired
    private PlanetaRepository planetaRepository;

    @PostMapping(value = "/planetas")
    public Planeta salvarPlanetas(@RequestBody Planeta planeta) {
        return planetaRepository.save(planeta);
    }

    @GetMapping(value = "/planetas")
    public List<Planeta> listarPlanetas(){
        return planetaRepository.findAll();
    }

    @GetMapping(value = "/planetas/{id}")
    public Planeta listarPlanetaPorId(@PathVariable(value = "id") Integer id){
        return planetaRepository.findById(id).get();
    }

    @DeleteMapping(value = "/planetas/{id}")
    public void deletarPlanetaPorId(@PathVariable(value = "id") Integer id){
        planetaRepository.deleteById(id);
    }

    @GetMapping(value = "/planetas/name/{name}")
    public Planeta listarPlanetaPorNome(@PathVariable(value = "name") String name){
        return planetaRepository.findPlanetaByName(name);
    }

}