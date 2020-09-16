package homework3;

public class CalculatorWithMathExtends extends CalculatorWithOperator { // Задание 3, 6

    @Override
    public double pow(double value, int powValue) {
        return Math.pow(value, powValue);
    }

    @Override
    public double mod(double a) {
        return Math.abs(a);
    }

    public double sqr(double a) {
        return Math.sqrt(a);
    }
}
