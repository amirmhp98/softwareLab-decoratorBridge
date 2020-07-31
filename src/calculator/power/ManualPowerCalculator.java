package calculator.power;

import calculator.mult.MultCalculator;

public class ManualPowerCalculator extends PowerCalculator {

	public ManualPowerCalculator(MultCalculator multCalculator) {
		super(multCalculator);
	}

	@Override
	public int pow(int a, int b) {
		return 0;
	}


}
