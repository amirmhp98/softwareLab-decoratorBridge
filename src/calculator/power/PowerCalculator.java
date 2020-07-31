package calculator.power;

import calculator.mult.MultCalculator;

public abstract class PowerCalculator {

	MultCalculator multCalculator;

	public abstract int pow(int a, int b);

	public PowerCalculator(MultCalculator multCalculator) {
		this.multCalculator = multCalculator;
	}
}
