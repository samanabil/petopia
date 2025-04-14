class PetOwner extends Profile implements IAppointmentObserver {

    //prints status of the given appointment
    public void update(Appointment a) {
        System.out.println("Appointment status: " + a.getStatus());
    }
    //books appointment
    public void bookAppointment() {
        System.out.println("Appointment booked");
    }
}