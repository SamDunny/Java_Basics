// by Sam Dunny

public class PeanutButter {
    
    // Instance variables
    private String name;
    private int calories;
    private boolean isCrunchy;

    // Default variables
    private String DEF_name = "Default";
    private int DEF_calories = 200;
    private boolean DEF_isCrunchy = false;

    // Default constructor
    public PeanutButter() {
        this.name = DEF_name;
        this.calories = DEF_calories;
        this.isCrunchy = DEF_isCrunchy;
    }

    // Parameterized constructor
    public PeanutButter(String aName, int aCal, boolean crunchCond) {
        this.setName(aName);
        this.setCalories(aCal);
        this.setIsCrunchy(crunchCond);
    }

    // Accessors
    public String getName() {
        return this.name;
    }
    public int getCalories() {
        return this.calories;
    }
    public boolean getIsCrunchy() {
        return this.isCrunchy;
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
        if (aCal >= 100 && aCal <= 300)
            this.calories = aCal;
        else {
            System.out.println("INVALID calorie parameter [" + aCal + "], using DEFAULT " + DEF_calories);
            // need this if default is never set
            this.calories = DEF_calories;
        }
    }
    public void setIsCrunchy(boolean cond) {
        this.isCrunchy = cond;
    }

    // Equals method, to compare peanut butters to one another
    public boolean Equals(PeanutButter other) {
        if (this.name.equalsIgnoreCase(other.getName()) &&
            this.calories == other.getCalories() && 
            this.isCrunchy == other.getIsCrunchy())
                return true;
        return false;
    }

    // Prints all values of this peanut butter
    public String toString() {
        return "Name: " + this.getName() + "\tCalories: " + this.getCalories() + "\tIs Crunchy: " + this.getIsCrunchy();
    }
}
