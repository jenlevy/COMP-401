package a4;

public class ShortestWaitDispatcher implements Dispatcher {

	@Override
	public Driver chooseDriver(Driver[] availableDrivers, RideRequest request) {
		// TODO Auto-generated method stub
		int shortest = availableDrivers[0].getVehicle().getPosition().getManhattanDistanceTo(request.getClientPosition());
		Driver driver = availableDrivers[0];
		for (int i = 0; i<availableDrivers.length; i++) {
			if(shortest > (availableDrivers[i].getVehicle().getPosition().getManhattanDistanceTo(request.getClientPosition()))) {
				driver = availableDrivers[i];
				shortest = availableDrivers[i].getVehicle().getPosition().getManhattanDistanceTo(request.getClientPosition());
			}
		}
		return driver;
	}

}
