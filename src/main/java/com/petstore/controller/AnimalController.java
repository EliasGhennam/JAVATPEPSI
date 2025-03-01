package com.petstore.controller;

import com.petstore.model.Animal;
import com.petstore.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/animals") // 📌 Assure-toi que ça correspond à ton URL
public class AnimalController {

    @Autowired
    private AnimalService animalService;

    @GetMapping
    public List<Animal> getAllAnimals() {
        return animalService.findAll();
    }

    @PostMapping
    public Animal createAnimal(@RequestBody Animal animal) {
        return animalService.save(animal);
    }
}
