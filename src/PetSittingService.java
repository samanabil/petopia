class PetSittingService implements IServiceStrategy {
    @Override
//    load pet setting options
    public void loadOptions() {
        System.out.println("Pet Sitting Options Loaded");
    }
//    display the cost of the pet setting service
    public void displayCost() {
        System.out.println("277 EGP per day");
    }
}