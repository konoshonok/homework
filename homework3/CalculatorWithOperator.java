package homework3;

public class CalculatorWithOperator {                   // Задание 1
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
        double result = 1.0;
        for (int i = 1; i <= powValue; i++) {
            result = result * value;
        }
        return result;
    }

    public double mod(double a) {
        double result;
        if (a > 0) {
            result = a;
        } else {
            result = -a;
        }
        return result;
    }

    public double sqr(double a) {                       // добавлен для работы класса CalculatorWithCounter
        return Math.sqrt(a);
    }
}

