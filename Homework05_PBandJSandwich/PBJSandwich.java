// by Sam Dunny

public class PBJSandwich {
    
    // Instance variables
    private Bread topSlice;
    private PeanutButter pb;
    private Jelly j;
    private Bread bottomSlice;

    // Default variables
    private Bread DEF_topSlice = new Bread();
    private PeanutButter DEF_pb = new PeanutButter();
    private Jelly DEF_j = new Jelly();
    private Bread DEF_bottomSlice = new Bread();

    // Default constructor
    public PBJSandwich() {
        this.topSlice = DEF_topSlice;
        this.pb = DEF_pb;
        this.j = DEF_j;
        this.bottomSlice = DEF_bottomSlice;
    }

    // Parameterized constructor omitted, as it would be redundant in front end

    // Accessors
    public Bread getTopSlice() {
        return this.topSlice;
    }
    public PeanutButter getPeanutButter() {
        return this.pb;
    }
    public Jelly getJelly() {
        return this.j;
    }
    public Bread getBottomSlice() {
        return this.bottomSlice;
    }

    // Mutators
    public void setTopSlice(String aName, int aCal, String aType) {
        this.topSlice = new Bread(aName, aCal, aType);
    }
    public void setPeanutButter(String aName, int aCal, boolean crunchCond) {
        this.pb = new PeanutButter(aName, aCal, crunchCond);
    }
    public void setJelly(String aName, int aCal, String aType) {
        this.j = new Jelly(aName, aCal, aType);
    }
    public void setBottomSlice(String aName, int aCal, String aType) {
        this.bottomSlice = new Bread(aName, aCal, aType);
    }

    // Equals method, to compare sandwiches to one another
    public boolean Equals(PBJSandwich other) {
        if (this.topSlice.Equals(other.getTopSlice()) &&
            this.pb.Equals(other.getPeanutButter()) &&
            this.j.Equals(other.getJelly()) &&
            this.bottomSlice.Equals(other.getBottomSlice()))
                return true;
        return false;
    }

    // Prints all values of this sandwich
    public String toString() {
        return "\nTop Slice:\t\t" + this.topSlice.toString() + 
                "\nPeanut Butter:\t\t" + this.pb.toString() + 
                "\nJelly:\t\t\t" + this.j.toString() + 
                "\nBottom Slice:\t\t" + this.bottomSlice.toString() + "\n";
    }
}
