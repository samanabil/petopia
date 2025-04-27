package com.example.petcare_system.model;

public class PetOwner extends Profile implements IAppointmentObserver {

    @Override
    public void update(Appointment appointment) {
        System.out.println("Appointment status: " + appointment.getStatus());
    }

    public void bookAppointment() {
        System.out.println("Appointment booked");
    }
}
