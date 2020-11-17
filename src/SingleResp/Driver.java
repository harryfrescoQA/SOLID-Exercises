package SingleResp;

public class Driver {
	private int mileage;

    // functionality
    public static void drive(Car car, int milesDriven){
        car.setMileage(car.getMileage() + milesDriven);
        System.out.println("Mileage is: " + car.getMileage());
    }

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
    
}
