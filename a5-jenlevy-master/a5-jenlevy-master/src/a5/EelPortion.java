package a5;

public class EelPortion extends IngredientPortionImpl {

	public EelPortion( double amount) {
	 	super(new Eel(), amount);
		// TODO Auto-generated constructor stub
	}

	@Override
	public IngredientPortion combine(IngredientPortion other) {
		// TODO Auto-generated method stub
		if (other == null) {
			return this;
		}  else if (!(other.getIngredient().equals(this.getIngredient()))){
			throw new IllegalArgumentException ("stupid");
		}else {
			return new EelPortion(other.getAmount()+this.getAmount());
		}
	}

}
