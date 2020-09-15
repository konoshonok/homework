package homework3;

public class MainCalculator1 {                                               // Задание 2
    public static void main(String[] args) {
        CalculatorWithOperator clc = new CalculatorWithOperator();
        double result = clc.sum(clc.sum(4.1, clc.multy(15, 7)), clc.pow((clc.diagonal(28, 5)), 2));
        System.out.printf("%.3f\n", result);
        System.out.println(result/0);
        System.out.println(result/0.0d);
    }
}