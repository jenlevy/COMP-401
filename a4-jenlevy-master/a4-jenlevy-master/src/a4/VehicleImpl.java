package a4;

public class VehicleImpl implements Vehicle {
	private String make;
	private String model;
	private String plate;
	private int mileage = 0;
	private Position position;
	
	public VehicleImpl(String make, String model, String plate, Position position) {
		if (make == null || model == null || plate == null || position == null) {
			throw new RuntimeException("Cannot provide null values");
		}
		this.make = make;
		this.model = model;
		this.plate = plate;
		this.position = position;
	}

	@Override
	public String getMake() {
		// TODO Auto-generated method stub
		return make;
	}

	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return model;
	}

	@Override
	public String getPlate() {
		// TODO Auto-generated method stub
		return plate;
	}

	@Override
	public int getMileage() {
		// TODO Auto-generated method stub
		return mileage;
	}

	@Override
	public Position getPosition() {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public void moveToPosition(Position p) {
		// TODO Auto-generated method stub
		if ( p == null) {
			throw new RuntimeException("Cannot provide null values");
		}
		this.mileage = mileage  + this.position.getManhattanDistanceTo(p);
		this.position = p;
	}

}
