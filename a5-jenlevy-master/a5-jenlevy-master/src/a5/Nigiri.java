package a5;

import a5.Sashimi.SashimiType;

public class Nigiri implements Sushi{
	public enum NigiriType {TUNA, YELLOWTAIL, EEL, CRAB, SHRIMP};
	
	private NigiriType types;
	
	public Nigiri(NigiriType type) {
		this.types = type;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		if (types.equals(NigiriType.TUNA)) {
			return "tuna nigiri";
		} else if (types.equals(NigiriType.YELLOWTAIL)) {
			return "yellowtail nigiri";
		} else if (types.equals(NigiriType.EEL)) {
			return "eel nigiri";
		} else if (types.equals(NigiriType.CRAB)) {
			return "crab nigiri";
		} else if (types.equals(NigiriType.SHRIMP)) {
			return "shrimp nigiri";
		} else {
			return null;
		}
	}

	@Override
	public IngredientPortion[] getIngredients() {
		// TODO Auto-generated method stub
		IngredientPortion[] l = new IngredientPortion[2];
		l[0] = new RicePortion(0.5);
		if (types.equals(NigiriType.TUNA)) {
			l[1] = new TunaPortion(0.75);
			return l;
		} else if (types.equals(NigiriType.YELLOWTAIL)) {
			l[1] = new YellowtailPortion(0.75);
			return l;
		} else if (types.equals(NigiriType.EEL)) {
			l[1] = new EelPortion(0.75);
			return l;
		} else if (types.equals(NigiriType.CRAB)) {
			l[1] = new CrabPortion(0.75);
			return l;
		} else if (types.equals(NigiriType.SHRIMP)) {
			l[1] = new ShrimpPortion(0.75);
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
		return true;
	}

	@Override
	public boolean getHasShellfish() {
		// TODO Auto-generated method stub
		if (types.equals(NigiriType.TUNA)) {
			return false;
		} else if (types.equals(NigiriType.YELLOWTAIL)) {
			return false;
		} else if (types.equals(NigiriType.EEL)) {
			return false;
		} else if (types.equals(NigiriType.CRAB)) {
			return true;
		} else if (types.equals(NigiriType.SHRIMP)) {
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
