// by Sam Dunnny

public class AppleTester {

	public static void main(String[] args) {
		
		System.out.println("Welcome to the apple tester\n");
		
		// creating default apple
		System.out.println("Creating default apple");
		Apple apple_def = new Apple();
		System.out.println("Printing default apple's values");
		System.out.println(apple_def.toString() + "\n");
		
		// creating apple 2
		System.out.println("Creating another apple");
		Apple apple_one = new Apple("Granny Smith", 0.75, 0.99);
		System.out.println("Setting the new apple's values to the following, valid values");
		System.out.print("\"" + apple_one.getType() + " ");
		System.out.print(apple_one.getWeight() + " ");
		System.out.println(apple_one.getPrice() + "\"");
		System.out.println("Printing the new apple's values");
		System.out.println(apple_one.toString());
		
		// creating apple 1
		System.out.println("\nCreating another default apple");
		Apple apple_two = new Apple();
		System.out.println("Then setting the new apple's values to the following, invalid values");
		System.out.println("\"iPad 2.5 -200\"");
		apple_two.setType("iPad");
		apple_two.setWeight(2.5);
		apple_two.setPrice(-200);
		System.out.println("Printing the newest apple's values which should not have changed from the default values");
		System.out.println(apple_two.toString());
		
		System.out.println("\nChecking if the first and last apple have the same values.");
		System.out.println(apple_def.equals(apple_two));
		
	}

}
