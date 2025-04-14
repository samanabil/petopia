class EducationalResources implements IServiceStrategy {
    @Override
    //loads educational resources
    public void loadOptions() {
        System.out.println("Education Resources Loaded");
    }
    //shows resources
    public void showResources() {
        System.out.println("Showing resources");
    }
}