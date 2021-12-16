package a5;

public abstract class IngredientImpl implements Ingredient {
	
	 private String name;
	private int cals;
	private double price;
	private boolean veggie;
	private boolean rice;
	private boolean shellfish;
	
	public IngredientImpl(String names, int calss, double prices) {
		this.name = names;
		this.cals = calss;
		this.price = prices;
		//veggie = this.veggie;
		//rice = this.rice;
		//shellfish = this.shellfish;
		
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public double getCaloriesPerDollar() {
		// TODO Auto-generated method stub
		double a = 1/price;
		double b = a*cals;
		//double c = Math.round(b*100)/100;
		return b;
	}

	@Override
	public int getCaloriesPerOunce() {
		// TODO Auto-generated method stub
		return cals;
	}

	@Override
	public double getPricePerOunce() {
		// TODO Auto-generated method stub
		return price;
	}

//	@Override
//	public boolean getIsVegetarian() {
//		// TODO Auto-generated method stub
//		return veggie;
//	}
//
//	@Override
//	public boolean getIsRice() {
//		// TODO Auto-generated method stub
//		return rice;
//	}
//
//	@Override
//	public boolean getIsShellfish() {
//		// TODO Auto-generated method stub
//		return shellfish;
//	}

	@Override
	public boolean equals(Ingredient other) {
		// TODO Auto-generated method stub
		if (other == null) {
			return false;
		} else if (!this.name.equals(other.getName())) {
			return false;
		} else if (this.getCaloriesPerOunce() != other.getCaloriesPerOunce()) {
			return false;
		} else if (this.getIsVegetarian() != other.getIsVegetarian()) {
			return false;
		} else if (this.getIsShellfish() != other.getIsShellfish()) {
			return false;
		} else if (this.getIsRice() != other.getIsRice()) {
			return false;
		} else if ((other.getPricePerOunce()-this.getPricePerOunce()) >= 0.01) {	
			return false;
		}
		else {
			return true;
		}
	}
	

}
