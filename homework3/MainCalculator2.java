package homework3;

public class MainCalculator2 {                                          // Задание 5
    public static void main(String[] args) {
        CalculatorWithMathCopy clcCop = new CalculatorWithMathCopy();
        double result = clcCop.sum(clcCop.sum(4.1, clcCop.multy(15, 7)), clcCop.pow((clcCop.diagonal(28, 5)), 2));
        System.out.printf("%.3f\n", result);
        System.out.println(result / 0);
        System.out.println(result / 0.0d);
    }
}
