package homework4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class WeekCounterMain {
    public static void main(String[] args) {
        int days;
        String weeks;

        Scanner in = new Scanner(System.in);

        try {
            do {
                System.out.print("Введите целое число (для выхода введите 0): ");
                days = in.nextInt();
                weeks = WeekCounter.toWeek(days);
                System.out.println(weeks);
            } while (days != 0);

            System.out.print("Программа завершена");
        } catch (InputMismatchException e) {
            System.out.println("Недопустимое значение " + e.getMessage());
            System.out.print("Программа завершена");
        }
    }
}
