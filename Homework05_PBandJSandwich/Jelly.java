// by Sam Dunny

public class Jelly {
    
    // Instance variables
    private String name;
    private int calories;
    private String fruitType;

    // Default variables
    private String DEF_name = "Default";
    private int DEF_calories = 150;
    private String DEF_fruitType = "Grape";

    // Default constructor
    public Jelly() {
        this.name = DEF_name;
        this.calories = DEF_calories;
        this.fruitType = DEF_fruitType;
    }

    // Parameterized constructor
    public Jelly(String aName, int aCal, String aType) {
        this.setName(aName);
        this.setCalories(aCal);
        this.setFruitType(aType);
    }

    // Accessors
    public String getName() {
        return this.name;
    }
    public int getCalories() {
        return this.calories;
    }
    public String getFruitType() {
        return this.fruitType;
    }

    // Mutators
    public void setName(String aName) {
        if (aName != null && aName.length() != 0)
            this.name = aName;
        else {
            System.out.println("INVALID name parameter [" + aName + "], using DEFAULT " + DEF_name);
            // need this if default is never set
            this.name = DEF_name;
        }
    }
    public void setCalories(int aCal) {
        if (aCal >= 50 && aCal <= 200)
            this.calories = aCal;
        else {
            System.out.println("INVALID calorie parameter [" + aCal + "], using DEFAULT " + DEF_calories);
            // need this if default is never set
            this.calories = DEF_calories;
        }
    }
    public void setFruitType(String aType) {
        if (aType.equalsIgnoreCase("Apple") ||
            aType.equalsIgnoreCase("Blueberry") ||
            aType.equalsIgnoreCase("Grape") ||
            aType.equalsIgnoreCase("Strawberry") ||
            aType.equalsIgnoreCase("Tomato"))
                this.fruitType = aType;
        else {
            System.out.println("INVALID type parameter, using DEFAULT " + DEF_fruitType);
            // need this if default is never set
            this.fruitType = DEF_fruitType;
        }
    }

    // Equals method, to compare jellies to one another
    public boolean Equals(Jelly other) {
        if (this.name.equalsIgnoreCase(other.getName()) &&
            this.calories == other.getCalories() && 
            this.fruitType.equalsIgnoreCase(other.getFruitType()))
                return true;
        return false;
    }

    // Prints all values of this jelly
    public String toString() {
        return "Name: " + this.getName() + "\tCalories: " + this.getCalories() + "\tFruit Type: " + this.getFruitType();
    }
}
