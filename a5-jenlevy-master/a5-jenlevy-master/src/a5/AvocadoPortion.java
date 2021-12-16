package a5;

public class AvocadoPortion extends IngredientPortionImpl {

	public AvocadoPortion(double amount) {

		super(new Avocado(), amount);
		// TODO Auto-generated constructor stub
	}

	@Override
	  public IngredientPortion combine(IngredientPortion other) {
		// TODO Auto-generated method stub
		if (other.equals(null)) {
			return this;
		} else if (!(other.getIngredient().equals(this.getIngredient()))){
			throw new IllegalArgumentException ("stupid");
		}
		else {
			return new AvocadoPortion(other.getAmount()+this.getAmount());
		}
	}

}

