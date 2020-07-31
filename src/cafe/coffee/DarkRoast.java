package cafe.coffee;

import cafe.Beverage;

public class DarkRoast extends Beverage {

	String description = "DarkRoast";
	double price = 0.99;

	@Override
	public String getDescription() {
		return "Delicious " + description;
}

	@Override
	public double cost() {
		return price;
	}
}
