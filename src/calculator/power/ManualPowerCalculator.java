package calculator.power;

import calculator.mult.MultCalculator;

public class ManualPowerCalculator extends PowerCalculator {

	public ManualPowerCalculator(MultCalculator multCalculator) {
		super(multCalculator);
	}

	@Override
	public int pow(int a, int b) {
		int result = 1;
		for (int i = 0; i < b; i++) {
			result*=a;
		}
		return result;
	}


}
