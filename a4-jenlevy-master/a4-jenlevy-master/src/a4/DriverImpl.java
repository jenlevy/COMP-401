package a4;

public class DriverImpl implements Driver {

	private String first;
	private String last;
	private int id;
	private Vehicle vehicle;
	
	public DriverImpl(String first, String last, int id, Vehicle vehicle) {
		if (first == null || last == null || vehicle == null) {
			throw new RuntimeException("Cannot provide null values");
		}
		
		if (id < 0) {
			throw new RuntimeException("Cannot provide null values");
		}
		this.first = first;
		this.last = last;
		this.id = id;
		this.vehicle = vehicle;
	}
	@Override
	public String getFirstName() {
		// TODO Auto-generated method stub
		return first;
	}

	@Override
	public String getLastName() {
		// TODO Auto-generated method stub
		return last;
	}

//	@Override
//	public String getFullName() {
//		// TODO Auto-generated method stub
//		return (first + " " + last);
//	}

	@Override
	public int getID() {
		// TODO Auto-generated method stub
		return id;
	}

	@Override
	public Vehicle getVehicle() {
		// TODO Auto-generated method stub
		return vehicle;
	}

	@Override
	public void setVehicle(Vehicle v) {
		if (v == null) 
		{ throw new RuntimeException("Cannot provide null values"); }
		// TODO Auto-generated method stub
		this.vehicle = v;
	}

}
