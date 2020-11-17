package SingleResp;

public class Car {
	private String colour;
	    private String model;
	    private int mileage;
	    private boolean tyresChanged;
	    private boolean spoilers;
	    private String rideHeight;

	    // constructor
	    public Car(String colour, String model, int mileage) {
	        this.colour = colour;
	        this.model = model;
	        this.mileage = mileage;
	        this.tyresChanged = false;
	        this.spoilers = false;
	        this.rideHeight = "Normal";
	        
	    }

		public boolean isSpoilers() {
			return spoilers;
		}

		public void setSpoilers(boolean spoilers) {
			this.spoilers = spoilers;
		}

		public String getRideHeight() {
			return rideHeight;
		}

		public void setRideHeight(String rideHeight) {
			this.rideHeight = rideHeight;
		}

		public boolean isTyresChanged() {
			return tyresChanged;
		}

		public void setTyresChanged(boolean tyresChanged) {
			this.tyresChanged = tyresChanged;
		}

		public String getColour() {
			return colour;
		}

		public void setColour(String colour) {
			this.colour = colour;
		}

		public String getModel() {
			return model;
		}

		public void setModel(String model) {
			this.model = model;
		}

		public int getMileage() {
			return mileage;
		}

		public void setMileage(int mileage) {
			this.mileage = mileage;
		}
	    
	    
}
