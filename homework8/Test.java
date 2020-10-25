package homework8;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        getRates(new NBRBLoader());
        printRates();
        saveRates();
    }

    static double euro;
    static double ruble;
    static double dollar;

    public static void getRates(SiteLoader loader) {
        euro = loader.load(SiteLoader.Currency.EUR);
        ruble = loader.load(SiteLoader.Currency.RUB);
        dollar = loader.load(SiteLoader.Currency.USD);
    }

    public static void printRates() {
        System.out.println("EUR: " + euro);
        System.out.println("RUB: " + ruble);
        System.out.println("USD: " + dollar);
    }

    public static void saveRates() {
        ArrayList<String> rates = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        String currencyName;

        System.out.println("Выберите вид валюты, курс которой хотите сохранить (если оставить поле пустым, сохранятся все)");
        currencyName = in.nextLine();

        if (currencyName.toLowerCase().contains("eur")) {
            rates.add("EUR: " + euro);
        }

        if (currencyName.toLowerCase().contains("rub")) {
            rates.add("RUB: " + ruble);
        }

        if (currencyName.toLowerCase().contains("usd")) {
            rates.add("USD: " + dollar);
        }

        if (currencyName.equals("")) {
            rates.add("EUR: " + euro);
            rates.add("RUB: " + ruble);
            rates.add("USD: " + dollar);
        }

        System.out.println("Введите имя файла");
        String fileName = in.nextLine();

        System.out.println("Введите путь, куда сохранить файл (если оставить поле пустым, файл сохраниться в директорию по умолчанию)");
        String path = in.nextLine();

       try {
           FileWriter writer;

           if (path == "") {
               writer = new FileWriter(fileName + ".txt");
           } else {
               writer = new FileWriter(path + File.separator + fileName + ".txt");
           }

           writer.write(rates.toString());
           writer.close();
       } catch (IOException e) {
           System.out.println("Недопустимое имя или путь к файлу" + e.getMessage());
       }

       in.close();
   }
}