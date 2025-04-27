package com.example.petcare_system.service;

import com.example.petcare_system.model.IServiceStrategy;
import org.springframework.stereotype.Service;

@Service
public class MatchMakingService implements IServiceStrategy {
    @Override
    public void loadOptions() {
        System.out.println("Match Making Options Loaded");
    }

    public void checkAvailability() {
        System.out.println("Available matches shown");
    }
}
