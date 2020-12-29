// by Sam Dunny

public class Apple {
	
	//instance variables
	String type;
	double weight;
	double price;
	
	// default constructor
	public Apple() {
		this.type = "Gala";
		this.weight = 0.0;
		this.price = 0.0;
	}
	
	// parameterized constructor
	public Apple(String aType, double aWeight, double aPrice) {
		setType(aType);
		setWeight(aWeight);
		setPrice(aPrice);
	}
	
	// accessors and mutators
	public String getType() {
		return this.type;
	}
	
	public void setType(String aType) {
		if (aType.equalsIgnoreCase("red delicious") ||
				aType.equalsIgnoreCase("golden delicious") ||
				aType.equalsIgnoreCase("gala") ||
				aType.equalsIgnoreCase("granny smith")) {
			this.type = aType;
		}
		else {
			System.out.println("\"" + aType + "\" was an invalid input, setting to default value");
			this.type = "Gala";
		}
	}
	
	public double getWeight() {
		return this.weight;
	}
	
	public void setWeight(double aWeight) {
		if (aWeight >= 0.0 &&
				aWeight <= 2.0) {
			this.weight = aWeight;
		}
		else {
			System.out.println("\"" + aWeight + "\" was an invalid input, setting to default value");
			this.weight = 0.0;
		}
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public void setPrice(double aPrice) {
		if (aPrice >= 0.0) {
			this.price = aPrice;
		}
		else {
			System.out.println("\"" + aPrice + "\" was an invalid input, setting to default value");
			this.price = 0.0;
		}
	}

	// toString method
	public String toString() {
		String output = "Type: " + this.type + " Weight: " + this.weight + " Price: " + this.price;
		return output;
	}
	
	// equals method
	public boolean equals(Apple other) {
		if (this.type.equalsIgnoreCase(other.getType()) &&
				this.weight == other.getWeight() &&
				this.price == other.getPrice()) {
			return true;
		}
		else
			return false;
	}
	
}
