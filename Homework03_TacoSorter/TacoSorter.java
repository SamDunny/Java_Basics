// by Sam Dunny
// implementation not using OOP

import java.util.*;
public class TacoSorter {

    // number of tacos to be entered and sorted
    public static final int NUM_TACOS = 5;
    public static void main(String[] args) {

        // welcome prompt
        System.out.println("Welcome to the taco price sorter! Enter " + NUM_TACOS + " taco names and prices and I'll sort it!");

        // create new scanner
        Scanner keyboard = new Scanner(System.in);

        // initialize two arrays to store names and prices, respectively
        String tacoNames[] = new String[NUM_TACOS];
        double tacoPrices[] = new double[NUM_TACOS];

        // gather all taco names and prices
        for (int i = 0; i < NUM_TACOS; i++) {
            // get the taco name
            System.out.println("Enter the name of taco " + (i+1));
            String this_name = keyboard.nextLine();

            // get the taco price
            System.out.println("Enter taco's price");
            double this_price = keyboard.nextDouble();
            // consume the rest of the buffer and move to the next line
            keyboard.nextLine();

            // store values
            tacoNames[i] = this_name;
            tacoPrices[i] = this_price;
        }

        /*
        // sorting tacos based on price (using bubble sort)
        for (int i = 0; i < NUM_TACOS; i++) {
            for (int j = 1; j < NUM_TACOS; j++) {
                if (tacoPrices[j-1] > tacoPrices[j]) {

                    // swapping the prices in the price array
                    double tempPrice = tacoPrices[j-1];
                    tacoPrices[j-1] = tacoPrices[j];
                    tacoPrices[j] = tempPrice;

                    // swapping the names in the name array
                    String tempName = tacoNames[j-1];
                    tacoNames[j-1] = tacoNames[j];
                    tacoNames[j] = tempName;
                }
            }
        }
        */

        // sorting taocs based on price (using selection sort)
        for (int i = 0; i < NUM_TACOS-1; i++) {
            int index = i;

            for (int j = i+1; j < NUM_TACOS; j++) {  
                if (tacoPrices[j] < tacoPrices[index])
                    //searching for index with lowest price
                    index = j;            
            }

            double temp = tacoPrices[index];   
            tacoPrices[index] = tacoPrices[i];  
            tacoPrices[i] = temp; 
        }

        System.out.println("Sorted Tacos are");
        for (int i = 0; i < NUM_TACOS; i++) {
            System.out.println(tacoNames[i] + "\t$" + tacoPrices[i]);
        }

        keyboard.close();
    }
    
}
