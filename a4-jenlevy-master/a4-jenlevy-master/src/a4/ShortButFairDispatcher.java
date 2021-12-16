package a4;

public class ShortButFairDispatcher implements Dispatcher {

	@Override
	public Driver chooseDriver(Driver[] availableDrivers, RideRequest request) {
		// TODO Auto-generated method stub
		Driver driver = availableDrivers[0];
		int shortest = availableDrivers[0].getVehicle().getPosition().getManhattanDistanceTo(request.getClientPosition());
		int [] points = new int [availableDrivers.length];

		for (int i = 0; i<availableDrivers.length; i++) {
			points[i] = 0;
		}

		for (int i = 0; i<availableDrivers.length; i++) {



			if(shortest > (availableDrivers[i].getVehicle().getPosition().getManhattanDistanceTo(request.getClientPosition())) && points[i] == 0) {
				driver = availableDrivers[i];
				points[i] += 4;
				shortest = availableDrivers[i].getVehicle().getPosition().getManhattanDistanceTo(request.getClientPosition());

				
				}
			
			for (int a = 0; a<availableDrivers.length; a++) {
				if (points[a] != 0) {
					points[a]-=1;
				}
			}

		}
		return driver;
	}
}
