package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();
		String[] itemName = new String [count];
		double [] itemPrice = new double [count];

		for (int i = 0; i<count; i++) {
			itemName[i] = scan.next();
			itemPrice[i] = scan.nextDouble();
		}

		int customerCount = scan.nextInt();
		String[] firstName = new String[customerCount];
		String[] lastName = new String[customerCount];
		double[] groceryCost = new double [customerCount];

		for (int i = 0; i<customerCount; i++) {
			firstName[i] = scan.next();
			lastName[i] = scan.next();
			int groceries = scan.nextInt();
			double p = 0;
			for (int j = 0; j<groceries; j++) {
				int quantity = scan.nextInt();
				String l = scan.next();
				for (int x = 0; x<count; x++) {
					if (itemName[x] .equals(l)) {
						p += itemPrice[x] * quantity;

					}
				}
				groceryCost[i] = p;
			}


		}
		String biggestFirstName = firstName[0];
		String biggestLastName = lastName[0];
		double biggestGroceryCost = groceryCost[0];

		for(int i = 0; i<customerCount; i++) {
			if (biggestGroceryCost < groceryCost[i]) {

				biggestGroceryCost = groceryCost[i];
				biggestLastName = lastName[i];
				biggestFirstName = firstName[i];
			}
		}
		String smallestFirstName = firstName[0];
		String smallestLastName = lastName[0];
		double smallestGroceryCost = groceryCost[0];
		
		for(int i = 0; i<customerCount; i++) {
			if(smallestGroceryCost > groceryCost[i]) {
				smallestFirstName = firstName[i];
				smallestLastName = lastName[i];
				smallestGroceryCost = groceryCost[i];
			}
		}
		double average = 0;
		for(int i = 0; i<customerCount ;i++) {
			average += groceryCost[i];
		}
		
		average = average / customerCount;
		
		System.out.println("Biggest: " + biggestFirstName + " " + biggestLastName + " (" + String.format("%.2f", biggestGroceryCost) + ")" );
		System.out.println("Smallest: " + smallestFirstName + " " + smallestLastName + " (" + String.format("%.2f", smallestGroceryCost) + ")" );
		System.out.println("Average: " + String.format("%.2f", average));
		// Your code follows here.

	}
}
