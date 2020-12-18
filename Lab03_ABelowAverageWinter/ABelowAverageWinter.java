// by Samuel Dunny

import java.util.*;
public class ABelowAverageWinter {

	public static void main(String[] args) {
		
		System.out.println("Welcome to the below average temperature tester program.\n");
		Scanner keyboard = new Scanner(System.in);
		
		int num_of_days = 10;
		int tot_sum = 0;
		
		// create array for double values
		double temperatures[] = new double[num_of_days];
		
		// take in values
		for(int i = 0; i < num_of_days; i++) {
			System.out.println("Please enter the temperature for day " + (i+1));
			double temp = keyboard.nextDouble();
			temperatures[i] = temp;
			tot_sum += temp;
		}
		
		// calculate average (need to typecast the day amiunt to achieve correct division result)
		double average = tot_sum/(double)num_of_days;
		System.out.println("\nThe average temperature was " + average);
		
		System.out.println("The days that were below average were");
		for(int i = 0; i < num_of_days; i++) {
			if (temperatures[i] < average)
				System.out.println("Day " + (i+1) + " with " + temperatures[i]);
		}
		
		keyboard.close();
	}

}
