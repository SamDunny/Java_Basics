// by Sam Dunny

import java.util.Scanner;
public class CoffeeTester {
    
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Let’s Coffee!!!1!11!!ONE!!!1!");
        
        //first coffee
        Coffee coffee1 = new Coffee();
        System.out.println("\nWhat's the name of the first coffee?");
        coffee1.setName(keyboard.nextLine());
        System.out.println("Whats the caffeine content?");
        coffee1.setContent(keyboard.nextDouble());
        
        //second coffee
        Coffee coffee2 = new Coffee();
        System.out.println("What's the name of the second coffee?");
        keyboard.nextLine();//had to put this lone here so it would read the previous line
        coffee2.setName(keyboard.nextLine()); 
        System.out.println("Whats the caffeine content?");
        coffee2.setContent(keyboard.nextDouble());
        
        //calling the aRiskyAmount method
        System.out.println("It would take "+coffee1.getRiskyAmount()+" "+coffee1.getName()+" coffees before it's dangerous to drink more.");
        System.out.println("It would take "+coffee2.getRiskyAmount()+" "+coffee2.getName()+" coffees before it's dangerous to drink more.");
    
        // exit message
        System.out.println("\nLater Tater");

        keyboard.close();
    }
}