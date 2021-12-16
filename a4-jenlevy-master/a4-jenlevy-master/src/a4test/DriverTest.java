package a4test;

import a4.Driver;
import a4.DriverImpl;
import a4.Vehicle;
import a4.VehicleImpl;
import a4.Position;
import a4.PositionImpl;
import a4.RideRequest;
import a4.RideRequestImpl;
import a4.CompletedRide;
import a4.CompletedRideImpl;

public class DriverTest {
	public static void main(String[] args) {
		Position m = new PositionImpl(3,5);
		Position  n = new PositionImpl(10,5);
		Position t = new PositionImpl(0,0);
		
		Vehicle xo = new VehicleImpl("Honda", "Civic", "98989", m );
		Vehicle ya = new VehicleImpl("mercedez", "benz", "urmfmom",n);
		Vehicle hard = new VehicleImpl("punch", "buggie", "jewish", t);
 		
		Driver a = new DriverImpl("Jenna", "Levy", 696969, xo);
		Driver b = new DriverImpl ("ur", "mom", 420, ya);
		Driver c = new DriverImpl ("Lol", "yeet", 666, hard);
		
//		System.out.println(a.getFirstName());
//		System.out.println(b.getFirstName());
//		System.out.println(c.getFirstName());
//		System.out.println(a.getLastName());
//		System.out.println(b.getLastName());
//		System.out.println(c.getLastName());
//		System.out.println(a.getID());
//		System.out.println(b.getID());
//		System.out.println(c.getID());
//		System.out.println(a.getFullName());
//		System.out.println(b.getFullName());
//		System.out.println(c.getFullName());
//		
//		a.setVehicle(hard);
//		b.setVehicle(xo);
//		System.out.println(a.getVehicle().getMake());
		RideRequest retweet = new RideRequestImpl(n,m);
		System.out.println(m.getManhattanDistanceTo(retweet.getClientPosition()));
		System.out.println(m.getManhattanDistanceTo(n));
		System.out.println(m.getManhattanDistanceTo(retweet.getDestination()));
		CompletedRide xxx = new CompletedRideImpl(retweet,a);
		System.out.println(xxx.getWaitTime());
		System.out.println(xxx.getTotalTime());
		System.out.println(retweet.getRideTime());
		System.out.println(xxx.getCost());
		System.out.println(xxx.getPrice());
		System.out.println(xxx.getProfit());

	}
	

}
