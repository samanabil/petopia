package com.example.petcare_system.model;

import java.util.ArrayList;
import java.util.List;

public class Appointment {

    private String status = "Pending";
    private List<IAppointmentObserver> observers = new ArrayList<>();

    public void schedule() {
        status = "Scheduled";
        notifyObservers();
    }

    public void cancel() {
        status = "Cancelled";
        notifyObservers();
    }

    private void notifyObservers() {
        for (IAppointmentObserver o : observers) {
            o.update(this);
        }
    }

    public void addObserver(IAppointmentObserver o) {
        observers.add(o);
    }

    public String getStatus() {
        return status;
    }
}
