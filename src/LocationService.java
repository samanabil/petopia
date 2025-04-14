class LocationService implements IServiceStrategy {
    @Override
//    load location options
    public void loadOptions() {
        System.out.println("Location Options Loaded");
    }
//    shows nearby centers
    public void showNearbyCenters() {
        System.out.println("Showing nearby centers");
    }
}