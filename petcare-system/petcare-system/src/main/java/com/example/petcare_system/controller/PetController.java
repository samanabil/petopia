package com.example.petcare_system.controller;

import com.example.petcare_system.model.Pet;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * REST Controller for handling Pet-related requests.
 */
@RestController
@RequestMapping("/pets")
public class PetController {

    private final List<Pet> pets = new ArrayList<>();

    @GetMapping
    public List<Pet> getPets() {
        return pets;
    }

    @PostMapping
    public Pet addPet(@RequestBody Pet pet) {
        pets.add(pet);
        return pet;
    }
}
