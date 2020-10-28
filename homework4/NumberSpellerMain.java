package homework4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberSpellerMain {
    public static void main(String[] args) {
        int number;

        Scanner in = new Scanner(System.in);

        try {
            do {
                System.out.print("Введите целое число от -999_999_999 до +999_999_999 (для выхода введите 0): ");

                number = in.nextInt();

                System.out.println(NumberSpeller.spellIt(number));
            } while (number != 0);

            System.out.println("Был рад помочь! До свидания!");
        } catch (InputMismatchException e) {
            System.out.println("Недопустимое значение");
        }
    }
}