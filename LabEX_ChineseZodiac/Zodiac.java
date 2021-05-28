// by Sam Dunny

import java.util.Scanner;
public class Zodiac {
    
    public static void main(String[] args) {

        // user prompt
        System.out.println("What is your chinese zodiac? Enter your birthyear");

        // gather user input
        Scanner keyboard = new Scanner(System.in);
        int birthyear = keyboard.nextInt();
        
        if (birthyear <= 1924) {
            System.out.println("Thats an invalid year.");
            System.exit(1);
        }
        
        // calculate zodiac number
        int zodiac = (birthyear - 1924)/12;
        
        if (zodiac == 0) {
            System.out.println("You are a Water Rat!");
        }
        else if (zodiac == 1) {
            System.out.println("You are an Earth Ox!");
        }
        else if (zodiac == 2) {
            System.out.println("You are a Wood Tiger!");
        }
        else if (zodiac == 3) {
            System.out.println("You are a Wood Rabbit!");
        }
        else if (zodiac == 4) {
            System.out.println("You are an Earth Dragon!");
        }
        else if (zodiac == 5) {
            System.out.println("You are Fire Snake!");
        }
        else if (zodiac == 6) {
            System.out.println("You are a Fire Horse!");
        }
        else if (zodiac == 7) {
            System.out.println("You are an Earth Goat!");
        }
        else if (zodiac == 8) {
            System.out.println("You are a Metal Monkey!");
        }
        else if (zodiac == 9) {
            System.out.println("You are a Metal Rooster!");
        }
        else if (zodiac == 10) {
            System.out.println("You are an Earth Dog!");
        }
        else if (zodiac == 11) {
            System.out.println("You are a Water Pig!");
        }
        
        // close scanner
        keyboard.close();
  } 
}