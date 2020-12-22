// by Samuel Dunny

import java.util.*;
public class DateAndTimeTester {

	// run function
	// public, as it is the only call-able function in this class from outside
	public void run() {
		Scanner keyboard = new Scanner(System.in);
		while (true) {
			System.out.println("Enter a date and time (MM/DD hh:mm) and I will determine if it is valid");
			String usr_input = keyboard.nextLine();
			if (isValid(usr_input)) {
				System.out.println("The date and time is valid!");
			}
			else {
				System.out.println("The date and time is not valid!");
			}
			System.out.println("Would you like to exit? Type \"quit\" to exit or press [ENTER] to continue");
			
			String response = keyboard.nextLine();
		
			// [ENTER] was pressed
			if (response.isEmpty()) {
				continue;
			}
			// any variation of "quit" was entered
			else if (response.equalsIgnoreCase("quit")) {
				break;
			}
			// exiting on any other input
			else {
				System.out.println("\"" + response + "\"" + " was not a valid input, EXITING");
				break;
			}
		}
		System.out.println("Good Bye");
		keyboard.close();
	}
	
	// isValid function
	private boolean isValid(String inp) {
		String[] inp_split = inp.split("\s");
		
		/*
		// Print out tests
		System.out.println("First Section: " + inp_split[0]);
		System.out.println("Second Section: " + inp_split[1]);
		System.out.println("Valid Date: " + isValidDate(inp_split[0]));
		System.out.println("Valid Time: " + isValidTime(inp_split[1]));
		*/
		
		if (isValidDate(inp_split[0]) && isValidTime(inp_split[1])) {
			return true;
		}	    
		return false;
	}
	
	// isValidDate function
	private boolean isValidDate(String date) {
		int ret_month = getMonth(date);
		int ret_day = getDay(date);
		
		if (ret_month == 1 ||
				ret_month == 3 ||
				ret_month == 5 ||
				ret_month == 7 ||
				ret_month == 8 ||
				ret_month == 10 ||
				ret_month == 12) {
			if (ret_day > 31 ||
					ret_day < 1)
				return false;
		}
		else if (ret_month == 2) {
			if (ret_day > 28 ||
					ret_day < 1)
				return false;
		}
		else if (ret_month == 4 ||
				ret_month == 6 ||
				ret_month == 9 ||
				ret_month ==11) {
			if (ret_day > 30 ||
					ret_day < 1)
				return false;
		}
		else if (ret_month < 1 ||
				ret_month >12) {
			return false;
		}
		return true;
	}
	
	// isValidTime function
	private boolean isValidTime(String time) {
		int ret_hour = getHour(time);
		int ret_minute = getMinute(time);
		
		if (ret_hour > 12 ||
				ret_hour < 1)
			return false;

		if (ret_minute > 59 ||
				ret_minute < 0)
			return false;
		
		return true;
	}
	
	// getMonth function
	private int getMonth(String mmdd) {
		String forward_s = "/";
		String[] date_split = mmdd.split(forward_s);
		int month = Integer.parseInt(date_split[0]);
		//System.out.println("Month: " + month);
		return month;
	}
	
	// getDay function
	private int getDay(String mmdd) {
		String forward_s = "/";
		String[] date_split = mmdd.split(forward_s);
		int day = Integer.parseInt(date_split[1]);
		//System.out.println("Day: " + day);
		return day;
	}
	
	// getHour function
	private int getHour(String hhmm) {
		String[] time_split = hhmm.split(":");
		int hour = Integer.parseInt(time_split[0]);
		//System.out.println("Hour: " + hour);
		return hour;
	}
	
	// getMinute function
	private int getMinute(String hhmm) {
		String[] time_split = hhmm.split(":");
		int minute = Integer.parseInt(time_split[1]);
		//System.out.println("Minute: " + minute);
		return minute;
	}
	
}
