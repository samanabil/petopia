package com.example.petcare_system.service;

import com.example.petcare_system.model.IServiceStrategy;
import org.springframework.stereotype.Component;

@Component
public class ServiceFactory {

    private static ServiceFactory instance;

    private ServiceFactory() {}

    public static ServiceFactory getInstance() {
        if (instance == null) {
            instance = new ServiceFactory();
        }
        return instance;
    }

    public IServiceStrategy createService(String type) {
        switch (type) {
            case "PetSitting":
                return new PetSittingService();
            case "MatchMaking":
                return new MatchMakingService();
            case "Location":
                return new LocationService();
            case "Education":
                return new EducationalResources();
            case "Medication":
                return new MedicationReminder();
            default:
                return null;
        }
    }
}
