// by Sam Dunny

public class Coffee {
    
    // Instance Attributes
    private String name;
    private double content;
    
    // Constructor - default
    public Coffee() {
        this.name = "nothing";
        this.content = 60.0;
    }
    
    // Accessors
    public String getName() {
        return this.name; 
    }
    public double getContent() {
        return this.content; 
    }
  
    // Mutators
    public void setName(String aName) {
        this.name = aName;
    }
    public void setContent(double aContent) {
        if ((aContent >= 50.0) && (aContent <=300.0)) {
            this.content = aContent;
        }
        else
            System.out.println("Invalid Content Amount"); 
    }
    
    //RiskyAmount Method - calculates number of coffees before its dangerous to drink more
    public double getRiskyAmount() {
        return 180 /((content/100)*6);
    } 
}
  
