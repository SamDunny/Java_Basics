// by Sam Dunny

public class Bread {
    
    // Instance variables
    private String name;
    private int calories;
    private String type;

    // Default variables
    private String DEF_name = "Default";
    private int DEF_calories = 100;
    private String DEF_type = "White";

    // Default constructor
    public Bread() {
        this.name = DEF_name;
        this.calories = DEF_calories;
        this.type = DEF_type;
    }

    // Parameterized constructor
    public Bread(String aName, int aCal, String aType) {
        this.setName(aName);
        this.setCalories(aCal);
        this.setType(aType);
    }

    // Accessors
    public String getName() {
        return this.name;
    }
    public int getCalories() {
        return this.calories;
    }
    public String getType() {
        return this.type;
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
        if (aCal >= 50 && aCal <= 250)
            this.calories = aCal;
        else {
            System.out.println("INVALID calorie parameter [" + aCal + "], using DEFAULT " + DEF_calories);
            // need this if default is never set
            this.calories = DEF_calories;
        }
    }
    public void setType(String aType) {
        if (aType.equalsIgnoreCase("Honey Wheat") ||
            aType.equalsIgnoreCase("White") ||
            aType.equalsIgnoreCase("Whole Grain") ||
            aType.equalsIgnoreCase("Whole Wheat"))
                this.type = aType;
        else {
            System.out.println("INVALID type parameter [" + aType + "], using DEFAULT " + DEF_type);
            // need this if default is never set
            this.type = DEF_type;
        }
    }

    // Equals method, to compare pieces of bread to one another
    public boolean Equals(Bread other) {
        if (this.name.equalsIgnoreCase(other.getName()) &&
            this.calories == other.getCalories() && 
            this.type.equalsIgnoreCase(other.getType()))
                return true;
        return false;
    }

    // Prints all values of this piece of bread
    public String toString() {
        return "Name: " + this.getName() + "\tCalories: " + this.getCalories() + "\tType: " + this.getType();
    }
}
