package a5;

public abstract class IngredientPortionImpl implements IngredientPortion {
	private Ingredient ingredient;
	private double amount;
	
	 public IngredientPortionImpl (Ingredient ingredients, double amounts) {
		if (amounts < 0) {
			throw new IllegalArgumentException("must be greater than zero");
		}
		 this.ingredient = ingredients;
		this.amount = amounts;
	}
	//hi
	 //hello
	@Override
	 public Ingredient getIngredient() {
		// TODO Auto-generated method stub
		return ingredient;
	}

	@Override
	public double getAmount() {
		// TODO Auto-generated method stub
		return amount;
	}

//	@Override
//	public String getName() {
//		// TODO Auto-generated method stub
//		return this.getIngredient().getName();
//	}
//
//	@Override
//	public boolean getIsVegetarian() {
//		// TODO Auto-generated method stub
//		return this.getIngredient().getIsVegetarian();
//	}
//
//	@Override
//	public boolean getIsRice() {
//		// TODO Auto-generated method stub
//		return this.getIngredient().getIsRice();
//	}
//
//	@Override
//	public boolean getIsShellfish() {
//		// TODO Auto-generated method stub
//		return this.getIngredient().getIsShellfish();
//	}
//
//	@Override
//	public double getCalories() {
//		// TODO Auto-generated method stub
//		int a = this.getIngredient().getCaloriesPerOunce();
//		double b = a * amount;
//		//double c = Math.round(b*100)/100;
//		return b;
//	}
//
//	@Override
//	public double getCost() {
//		// TODO Auto-generated method stub
//		double a = this.getIngredient().getPricePerOunce() * amount;
//		//double b = a * amount;
//		//double c = Math.round((a*100)/100);
//		return a;
//	}

//	@Override
//	public IngredientPortion combine(IngredientPortion other) {
//		// TODO Auto-generated method stub
////		if (other == null) {
////		
////		}
//		return null;
//	}

}

