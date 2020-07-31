package calculator.power;

import calculator.mult.MultCalculator;

public class AutoPowerCalculator extends PowerCalculator {

	public AutoPowerCalculator(MultCalculator multCalculator) {
		super(multCalculator);
	}

	@Override
	public int pow(int a, int b) {
		return 0;
	}

}
