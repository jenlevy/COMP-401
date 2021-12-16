package a2;

import java.util.Scanner;

public class A2Novice {

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
		
		int numberOfVeggies = 0;
		
		
		for (int i = 0; i<count; i++) {
			if(veggie[i]== true) {
				numberOfVeggies += 1;
			}
		}
		double [] ratios = new double [count];
		
		String highestName = "yeet";
		String lowestName = "yah";
		
		for (int i = 0; i<count; i++) {
			ratios[i] = (cals[i]/pricePerOunce[i]);
			
		}
		
		double highestRatio = 0;
		double lowestRatio =1000000000;
		
		for (int i = 0; i<count; i++) {
			if (highestRatio < ratios[i]) {
				highestRatio = ratios[i];
				highestName = names[i];
			}
		}
		
		for (int i = 0; i < count; i++) {
			if (lowestRatio > ratios[i]) {
				lowestRatio = ratios[i];
				lowestName = names[i];
			}
		}
		

		
		System.out.println("Number of vegetarian ingredients: " + numberOfVeggies);
		System.out.println("Highest cals/$: " + highestName);
		System.out.println("Lowest cals/$: " + lowestName);
		
	
	
	}
	
	
	// You can define helper methods here if needed.
	
}
