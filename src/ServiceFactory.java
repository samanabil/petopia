// Singleton + Factory Pattern
class ServiceFactory {

    private static ServiceFactory instance; // Static single instance

    private ServiceFactory() {} // Private constructor

    public static ServiceFactory getInstance() { // Lazy initialization for "instance"
        if (instance == null) {
            instance = new ServiceFactory();
        }
        return instance;
    }
//    Factory for creating the services
    public IServiceStrategy createService(String type) {
        switch (type) {
            case "PetSitting":
                return new PetSittingService();
            case "MatchMaking":
                return new MatchMakingService();
            case "Location":
                return new LocationService();
            case "Education":
                return new EducationalResources();
            case "Medication":
                return new MedicationReminder();
            default:
                return null;
        }
    }
}