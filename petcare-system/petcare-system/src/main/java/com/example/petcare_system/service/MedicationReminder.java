package com.example.petcare_system.service;

import com.example.petcare_system.model.IServiceStrategy;
import org.springframework.stereotype.Service;

@Service
public class MedicationReminder implements IServiceStrategy {
    @Override
    public void loadOptions() {
        System.out.println("Medication Options Loaded");
    }

    public void setReminder() {
        System.out.println("Reminder set");
    }
}
