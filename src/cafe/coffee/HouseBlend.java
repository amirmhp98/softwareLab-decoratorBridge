package cafe.coffee;

import cafe.Beverage;

public class HouseBlend extends Beverage {

	String description = "HouseBlend";
	double price = 0.89;

	@Override
	public String getDescription() {
		return "Delicious " + description;
	}

	@Override
	public double cost() {
		return price;
	}
}
