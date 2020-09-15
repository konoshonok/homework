package homework3;

public class MainCalculator3 {
    public static void main(String[] args) {
        CalculatorWithMathExtends clcExt = new CalculatorWithMathExtends();
        double result = clcExt.sum(clcExt.sum(4.1, clcExt.multy(15, 7)), clcExt.pow((clcExt.diagonal(28, 5)), 2));
        System.out.printf("%.3f\n", result);
        System.out.println(result / 0);
        System.out.println(result / 0.0d);
    }
}

