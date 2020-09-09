package homework2;

import java.util.Scanner;

public class PrintArrayBack1 {                          // Задание 2.3.1
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
        int i = arrayLength - 1;

        do {
            System.out.print(array[i] + " ");
            i--;
        } while (i >= 0);

        in.close();
    }
}