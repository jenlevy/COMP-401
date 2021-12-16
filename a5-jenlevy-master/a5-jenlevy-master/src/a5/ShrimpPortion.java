package a5;

public class ShrimpPortion extends IngredientPortionImpl {

	public ShrimpPortion(double amount) {
		super(new Shrimp(), amount);
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
			return new ShrimpPortion(other.getAmount()+this.getAmount());
		}	}

}
