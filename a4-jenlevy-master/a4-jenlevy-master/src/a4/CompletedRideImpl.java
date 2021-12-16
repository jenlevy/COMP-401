package a4;

public class CompletedRideImpl implements CompletedRide {
	private RideRequest request;
	private Driver driver;
	private int waitTime;

	public CompletedRideImpl (RideRequest request, Driver driver){
		this.request = request;
		this.driver = driver;
		this.waitTime = this.request.getClientPosition().getManhattanDistanceTo(this.driver.getVehicle().getPosition());
	}

	@Override
	public RideRequest getRequest() {
		// TODO Auto-generated method stub
		return request;
	}

	@Override
	public Driver getDriver() {
		// TODO Auto-generated method stub
		return driver;
	}

	@Override
	public int getWaitTime() {
		// TODO Auto-generated method stub
		//return ()
		return waitTime;
	}


//	@Override
//	public int getTotalTime() {
//		// TODO Auto-generated method stub
//		return this.getWaitTime() + request.getRideTime();
//	}

	//	@Override
	//	public double getCost() {
	//		// TODO Auto-generated method stub
	//
	//		double a =(.5) * this.request.getRideTime();
	//		double b = (.1) * this.getWaitTime(); 
	//		return a+b;
	//	}

	//	@Override
	//	public double getPrice() {
	//		// TODO Auto-generated method stub
	//		if (this.getWaitTime() < 25) {
	//			double c = this.request.getRideTime() *2.5;
	//			return c;
	//		} else if (25 <= this.getWaitTime() && this.getWaitTime() < 50) {
	//				double b = this.request.getRideTime() *2;
	//				return b;
	//			}else  if (50 <= this.getWaitTime() && this.getWaitTime() < 100) {
	//				return this.request.getRideTime();
	//			}else {
	//				
	//				double a = this.request.getRideTime() * .5;
	//				return a;
	//			}





	//}


//	@Override
//	public double getProfit() {
//		// TODO Auto-generated method stub
//		double a = this.getPrice()-this.getCost();
//		return a;
//	}

}
