package homework4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberSpellerMain {
    public static void main(String[] args) {
        int input;
        int numberInt;
        double numberDbl;

        Scanner in = new Scanner(System.in);

        do {
            System.out.print("Выберите тип числа: 1 - целое; 2 - дробное (для выхода введите 0): ");

            input = in.nextInt();

            switch (input) {
                case 1:
                    try {
                        do {
                            System.out.print("Введите целое число от -999_999_999 до +999_999_999 (для выхода в меню введите 0): ");
                            numberInt = in.nextInt();
                            System.out.println(NumberSpeller.spellIt(numberInt));
                        } while (numberInt != 0);
                    } catch (InputMismatchException e) {
                        System.out.println("Недопустимое значение");
                    }
                    break;

                case 2:
                    try {
                        do {
                            System.out.print("Введите дробное число от -999_999_999 до +999_999_999 (для выхода в меню введите 0): ");
                            numberDbl = in.nextDouble();
                            System.out.println(NumberSpeller.spellIt(numberDbl));
                        } while (numberDbl != 0);
                    } catch (InputMismatchException e) {
                        System.out.println("Недопустимое значение");
                    }
                    break;

                default:
                    break;
            }
        } while (input != 0);
    }
}