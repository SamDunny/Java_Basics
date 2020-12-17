// by Samuel Dunny

// using for keyboard and random
import java.util.*;
public class DiceRoll {

	public static void main(String[] args) {
		
		System.out.println("Enter the number of times a 6 sided die should be rolled");
		
		// create random number generator
		Random rand = new Random();
		
		// set upper bound for roll value
		int upperbound = 6;
		
		// create scanner object
		Scanner keyboard = new Scanner(System.in);
		int usr_input = keyboard.nextInt();
		
		// check user input
		if (usr_input <= 0) {
			System.out.println("Invalid input (expecting non-zero positive INT)");
			System.exit(1);
		}
		
		// tally variables
		int one_per 	= 0;
		int two_per 	= 0;
		int three_per 	= 0;
		int four_per 	= 0;
		int five_per 	= 0;
		int six_per 	= 0;
		
		// "roll" dice specified amount
		for (int i = 0; i < usr_input; i++) {
			// +1 to modify values from 0-5 to 1-6
			int rand_roll = rand.nextInt(upperbound) + 1;
			System.out.println(rand_roll + " was rolled");
			
			// keep count of roll percentages
			if (rand_roll == 1)
				one_per++;
			else if (rand_roll == 2)
				two_per++;
			else if (rand_roll == 3)
				three_per++;
			else if (rand_roll == 4)
				four_per++;
			else if (rand_roll == 5)
				five_per++;
			else if (rand_roll == 6)
				six_per++;
			else {
				System.out.println("Error with toll value");
				System.exit(1);
			}
		}
		
		// display results
		System.out.println("One:\t" 	+ one_per);
		System.out.println("Two:\t" 	+ two_per);
		System.out.println("Three:\t" 	+ three_per);
		System.out.println("Four:\t" 	+ four_per);
		System.out.println("Five:\t" 	+ five_per);
		System.out.println("Six:\t" 	+ six_per);
		
		keyboard.close();
	}
}
