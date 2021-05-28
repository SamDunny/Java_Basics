// by Sam Dunny

public class PBJFrontEnd {

    public static void main(String[] args) {

        System.out.println("-----------------------------------\n" + 
                            "Welcome to the PBJ Sandwich Maker!\n" + 
                            "-----------------------------------\n");

        // create default sandwiches
        PBJSandwich pb1 = new PBJSandwich();
        PBJSandwich pb2 = new PBJSandwich();

        /*
        // print out default values for manual inspection
        System.out.println(pb1.toString());
        System.out.println(pb2.toString());
        */

        // ensure that default sandwich states are equal
        System.out.println("Default Sandwiches are equal: " + pb1.Equals(pb2));

        // initialize sandwich 1 with all valid values
        System.out.println("\n-----Sandwich 1-----");
        pb1.setBottomSlice("Sara Lee", 176, "Honey Wheat");
        pb1.setPeanutButter("JIF", 258, true);
        pb1.setJelly("Smuckers", 98, "Strawberry");
        pb1.setTopSlice("Sara Lee", 176, "Honey Wheat");

        // print out values for manual inspection
        System.out.println(pb1.toString());

        // initialize sandwich 2 with all invalid values
        System.out.println("\n-----Sandwich 2-----");
        pb2.setBottomSlice("", 2000, "Tire remnants");
        pb2.setPeanutButter("", 3000, true);
        pb2.setJelly("", 2000, "Puddle water");
        pb2.setTopSlice("", 2000, "Tire remnants");

        // print out values for manual inspection
        System.out.println(pb2.toString());

        // ensure that sandwiches are now not equal
        System.out.println("Sandwiches are equal: " + pb1.Equals(pb2));

        // exit message
        System.out.println("\n-----------------------------------\n" + 
                           "            Come Again!\n" + 
                           "-----------------------------------\n");

    }
}