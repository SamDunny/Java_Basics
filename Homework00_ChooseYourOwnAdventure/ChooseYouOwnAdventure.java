// by Sam Dunny

import java.util.*;
public class ChooseYouOwnAdventure {
	
	/* contains 15 different endings
	 * 5 successful endings
	 * 10 failed endings
	 */

	public static void main(String[] args) {
		
		System.out.println("Welcome to a Choose Your Own Adventure! Try to make it the END, and don't DIE");
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("You can go left, right, or center. Enter \"left\", \"right\", or \"center\"");
		String choice1 = keyboard.nextLine();
		
		// first branch, uses string comparison for options
		if (choice1.equalsIgnoreCase("left")) {
			System.out.println("You chose \"" + choice1 + "\". The END is one step away!");
			System.out.println("You must eat one of the following options: a hotdog, a salad, or something unknown");
			System.out.print("Enter \"hotdog\", \"salad\", or \"unknown\"\n");
			String choice2 = keyboard.nextLine();
			if (choice2.equalsIgnoreCase("hotdog")) {
				System.out.println("The hotdog originated from New York, and is therefore poisonous. You DIE");
				// ENDING 1 (2 choice)
				System.out.println("The END (failed)");
			}
			else if (choice2.equalsIgnoreCase("salad")) {
				System.out.println("The salad turned out to be grass and a single leaf. You become malnutritioned, and you DIE");
				// ENDING 2 (2 choice)
				System.out.println("The END (failed)");
			}
			else if (choice2.equalsIgnoreCase("unknown")) {
				System.out.println("The \"unknown\" option was actually the Elixir of Everlasting Life. You are rewarded for your courage, and you LIVE");
				// ENDING 3 (2 choice)
				System.out.println("The END (successful)");
			}
			// invalid entry
			else {
				System.out.println("You chose \"" + choice2 + "\". Unfortunately, you're a dumb-dumb and you DIE.");
				// ENDING 4 (2 choice)
				System.out.println("The END (failed)");
			}	
		}
		
		
		// second branch, uses numeric comparison for options
		else if (choice1.equalsIgnoreCase("right")) {
			System.out.println("You chose \"" + choice1 + "\". The END is one step away!");
			System.out.println("You must roll the Gambler's Dice. It is 7 sided, and definitely not loaded");
			Random rand = new Random();
			int upperVal = 7;
			int roll = rand.nextInt(upperVal) + 1;
			System.out.print("You have rolled " + roll);
			if (roll % 2 == 0) {
				System.out.print("...an unfortunate number. The Gambler's Dice catch on fire, and you DIE\n");
				// ENDING 5 (2 choices)
				System.out.println("The END (failed)");
			}
			else if (roll == 7){
				System.out.print(". A dangerous number. The Gambler's Dice disappear, and you are allowed to LIVE. For now...\n");
				// ENDING 6 (2 choices)
				System.out.println("The END (successful)");
			}
			else {
				System.out.print(". A good roll, by all accounts. The Gambler's Dice stay, waiting for another victim. You LIVE\n");
				// ENDING 7 (2 choices)
				System.out.println("The END (successful)");
			}
		}
		
		// third branch, uses compound boolean expressions, as well as 3-choice endings
		else if (choice1.equalsIgnoreCase("center")) {
			System.out.println("You chose \"" + choice1 + "\". The END is two steps away!");
			System.out.println("Side question, can you swim?");
			System.out.println("Enter \"Yes\" or \"No\"");
			String choice3 = keyboard.nextLine();
			System.out.println("You approach a lake. You can either go around it, or through it.");
			System.out.println("Enter \"around\" or \"through\"");
			String choice4 = keyboard.nextLine();
			if (choice4.equalsIgnoreCase("around")) {
				System.out.println("You chose \"" + choice4 + "\". The END is one step away!");
				System.out.println("As you traverse the lake's circumference, night falls. Do you keep travelling, or make camp?");
				System.out.println("Enter \"travel\" or \"camp\"");
				String choice5 = keyboard.nextLine();
				if (choice3.equalsIgnoreCase("yes") && choice5.equalsIgnoreCase("travel")) {
					System.out.println("You made an unwise choice to travel at night, and something mysterious draws you to the water. Even though you can swim, you are eaten by the Creature of the lake. You DIE");
					// ENDING 8 (3 choices)
					System.out.println("The END (failed)");
				}
				else if (choice3.equalsIgnoreCase("no") && choice5.equalsIgnoreCase("travel")) {
					System.out.println("You made an unwise choice to travel at night, and something mysterious draws you to the water. You cannot swim, you drown, and you DIE");
					// ENDING 9 (3 choices)
					System.out.println("The END (failed)");
				}
				else if (choice5.equalsIgnoreCase("camp")) {
					System.out.println("You made a wise decision. The lake is known to have a strong...influence, at night. You LIVE");
					// ENDING 10 (3 choices)
					System.out.println("The END (successful)");
				}
			}
			else if (choice4.equalsIgnoreCase("through")) {
				System.out.println("You chose \"" + choice4 + "\". The END is one step away!");
				System.out.println("You can attempt to make a boat to cross, or simply swim");
				System.out.println("Enter \"boat\" or \"swim\"");
				String choice6 = keyboard.nextLine();
				if (choice6.equalsIgnoreCase("boat")) {
					System.out.println("You make the boat, and are able to sail smoothly across the water. Best to let the Creature underneath sleep. You LIVE");
					// ENDING 11 (3 choices)
					System.out.println("The END (successful)");
				}
				else if (choice6.equalsIgnoreCase("swim")) {
					System.out.println("You decide to swim, which was an unwise decision. Your movements wake the Creature, which devours you. You DIE");
					// ENDING 12 (3 choices)
					System.out.println("The END (failed)");
				}
				else {
					System.out.println("You chose \"" + choice6 + "\". In your indecision, you are lured to the lake and eaten by it's Creature. You DIE");
					// EDNING 13 (3 choices)
					System.out.println("The END (failed)");
				}
			}
			else {
				System.out.println("You chose \"" + choice4 + "\". Unfortunately, that wasn't an option, and you have a heart attack (or something, I don't know). You DIE");
				// ENDING 14 (2 choices)
				System.out.println("The END (failed)");
			}
		}
		
		// invalid entry
		else {
			// ENDING 15 (1 choice)
			System.out.println("You chose an invalid direction, and you DIED");
		}
		
		// Exit
		keyboard.close();
		System.out.println("GAME OVER");
		System.exit(0);
	}

}
