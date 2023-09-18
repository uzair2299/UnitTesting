package handleException;


import org.junit.Test;

import static net.bytebuddy.matcher.ElementMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThrows;

public class CalculatorTest {
    @Test
    public void testDivideByZero() {
        // Create an instance of the Calculator class
        Calculator calculator = new Calculator();

        // Use assertThrows to check for the expected exception
        ArithmeticException exception = assertThrows(ArithmeticException.class, () -> {
            calculator.divide(10.0, 0.0); // This should throw an ArithmeticException
        });

//        assertThat(exception.getClass(),is(equalTo(ArithmeticException.class)))
    }
}
