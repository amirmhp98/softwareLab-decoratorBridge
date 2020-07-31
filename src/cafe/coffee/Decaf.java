package cafe.coffee;

import cafe.Beverage;

public class Decaf extends Beverage {

	String description = "Decaf";
	double price = 1.05;

	@Override
	public String getDescription() {
		return "Delicious " + description;
	}

	@Override
	public double cost() {
		return price;
	}
}
