package cafe.condiment;

import cafe.Beverage;

public class Mocha extends CondimentDecorator {

	protected String description = "mocha";
	protected double price = 0.20;

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

	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}
}
