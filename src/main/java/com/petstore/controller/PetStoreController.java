package com.petstore.controller;

import com.petstore.model.Animal;
import jakarta.persistence.*;

import com.petstore.model.PetStore;
import com.petstore.service.PetStoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.Collections;


@RestController
@RequestMapping("/api/petstores")
public class PetStoreController {

    @Autowired
    private PetStoreService petStoreService;

    @Transactional
    @GetMapping("/{id}/animals")
    public List<Animal> getAnimalsByPetStore(@PathVariable Long id) {
        Optional<PetStore> petStore = Optional.ofNullable(petStoreService.findById(id));
        return petStore.map(PetStore::getAnimals).orElse(Collections.emptyList());
    }

    @GetMapping
    public List<PetStore> getAllPetStores() {
        return petStoreService.findAll();
    }

    @GetMapping("/{id}")
    public PetStore getPetStoreById(@PathVariable Long id) {
        return petStoreService.findById(id);
    }

    @PostMapping
    public PetStore createPetStore(@RequestBody PetStore petStore) {
        return petStoreService.save(petStore);
    }

    @DeleteMapping("/{id}")
    public void deletePetStore(@PathVariable Long id) {
        petStoreService.delete(id);
    }
}
