package homework2;

import java.util.Scanner;

public class PrintArrayMain3 {                           // Задание 2.1.3
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите длину массива");
        int arrayLength = in.nextInt();
        int[] array = new int[arrayLength];

        System.out.println("Заполните массив");

        for (int i = 0; i < arrayLength; i++) {
            array[i] = in.nextInt();
        }

        System.out.println("Ваш массив элементов:");

            for (int i = 0; i < arrayLength; i++) {
            System.out.print(array[i] + " ");
        }

        in.close();
    }
}