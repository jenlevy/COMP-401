package a5;

public class Sashimi implements Sushi{
	public enum SashimiType {TUNA, YELLOWTAIL, EEL, CRAB, SHRIMP};
	private SashimiType types;
	public Sashimi(SashimiType type) {
		this.types=type;
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		if (types.equals(SashimiType.TUNA)) {
			return "tuna sashimi";
		} else if (types.equals(SashimiType.YELLOWTAIL)) {
			return "yellowtail sashimi";
		} else if (types.equals(SashimiType.EEL)) {
			return "eel sashimi";
		} else if (types.equals(SashimiType.CRAB)) {
			return "crab sashimi";
		} else if (types.equals(SashimiType.SHRIMP)) {
			return "shrimp sashimi";
		} else {
			return null;
		}
		
	}

	@Override
	public IngredientPortion[] getIngredients() {
		// TODO Auto-generated method stub
		IngredientPortion[] l = new IngredientPortion[1];
		if (types.equals(SashimiType.TUNA)) {
			l[0] = new TunaPortion(0.75);
			return l;
		} else if (types.equals(SashimiType.YELLOWTAIL)) {
			l[0] = new YellowtailPortion(0.75);
			return l;
		} else if (types.equals(SashimiType.EEL)) {
			l[0] = new EelPortion(0.75);
			return l;
		} else if (types.equals(SashimiType.CRAB)) {
			l[0] = new CrabPortion(0.75);
			return l;
		} else if (types.equals(SashimiType.SHRIMP)) {
			l[0] = new ShrimpPortion(0.75);
			return l;
		}
		return null;
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
		
		return false;
	}

	@Override
	public boolean getHasShellfish() {
		// TODO Auto-generated method stub
		if (types.equals(SashimiType.TUNA)) {
			return false;
		} else if (types.equals(SashimiType.YELLOWTAIL)) {
			return false;
		} else if (types.equals(SashimiType.EEL)) {
			return false;
		} else if (types.equals(SashimiType.CRAB)) {
			return true;
		} else if (types.equals(SashimiType.SHRIMP)) {
			return true;
		} else {
			return false;
		}
		
	}

	@Override
	public boolean getIsVegetarian() {
		// TODO Auto-generated method stub
		return false;
	}

}
