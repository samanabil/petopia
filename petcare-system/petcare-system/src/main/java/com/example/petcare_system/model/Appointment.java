package com.example.petcare_system.model;

import java.util.ArrayList;
import java.util.List;

public class Appointment {

    private String status = "Pending";
    private final List<IAppointmentObserver> observers = new ArrayList<>();

    public void schedule() {
        status = "Scheduled";
        notifyObservers();
    }

    public void cancel() {
        status = "Cancelled";
        notifyObservers();
    }

    protected void notifyObservers() {
        for (IAppointmentObserver observer : observers) {
            observer.update(this);
        }
    }

    public void addObserver(IAppointmentObserver observer) {
        observers.add(observer);
    }

    public String getStatus() {
        return status;
    }
}