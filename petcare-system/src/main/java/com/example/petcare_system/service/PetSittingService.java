package com.example.petcare_system.service;

import com.example.petcare_system.model.IServiceStrategy;
import org.springframework.stereotype.Service;

@Service
public class PetSittingService implements IServiceStrategy {
    @Override
    public void loadOptions() {
        System.out.println("Pet Sitting Options Loaded");
    }

    public void displayCost() {
        System.out.println("200 egp per day");
    }
}
