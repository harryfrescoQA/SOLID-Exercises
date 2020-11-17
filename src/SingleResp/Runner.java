package SingleResp;

public class Runner {

	public static void main(String[] args) {
		Car car = new Car("Black", "Audi", 300);
		// Add 300 miles
		Driver.drive(car, 300);
		
		Mechanic.changeTyres(car);
		Mechanic.addSpoiler(car);
		Mechanic.lowerRide(car);

	}

}
