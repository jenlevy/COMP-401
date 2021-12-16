package a2;

import java.util.Scanner;

public class A2Adept {

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
		double [] dishPrice = new double [menuCount];
		double [] calorieCount = new double [menuCount];
		boolean [] veggieOrNot = new boolean [menuCount];

		for(int i = 0; i<menuCount; i++) {
			menuItems[i] = scan.next();
			int numberOfIng = scan.nextInt();
			veggieOrNot[i] = true;
			for (int j = 0; j<numberOfIng; j++) {
				String [] ingredients = new String [numberOfIng];
				ingredients [j] = scan.next();
				double yeet = scan.nextDouble();

				for (int x = 0; x<count; x++) {
					if (ingredients[j].equals(names[x])) {
						double yah = cals[x] * yeet;
						calorieCount[i] += (yah);
						dishPrice[i] += (pricePerOunce[x]*yeet);

						if (veggieOrNot[i] && !veggie[x]) {
							veggieOrNot[i] = false;
						}



					}






				}
			}
		}


		for (int i = 0; i<menuCount; i++) {
			System.out.println(menuItems[i] + " :");
			System.out.println((int) (calorieCount[i] + 0.5 ) + " calories");
			System.out.println("$" + String.format("%.2f", dishPrice[i]));
			if (veggieOrNot[i] == true) {
				System.out.println("Vegetarian");
			} if (veggieOrNot[i] == false) {
				System.out.println("Non-Vegetarian");
			}


		}
	}
	
	// You can define helper methods here if needed.
	
}
