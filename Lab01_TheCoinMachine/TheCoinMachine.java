// by Samuel Dunny

import java.util.*;
public class TheCoinMachine {

	public static void main(String[] args) {
		
		System.out.println("Enter a whole number from 1 to 99. The machine will determine a combination of coins.");
		Scanner keyboard = new Scanner(System.in);
		
		int usr_input = keyboard.nextInt();
		int total_val = usr_input;
		
		int q_rem = total_val % 25;
		int num_quarters = (total_val - q_rem)/25;
		
		int d_rem = q_rem % 10;
		int num_dimes = (q_rem - d_rem)/10;
		
		int n_rem = d_rem % 5;
		int num_nickels = (d_rem - n_rem)/5;
		
		int num_pennies = n_rem;
		
		System.out.println(usr_input 	+ " in coins:");
		System.out.println(num_quarters + " quarters");
		System.out.println(num_dimes 	+ " dimes");
		System.out.println(num_nickels 	+ " nickels");
		System.out.println(num_pennies 	+ " pennies");
		
		keyboard.close();
	}
}
