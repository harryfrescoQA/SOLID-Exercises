package SingleResp;

public class Mechanic {
//changing the tyres, adding a spoiler, lowering the ride height
	

	 public static void changeTyres(Car car) {
		 car.setSpoilers(true);
		 System.out.println("Change tyres");
	 }
	 public static void addSpoiler(Car car) {
		 car.setSpoilers(true);
		 System.out.println("Added spolier");
	 }
	 public static void lowerRide(Car car) {
		 car.setRideHeight("Low");
		 System.out.println("Lower ride");
	 }
}
