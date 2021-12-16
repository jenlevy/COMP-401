package a5;

public class CrabPortion extends IngredientPortionImpl {

	public CrabPortion(double amount) {
		super(new Crab(), amount);
		// TODO Auto-generated constructor stub
	}

	@Override
	public IngredientPortion combine(IngredientPortion other) {
		// TODO Auto-generated method stub
		if (other == null) {
			return this;
		} else if (!(other.getIngredient().equals(this.getIngredient()))){
			throw new IllegalArgumentException ("stupid");
		} 
		else {
			return new CrabPortion(other.getAmount()+this.getAmount());
		}
	}

}

