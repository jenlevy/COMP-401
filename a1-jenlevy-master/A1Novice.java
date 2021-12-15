package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int count = scan.nextInt();
		String[] firstNames = new String[count];
		String[] lastNames = new String[count];
		double[] totalCost = new double[count];
		int itemCount;
		
		for(int i = 0; i<count; i++) {
			firstNames[i] = scan.next();
			lastNames[i] = scan.next();
			itemCount = scan.nextInt();
			totalCost[i] = 0;
				for (int j = 0; j<itemCount; j++) {
					int amount = scan.nextInt();
					scan.next();
					double price = scan.nextDouble();
					totalCost[i] += amount*price;
				}
			
		}
		
		
		for(int i1 = 0; i1< count; i1++) {
			System.out.println(firstNames[i1].charAt(0) + "." + lastNames[i1] + ": "  + String.format("%.2f", totalCost[i1]));
		}
	

		// Your code follows here.
		
	}
}
