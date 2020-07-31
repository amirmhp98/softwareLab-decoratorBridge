package calculator.mult;

public class ManualMultCalculator extends MultCalculator {
	@Override
	public int multiply(int a, int b) {
		int result = 0;
		for (int i = 0; i < b; i++) {
			result+=a;
	}
		return result;
	}
}
