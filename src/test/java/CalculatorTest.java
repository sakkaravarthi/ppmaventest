import org.example.Calculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setup() {
        calculator = new Calculator();

    }

    @Test
    @DisplayName("Testing addition")
    void testAddition() {
        int result = calculator.add(2,1);
        assertEquals(3,result, " 2 + 1 should equal to 3");

    }
    @Test
    @DisplayName("Testing Subtraction")
    void testSubraction() {
        int result = calculator.subtraction(2,1);
        assertEquals(1,result, " 2 - 1 should equal to 1");

    }

    @Test
    @DisplayName("Testing Division")
    void testDivisionNormalCase() {
        int result = calculator.division(10,2);
        assertEquals(5,result, " 10 / 2 should equal to 5");

    }



}
