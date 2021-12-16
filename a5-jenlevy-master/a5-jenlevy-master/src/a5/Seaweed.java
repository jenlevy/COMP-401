package a5;

public class Seaweed extends IngredientImpl {

	public Seaweed() {
		super("seaweed", 105, 2.85);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean getIsVegetarian() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean getIsRice() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean getIsShellfish() {
		// TODO Auto-generated method stub
		return false;
	}

}

