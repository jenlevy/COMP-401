package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		int count = scan.nextInt();
		String [] itemNames = new String[count];
		double [] pointless = new double[count];
		int[] itemAmounts = new int [count];
		int[] customersWhoBought = new int[count];


		for (int i = 0; i<count; i++) {
			itemNames[i] = scan.next();
			pointless[i] = scan.nextDouble();
		}

		int customerCount = scan.nextInt();
		String[] firstName = new String[customerCount];
		String[]lastName = new String[customerCount];




		for (int x = 0; x<customerCount; x++) {
			firstName[x] = scan.next();
			lastName[x] = scan.next();
			int groceryCount = scan.nextInt();
			boolean [] bool = new boolean[count];

			for(int l = 0; l<groceryCount; l++) {
				int yeet = scan.nextInt();
				String fruit = scan.next();

				for (int i = 0; i<count; i++) {
					if(fruit.equals(itemNames[i])) {
						itemAmounts[i] += yeet;
						if (bool[i] == false) {
							customersWhoBought[i] += 1;
							bool[i] = true;

						}


					}

				}

			}
		}

	

		for(int i = 0; i<count; i++) {
			if (itemAmounts[i] == (0)) {
				System.out.println("No customers bought " + itemNames[i]);
			} else {
				System.out.println(customersWhoBought[i] + " customers bought " + itemAmounts[i] + " " + itemNames[i]);



			}
		}
	}
}



