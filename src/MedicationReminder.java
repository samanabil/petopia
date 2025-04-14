class MedicationReminder implements IServiceStrategy {
    @Override
//    loads medication options
    public void loadOptions() {
        System.out.println("Medication Options Loaded");
    }

//    sets reminder for medication
    public void setReminder() {
        System.out.println("Reminder set");
    }
}