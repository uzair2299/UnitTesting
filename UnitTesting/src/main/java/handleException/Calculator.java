package handleException;

public class Calculator {
    public double divide(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return numerator / denominator;
    }
}
