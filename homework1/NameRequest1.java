package homework1;

import java.util.Scanner;

public class NameRequest1 {                     // Задание 5.1
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Введите имя: ");
        String name = in.nextLine();

        if(name.equals("Вася")) {
            System.out.println("Привет!");
            System.out.println("Я тебя так долго ждал.");
        }

        if(name.equals("Анастасия")){
            System.out.println("Я тебя так долго ждал.");
        }

        if(!"Вася".equals(name) & !"Анастасия".equals(name)) {
            System.out.println("Добрый день, а вы кто?");
        }

        in.close();
    }
}