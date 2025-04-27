package com.example.petcare_system.service;

import com.example.petcare_system.model.IServiceStrategy;
import org.springframework.stereotype.Service;

@Service
public class Services {

    private IServiceStrategy strategy;

    public void setServiceStrategy(IServiceStrategy strategy) {
        this.strategy = strategy;
    }

    public void executeLoadOptions() {
        if (strategy != null) {
            strategy.loadOptions();
        }
    }
}
