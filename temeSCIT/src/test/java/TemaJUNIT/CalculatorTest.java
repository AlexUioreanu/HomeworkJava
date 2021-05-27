package TemaJUNIT;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testCalculator() {
        Calculator calculator = new Calculator();

        int result = calculator.calculator("10 cm + 1 m - 10 mm");
        assertEquals(1090, result);
    }

    @Test
    public void testCalculator2() {
        Calculator calculator = new Calculator();

        int result = calculator.calculator("1 km + 20 m - 1000 m - 100 cm - 10 mm");
        assertEquals(18990, result);
    }

    @Test
    public void testCalculatorNumarNegativ() {
        Calculator calculator = new Calculator();

        int result = calculator.calculator("1 km + 2 m - 1000 m - 100 cm - 10 mm - 2 km");
        assertEquals(-1999010, result);
    }
}