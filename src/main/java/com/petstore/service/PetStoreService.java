package com.petstore.service;

import com.petstore.model.PetStore;
import com.petstore.repository.PetStoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.http.HttpStatus;

import java.util.List;
import java.util.Optional;


@Service
public class PetStoreService {

    @Autowired
    private PetStoreRepository petStoreRepository;

    public List<PetStore> findAll() {
        return petStoreRepository.findAll();
    }

    public PetStore findById(Long id) {
        return petStoreRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "PetStore non trouvé"));
    }

    public PetStore save(PetStore petStore) {
        return petStoreRepository.save(petStore);
    }

    public void delete(Long id) {
        if (!petStoreRepository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "PetStore non trouvé");
        }
        petStoreRepository.deleteById(id);
    }
}
