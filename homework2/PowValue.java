package homework2;

import java.util.Scanner;

public class PowValue {                         // Задание 1.3
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число, возводимое в степень (допустимые варианты: целое/дробное, положительное/отрицательное)");

        if (in.hasNextInt()) {
            int valueInt = in.nextInt();
        } else if (in.hasNextDouble()) {
            double valueDbl = in.nextDouble();
        } else {
            System.out.println("Вы ввели недопустимое значение");
        }

        System.out.println("Введите степень (целое положительное число)");
        int powValue = in.nextInt();

        //int result = (int) Math.pow(valueInt, powValue);
        //System.out.println(valueInt + " в степени " + powValue + " равно " + result);
    }
}
