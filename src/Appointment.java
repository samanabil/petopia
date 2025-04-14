import java.util.ArrayList;
import java.util.List;

class Appointment {

    private String status = "Pending"; //tracks current state
    private List<IAppointmentObserver> observers = new ArrayList<>(); //List of observers watching for status changes


    //Changes status to "Scheduled" and notifies observers
    public void schedule() {
        status = "Scheduled";
        notifyObservers();
    }

    //Changes status to "Cancelled" and notifies observers
    public void cancel() {
        status = "Cancelled";
        notifyObservers();
    }


    private void notifyObservers() {
        for (IAppointmentObserver o : observers) {
            o.update(this); //update methode used for state transition
        }
    }

    //adds observer to the list
    public void addObserver(IAppointmentObserver o) {
        observers.add(o);
    }

    // returns the status
    public String getStatus() {
        return status;
    }
}