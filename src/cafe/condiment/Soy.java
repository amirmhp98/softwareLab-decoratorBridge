package cafe.condiment;

import cafe.Beverage;

public class Soy extends CondimentDecorator {

	String description = "soy";
	double price = 0.15;

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

	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}
}
