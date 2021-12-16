package a2;

import java.util.Scanner;

public class A2Jedi {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// Your code here.
		int count = scan.nextInt();
		String[] names = new String [count];
		double[] pricePerOunce = new double[count];
		boolean[] veggie = new boolean[count];
		int[] cals = new int[count];

		for(int i = 0; i< count; i++) {
			names[i] = scan.next();
			pricePerOunce[i] = scan.nextDouble();
			veggie[i] = scan.nextBoolean();
			cals[i] = scan.nextInt();
		}

		int menuCount = scan.nextInt();
		String [] menuItems = new String [menuCount];
		double [][] ingredients = new double [menuCount][count];
	
	
		
		

		for(int i = 0; i<menuCount; i++) {
			menuItems[i] = scan.next();
			int number = scan.nextInt();
			

			for (int j = 0; j<number; j++) {
				String nextIngredient = scan.next();
				double ounces = scan.nextDouble();
				//System.out.println(ounces);
				for (int x = 0; x<count; x ++) {
					ingredients[i][x] += 0;
					
					if (nextIngredient.equals(names[x])) {
						ingredients[i][x] += ounces;
					} 
						
					}

				}
		
			}
		
	
		double [] ouncesPerItem = new double[count];
		
		boolean endOrder = false;
		
		while (! endOrder) {
			String orderThing = scan.next();
			if (orderThing .equals("EndOrder")) {
				endOrder = true;
			}
			for (int i = 0; i<menuCount; i++) {
				if (orderThing .equals(menuItems[i])){
					for (int j = 0; j<count; j++) {
						ouncesPerItem [j] += ingredients[i][j];
					}
				}
			}
			
		}
		System.out.println("The order will require: ");
		
		for (int i = 0; i<count; i++) {
		System.out.println(String.format("%.2f", ouncesPerItem[i]) + " ounces of " + names[i]);	
		}
	}
	
	// You can define helper methods here if needed.
	
}
