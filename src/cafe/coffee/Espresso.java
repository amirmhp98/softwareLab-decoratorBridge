package cafe.coffee;

import cafe.Beverage;

public class Espresso extends Beverage {


	String description = "Espresso";
	double price = 1.99;

	@Override
	public String getDescription() {
		return "Delicious " + description;
	}

	@Override
	public double cost() {
		return price;
	}
}
