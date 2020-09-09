package homework1;

import java.util.Scanner;

public class NameRequest3 {                     // Задание 5.3
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String name = in.nextLine();

        switch (name){
            case "Вася":
                System.out.println("Привет!");
                System.out.println("Я тебя так долго ждал.");
                break;

            case "Анастасия":
                System.out.println("Я тебя так долго ждал.");
                break;

            default:
                System.out.println("Добрый день, а вы кто?");
        }

        in.close();
    }
}