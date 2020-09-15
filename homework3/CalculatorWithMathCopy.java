package homework3;

public class CalculatorWithMathCopy {                       // Задание 3, 4
    public double sum(double a, double b) {
        return a + b;
    }

    public double minus(double a, double b) {
        return a - b;
    }

    public double multy(double a, double b) {
        return a * b;
    }

    public double diagonal(double a, double b) {
        return a / b;
    }

    public double pow(double value, int powValue) {
        return Math.pow(value, powValue);
    }

    public double mod(double a) {
        return Math.abs(a);
    }

    public double sqr(double a) {
        return Math.sqrt(a);
    }
}
