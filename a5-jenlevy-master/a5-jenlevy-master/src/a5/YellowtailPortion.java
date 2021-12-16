package a5;

public class YellowtailPortion extends IngredientPortionImpl {

	public YellowtailPortion(double amount) {
		super(new Yellowtail(), amount);
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
			return new YellowtailPortion(other.getAmount()+this.getAmount());
		}	}

}


