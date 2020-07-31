package cafe.condiment;

import cafe.Beverage;

public class Whip extends CondimentDecorator {

	String description = "whip";
	double price = 0.10;

	@Override
	public String getDescription() {
		StringBuilder descriptionBuilder = new StringBuilder();
		descriptionBuilder.append(beverage.getDescription())
				.append(" with ")
				.append(description);
		return descriptionBuilder.toString();
	}

	@Override
	public double cost() {
		return beverage.cost() + price;
	}

	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}
}
