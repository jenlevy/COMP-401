package a5;

public class Crab extends IngredientImpl {

	 public Crab() {
		super("crab", 37, 0.72);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean getIsVegetarian() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean getIsRice() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean getIsShellfish() {
		// TODO Auto-generated method stub
		return true;
	}
}
