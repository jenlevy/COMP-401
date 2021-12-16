package a4;

public class RideRequestImpl implements RideRequest{
	private Position clientPosition;
	private Position destination;
	private boolean complete = false;
	private CompletedRide completedRide;

	public RideRequestImpl (Position clientPosition, Position destination) {
		if (clientPosition == null || destination == null) {
			throw new RuntimeException("Cannot provide null values");
		}
		
		this.clientPosition = clientPosition;
		this.destination = destination;
		this.completedRide = null;
	}

	@Override
	public Position getClientPosition() {
		// TODO Auto-generated method stub
		return clientPosition;
	}

	@Override
	public Position getDestination() {
		// TODO Auto-generated method stub
		return destination;
	}

	@Override
	public boolean getIsComplete() {
		// TODO Auto-generated method stub
		return complete;
	}

	@Override
	public CompletedRide complete (Driver driver) {
		// TODO Auto-generated method stub
		if (driver == null) {
			throw new RuntimeException("Cannot provide null values");
		}
		if (!getIsComplete()) {
			complete = true;
			completedRide = new CompletedRideImpl (this, driver);
			driver.getVehicle().moveToPosition(this.clientPosition);
			driver.getVehicle().moveToPosition(this.destination);
			return completedRide;

		} else {
			return completedRide;

		}
	}

//	@Override
//	public int getRideTime() {
//		// TODO Auto-generated method stub
//		return (Math.abs(clientPosition.getX()-destination.getX()) + Math.abs(clientPosition.getY()-destination.getY())); 
//	}

}
