package a3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsoleHistogram {

	public static void main(String[] args) {

		// Set up scanner for input from console.

		Scanner scan = new Scanner(System.in);

		int binNums = scan.nextInt();
		List<Integer> binValues = new ArrayList <>(); 

		boolean yeet = true;
		int jen = 0;
		while (yeet) {

			binValues.add(scan.nextInt());
			jen += 1;
			yeet = scan.hasNextInt();
			// Your code here.

		}
		//System.out.println(binNums);
		//System.out.println(binValues);
		int valuesLength = binValues.size();
		//System.out.println(valuesLength);
		int max = 0;
		int min = 999999999;
		int avg = 0;
		for (int j = 0; j<valuesLength; j++) {
			avg += binValues.get(j);
			int l = binValues.get(j);
			if (l>max) {
				max = l;
			}
			if (l<min) {
				min = l;
			}
		}
		double average = Double.valueOf(avg);
		average = average/valuesLength;
		//System.out.println(max);
		//System.out.println(min);
		//System.out.println(average);
		int range = max-min;
		double width = ((double)range)/((double)binNums);
		//System.out.println(width);

		int[] totalInBin = new int[binNums];
		int[] countPerBin = new int[binNums];

		for (int x = 0; x <valuesLength; x++) {
			int hi = binValues.get(x);
			for (int y = 0; y<binNums; y++) {
				if ((min+(y*width))<=hi && hi<=(min+((y+1)*width))) {
					totalInBin[y] +=1;
					countPerBin[y] += hi;
				}

			}

		}
		int[] proportion = new int[binNums];

		for (int i = 0; i<binNums; i++ ) {
			proportion[i] = countPerBin[i]/8;
		}

		//System.out.println(totalInBin);
		System.out.println("Num bins: " + binNums);
		System.out.println("Min: " + min);
		System.out.println("Max: " + max);
		System.out.println("Avg: " + average);

		for (int ya = 0; ya<binNums; ya ++) {
			double hiya = min + (ya*width);
			//System.out.print(hiya);
			System.out.println(" ");
			System.out.print((String.format("%.2f",(hiya))) + " | ");

			for (int i = 0; i <proportion[ya]; i++) {
				System.out.print("[*]");
			}
			System.out.print(" | " + countPerBin[ya]);	

		}
	}
}
