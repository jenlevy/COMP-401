package a5;

public class Rice extends IngredientImpl {

	public Rice() {
		super("rice", 34, 0.13);
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
		return true;
	}

	@Override
	public boolean getIsShellfish() {
		// TODO Auto-generated method stub
		return false;
	}
}
