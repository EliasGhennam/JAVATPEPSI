package com.petstore.controller;

import com.petstore.model.PetStore;
import com.petstore.service.PetStoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

        import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/petstores")
public class PetStoreController {

    @Autowired
    private PetStoreService petStoreService;

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
