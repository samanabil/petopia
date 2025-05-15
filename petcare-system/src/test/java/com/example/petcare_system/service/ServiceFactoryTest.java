package com.example.petcare_system.service;

import com.example.petcare_system.model.IServiceStrategy;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class ServiceFactoryTest {

    @Autowired
    private ServiceFactory serviceFactory;

    @Test
    public void testCreatePetSittingService() {
        IServiceStrategy service = serviceFactory.createService("PetSitting");
        assertNotNull(service);
        assertEquals("com.example.petcare_system.service.PetSittingService", service.getClass().getName());
    }

    @Test
    public void testCreateMatchMakingService() {
        IServiceStrategy service = serviceFactory.createService("MatchMaking");
        assertNotNull(service);
        assertEquals("com.example.petcare_system.service.MatchMakingService", service.getClass().getName());
    }

    @Test
    public void testCreateInvalidService() {
        IServiceStrategy service = serviceFactory.createService("InvalidService");
        assertNull(service);
    }
}