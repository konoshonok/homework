package homework1;

import java.util.Scanner;

public class NameRequest1 {                     // Задание 5.1
    public static void main(String[] args){
        String friend = "Вася";
        String girlfriend = "Анастасия";

        Scanner in = new Scanner(System.in);

        System.out.print("Введите имя: ");
        String name = in.nextLine();

        if(name.equals(friend)) {
            System.out.println("Привет!");
            System.out.println("Я тебя так долго ждал.");
        }

        if(name.equals(girlfriend)){
            System.out.println("Я тебя так долго ждал.");
        }

        if(!friend.equals(name) & !girlfriend.equals(name)) {
            System.out.println("Добрый день, а вы кто?");
        }

        in.close();
    }
}