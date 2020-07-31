package cafe.condiment;

import cafe.Beverage;

public class SteamedMilk extends CondimentDecorator {

	String description = "milk";
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

	public SteamedMilk(Beverage beverage) {
		this.beverage = beverage;
	}
}
