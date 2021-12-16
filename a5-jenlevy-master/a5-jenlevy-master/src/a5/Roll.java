package a5;

import java.util.ArrayList;

public class Roll implements Sushi {

	private String names;
	private IngredientPortion[] rollIngredients;
	
	public Roll(String name, IngredientPortion[] roll_ingredients) {
		
		if(roll_ingredients == null) {
			throw new IllegalArgumentException("dummy");
		}
		for (int i = 0; i<roll_ingredients.length; i++) {
			if(roll_ingredients[i]==null) {
				throw new IllegalArgumentException("dummy");
			}
		}
		rollIngredients = roll_ingredients.clone();
		
		ArrayList<IngredientPortion> ings = new ArrayList<IngredientPortion>();
		for (int i = 0; i < rollIngredients.length; i++) {
			ings.add(rollIngredients[i]);
		}
		
		for (int i = 0; i < ings.size() - 1; i++) {
			for (int x = i + 1; x < ings.size(); x++) {
				if (ings.get(x).getIngredient().equals(ings.get(i).getIngredient())) {
					ings.set(i, ings.get(i).combine(ings.get(x)));
					ings.remove(x);

				}
			}
		}
		
		double seaweed_amt = 0.0;
		
		for (int i = 0; i < ings.size(); i++) {
			if(ings.get(i).getIngredient().equals(new Seaweed())) {
				seaweed_amt += ings.get(i).getAmount();
			}
		}
		
		if (seaweed_amt < 0.1) {
			ings.add(new SeaweedPortion(0.1-seaweed_amt));
		}
		
		rollIngredients = ings.toArray(new IngredientPortion[ings.size()]);
		this.names=name;	
		
		
	}
	
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return names;
	}

	@Override
	public IngredientPortion[] getIngredients() {
		// TODO Auto-generated method stub
		IngredientPortion[] l = rollIngredients.clone();
		IngredientPortion[] j = new IngredientPortion[rollIngredients.length];
		for (int i = 0; i< rollIngredients.length; i++) {
			j[i] = rollIngredients[i];
		}

		return j;
	}

	@Override
	public int getCalories() {
		// TODO Auto-generated method stub
		
		double n = 0;
		for (int i = 0; i<this.getIngredients().length; i++ ) {
			n += this.getIngredients()[i].getCalories();
		}
		int a = (int) Math.round(n);
		return a;
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		double n = 0;
		for (int i = 0; i<this.getIngredients().length; i++ ) {
			n += this.getIngredients()[i].getCost();
		}
		double rounded = Math.round(n*100.0)/100.0;
		return rounded;
	}

	@Override
	public boolean getHasRice() {
		// TODO Auto-generated method stub
		for (int i = 0; i<this.getIngredients().length; i++ ) {
			if(this.getIngredients()[i].getIsRice()) {
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean getHasShellfish() {
		// TODO Auto-generated method stub
		for (int i = 0; i<this.getIngredients().length; i++ ) {
			if(this.getIngredients()[i].getIsShellfish()) {
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean getIsVegetarian() {
		// TODO Auto-generated method stub
		for (int i = 0; i<this.getIngredients().length; i++ ) {
			if(this.getIngredients()[i].getIsVegetarian()) {
				return true;
			}
		}
		return false;
	}

}
