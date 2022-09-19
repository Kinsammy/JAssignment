package tdd;

import Chapter2.Calculator;
import org.junit.jupiter.api.BeforeEach;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

public class CalculatorTest {
    Calculator calculator;
    @BeforeEach
    void startAllWith(){
        calculator  = new Calculator();
    }

    @Test
    public void ifObjectExit(){
        calculator = new Calculator();
        AssertJUnit.assertNotNull(calculator);
    }
}
