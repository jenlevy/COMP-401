package a5;

public class Shrimp extends IngredientImpl {

	public Shrimp() {
		super("shrimp", 32, 0.65);
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

