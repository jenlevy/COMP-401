package a5;

public class SeaweedPortion extends IngredientPortionImpl {

	public SeaweedPortion(double amount) {
		super(new Seaweed(), amount);
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
			return new SeaweedPortion(other.getAmount()+this.getAmount());
		}
	}

}
