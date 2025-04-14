class MatchMakingService implements IServiceStrategy {
    @Override
//    load matchmaking options
    public void loadOptions() {
        System.out.println("Match Making Options Loaded");
    }
//    shows available matches
    public void checkAvailability() {
        System.out.println("Available matches shown");
    }
}