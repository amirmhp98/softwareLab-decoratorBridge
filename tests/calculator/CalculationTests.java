package calculator;


import cafe.Beverage;
import cafe.coffee.HouseBlend;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculationTests {

    @Test
    void testAutoMultAutoPower() {
        MultCalculator multCalculator = new AutoMultCalculator();
        PowerCalculator powerCalculator = new AutoPowerCalculator(multCalculator);

        Assertions.assertEquals(81, powerCalculator.pow(3,4));
        Assertions.assertEquals(125, powerCalculator.pow(5,3));
    }

    @Test
	void testAutoMultManualPower(){
		MultCalculator multCalculator = new AutoMultCalculator();
		PowerCalculator powerCalculator = new ManualPowerCalculator(multCalculator);

		Assertions.assertEquals(28561, powerCalculator.pow(13,4));
		Assertions.assertEquals(64, powerCalculator.pow(4,3));
	}

	@Test
	void testManualMultAutoPower(){
		MultCalculator multCalculator = new ManualMultCalculator();
		PowerCalculator powerCalculator = new AutoPowerCalculator(multCalculator);

		Assertions.assertEquals(216, powerCalculator.pow(6,3));
		Assertions.assertEquals(1728, powerCalculator.pow(12,3));
	}

	@Test
	void testManualMultManualPower(){
		MultCalculator multCalculator = new ManualMultCalculator();
		PowerCalculator powerCalculator = new ManualPowerCalculator(multCalculator);

		Assertions.assertEquals(49, powerCalculator.pow(7,2));
		Assertions.assertEquals(2744, powerCalculator.pow(14,3));
	}

}
