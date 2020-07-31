package calculator;


import cafe.Beverage;
import cafe.coffee.HouseBlend;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculationTests {

    @Test
    void testA() {
        MultCalculator multCalculatorA = new autoMultCalculator();
        PowerCalculator powerCalculatorA = new autoPowerCalculator(multCalculatorA);

		MultCalculator multCalculatorB = new autoMultCalculator();
		PowerCalculator powerCalculatorB = new autoPowerCalculator(multCalculatorB);

        Assertions.assertEquals("Delicious HouseBlend", beverage.getDescription());
        Assertions.assertEquals(0.89, beverage.cost());
    }

}
