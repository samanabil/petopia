package com.example.petcare_system.service;

import com.example.petcare_system.model.IServiceStrategy;
import org.springframework.stereotype.Service;

@Service
public class EducationalResources implements IServiceStrategy {
    @Override
    public void loadOptions() {
        System.out.println("Education Resources Loaded");
    }

    public void showResources() {
        System.out.println("Showing resources");
    }
}
