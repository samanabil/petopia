package com.example.petcare_system.service;

import com.example.petcare_system.model.IServiceStrategy;
import org.springframework.stereotype.Service;

@Service
public class LocationService implements IServiceStrategy {
    @Override
    public void loadOptions() {
        System.out.println("Location Options Loaded");
    }

    public void showNearbyCenters() {
        System.out.println("Showing nearby centers");
    }
}
