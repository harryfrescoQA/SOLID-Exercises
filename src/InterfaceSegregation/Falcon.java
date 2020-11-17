package InterfaceSegregation;

public class Falcon implements EggLayingCreature, FlyingCreature{
	 
	// Attributes
	private String currentLocation;
	private int numberOfEggs;

	// Constructor
	    public Falcon(int initialEggCount) {
	        this.setNumberOfEggs(initialEggCount);
	    }

    // Methods implemented from interfaces
	    public void fly() {
	        this.setCurrentLocation("high above the clouds");
	    }

	    public void layEggs() {
	        this.setNumberOfEggs(getNumberOfEggs() + 1);
	    }
	    
    // Getters and Setters
	    public String getCurrentLocation() {
	        return currentLocation;
	    }

	    public void setCurrentLocation(String currentLocation) {
	        this.currentLocation = currentLocation;
	    }

	    public int getNumberOfEggs() {
	        return numberOfEggs;
	    }

	    public void setNumberOfEggs(int numberOfEggs) {
	        this.numberOfEggs = numberOfEggs;
	    }
}
