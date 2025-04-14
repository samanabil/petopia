public class Main {
    public static void main(String[] args) {


        ServiceFactory factory = ServiceFactory.getInstance();//Get the single instance of ServiceFactory(singleton)

        IServiceStrategy service = factory.createService("PetSitting");//Create a PetSitting service using the factory

        service.loadOptions();//loads the service option using loadOptions() methode

        ((PetSittingService)service).displayCost();//Call PetSitting-specific method (requires casting)

        // Observer demo
        PetOwner owner = new PetOwner();//Create a pet owner (observer)
        Appointment appointment = new Appointment();//Create an appointment (subject)
        appointment.addObserver(owner);//Register the owner to observe appointment changes

        appointment.schedule();//Change appointment state - triggers observer notification
        appointment.cancel();//Change again - triggers observer notification
    }
}