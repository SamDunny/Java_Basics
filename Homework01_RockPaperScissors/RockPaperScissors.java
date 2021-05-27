// by Sam Dunny

import java.util.*;
public class RockPaperScissors {

    public static void main(String[] args) {
        
        // welcome prompt
        System.out.println("Welcome to Rock Paper Scissors!  Best 2 out of 3!");

        // create scanner for keyboard
        Scanner keyboard = new Scanner(System.in);

        // create new Random for computer selection
        Random random = new Random();

        // play for 3 rounds
        int roundAmt = 3;

        // store all available options for computer choices
        String comp_options[] = {"ROCK", "PAPER", "SCISSORS"};

        // game loop condition
        boolean gameRunning = true;

        // game runs as long as player wishes to play
        while (gameRunning) {

            // initialize user and computer win counters
            int usrWinAmt = 0;
            int compWinAmt = 0;

            // each game runs 3 times
            for (int i  = 0; i < roundAmt; i++) {

                // game prompt
                System.out.println("\nEnter \"Rock\", \"Paper\", or \"Scissors\"");

                // randomly chooses an index from the computer options
                int rand_ind = random.nextInt(comp_options.length);

                // store the computer's "throw"
                String comp_throw = comp_options[rand_ind];

                // capture user input
                String usr_inp = keyboard.nextLine();

                // initialize the user's throw
                String usr_throw = "";

                // user entered a valid option, set usr_throw and decide winner
                if (usr_inp.equalsIgnoreCase("ROCK") ||
                    usr_inp.equalsIgnoreCase("PAPER") ||
                    usr_inp.equalsIgnoreCase("SCISSORS")) {
                        // set to upper for simplicity in comparing
                        usr_throw = usr_inp.toUpperCase();

                        // computer and user threw same hand, tie, no points awarded
                        if (usr_throw.equals(comp_throw)) {
                            System.out.println(usr_throw + " vs. " + comp_throw + "! Tie!");
                        }

                        // user had the winning hand
                        else if (usr_throw.equals("ROCK") && comp_throw.equals("SCISSORS") ||
                                    usr_throw.equals("PAPER") && comp_throw.equals("ROCK") ||
                                    usr_throw.equals("SCISSORS") && comp_throw.equals("PAPER")) {
                            System.out.println(usr_throw + " vs. " + comp_throw + "! Player wins!");

                            // add to user win amount
                            usrWinAmt++;
                        }

                        // computer had the winning hand
                        else if (usr_throw.equals("ROCK") && comp_throw.equals("PAPER") ||
                                    usr_throw.equals("PAPER") && comp_throw.equals("SCISSORS") ||
                                    usr_throw.equals("SCISSORS") && comp_throw.equals("ROCK")) {
                            System.out.println(usr_throw + " vs. " + comp_throw + "! Computer wins!");

                            // add to computer win amount
                            compWinAmt++;
                        }

                        // an error has occured
                        else {
                            System.out.println("CRITICAL ERROR: invalid options by either player or user");
                            System.out.println("Player throw:" + usr_throw + "\t Computer throw:" + comp_throw);
                        }
                        
                }
                else {
                    // invalid message
                    System.out.println("Your options are \"Rock\", \"Paper\", and \"Scissors\"");
                    System.out.println("Not a valid input! Computer wins");
                    
                    // add to computer win amount
                    compWinAmt++;
                }

                // report win statistics
                System.out.println("Player has won " + usrWinAmt + " times and the computer has won " + compWinAmt + " times");
            }

            // report winner after game conclusion
            if (usrWinAmt > compWinAmt) {
                System.out.println("The Player wins!");
            }
            else if (compWinAmt > usrWinAmt) {
                System.out.println("The Computer wins!");
            }
            else {
                System.out.println("Player and Computer are tied!");
            }

            // ask player if they wish to continue to another game
            System.out.println("Play again? \"Yes\" or \"No\"");
            String player_resp = keyboard.nextLine();

            // user response is not valid, keep asking
            while (!(player_resp.equalsIgnoreCase("Yes")) &&  !(player_resp.equalsIgnoreCase("No"))) {
                System.out.println("Play again? \"Yes\" or \"No\"");
                player_resp = keyboard.nextLine();
            }

            // quit game
            if (player_resp.equalsIgnoreCase("No")) {
                gameRunning = false;
            }
        }

        // exit message
        System.out.println("\nThank you for playing! Goodbye!\n");

        // close scanner
        keyboard.close();
    } 
}
