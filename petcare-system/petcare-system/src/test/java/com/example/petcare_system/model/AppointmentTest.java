package com.example.petcare_system.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppointmentTest {

    static class MockObserver implements IAppointmentObserver {
        boolean updated = false;

        @Override
        public void update(Appointment appointment) {
            updated = true;
        }
    }

    @Test
    public void testDefaultStatus() {
        Appointment appointment = new Appointment();
        assertEquals("Pending", appointment.getStatus());
    }

    @Test
    public void testSchedule() {
        Appointment appointment = new Appointment();
        appointment.schedule();
        assertEquals("Scheduled", appointment.getStatus());
    }

    @Test
    public void testCancel() {
        Appointment appointment = new Appointment();
        appointment.cancel();
        assertEquals("Cancelled", appointment.getStatus());
    }

    @Test
    public void testObserverNotifiedOnSchedule() {
        Appointment appointment = new Appointment();
        MockObserver observer = new MockObserver();
        appointment.addObserver(observer);

        appointment.schedule();
        assertTrue(observer.updated);
    }

    @Test
    public void testObserverNotifiedOnCancel() {
        Appointment appointment = new Appointment();
        MockObserver observer = new MockObserver();
        appointment.addObserver(observer);

        appointment.cancel();
        assertTrue(observer.updated);
    }
}