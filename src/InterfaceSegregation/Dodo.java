package InterfaceSegregation;

public class Dodo implements EggLayingCreature, ExtinctCreature {
	// Attributes
	 private String currentLocation;
	 private int numberOfEggs;

	 // Constructor
	    public Dodo(int initialEggCount) {
	        this.setNumberOfEggs(initialEggCount);
	    }
	// Methods from the interfaces
	    public void layEggs() {
	        this.setNumberOfEggs(getNumberOfEggs() + 1);
	    }

	    public void goExtinct() {
	        this.setCurrentLocation("in a museum");
	    }

    // Getter and setters
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
