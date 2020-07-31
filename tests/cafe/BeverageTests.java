package cafe;


import cafe.coffee.Espresso;
import cafe.coffee.HouseBlend;
import cafe.condiment.Mocha;
import cafe.condiment.SteamedMilk;
import cafe.condiment.Whip;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BeverageTests {

    @Test
    void testHouseBlend() {
        // Pure HouseBlend
        Beverage beverage = new HouseBlend();
        Assertions.assertEquals("Delicious HouseBlend", beverage.getDescription());
        Assertions.assertEquals(0.89, beverage.cost());
    }

    @Test
    void testEspresso() {
        // Pure Espresso
        Beverage beverage = new Espresso();
        Assertions.assertEquals("Delicious Espresso", beverage.getDescription());
        Assertions.assertEquals(1.99, beverage.cost());
    }

    @Test
    void testHouseBlendWithSteamedMilk() {
        // HouseBlend + SteamedMilk
        Beverage beverage = new SteamedMilk(new HouseBlend());
        Assertions.assertEquals("Delicious HouseBlend with milk", beverage.getDescription());
        Assertions.assertEquals(0.89 + 0.1, beverage.cost());
    }

    @Test
    void testEspressoWithMochaAndWhip() {
        // Espresso + Mocha + Whip
        Beverage beverage = new Whip(new Mocha(new Espresso()));
        Assertions.assertEquals("Delicious Espresso with mocha with whip", beverage.getDescription());
        Assertions.assertEquals(1.99 + 0.2 + 0.10, beverage.cost());
    }

    @Test
    void testEspressoWithDoubleMochaAndWhipAndSteamedMilk() {
        // Espresso + Mocha + Mocha + Whip + SteamedMilk
        Beverage beverage = new SteamedMilk(new Whip(new Mocha(new Mocha(new Espresso()))));
        Assertions.assertEquals("Delicious Espresso with mocha with mocha with whip with milk", beverage.getDescription());
        Assertions.assertEquals(1.99 + 0.2 + 0.2 + 0.1 + 0.1, beverage.cost());
    }
}
