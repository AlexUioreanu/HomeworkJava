package TemaJUNIT;

import java.util.ArrayList;
import java.util.List;

public class CalculatorMain {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.calculator("10 cm + 1 m - 10 mm"));
        System.out.println(calculator.calculator("1 km + 20 m - 1000 m - 100 cm - 10 mm"));
        System.out.println(calculator.calculator("1 km + 2 m - 1000 m - 100 cm - 10 mm - 2 km"));

    }
}

