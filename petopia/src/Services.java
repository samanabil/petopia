class Services {
    private IServiceStrategy strategy;//Holds the current service strategy


    public void setServiceStrategy(IServiceStrategy s) {
        this.strategy = s; // Store the new strategy
    }

//    runs the current service's operation
    public void executeLoadOptions() {
        // Check if a strategy is set before trying to use it
        if (strategy != null) {
            strategy.loadOptions();
        }
    }
}