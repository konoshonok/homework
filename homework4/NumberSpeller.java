package homework4;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Преобразователь числа в пропись
 */
public class NumberSpeller {

    private static final String[][] textMillionsAndThousands = {{"", "", ""},
                                                                {"", "тысяча ", "миллион "},
                                                                {"", "тысячи ", "миллиона "},
                                                                {"", "тысяч ", "миллионов "}};
    private static final String[] textHundreds = {"", "сто ", "двести ", "триста ", "четыреста ", "пятьсот ", "шестьсот ", "семьсот ", "восемьсот ", "девятьсот "};
    private static final String[] textTens = {"", "десять ", "двадцать ", "тридцать ", "сорок ", "пятьдесят ", "шестьдесят ", "семьдесят ", "восемьдесят ", "девяносто "};
    private static final String[] textFrom10To19 = {"десять ", "одиннадцать ", "двенадцать ", "тринадцать ", "четырнадцать ", "пятнадцать ", "шестнадцать ", "семьнадцать ", "восемнадцать ", "девятнадцать "};
    private static final String[] textUnits = {"", "од", "дв", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять"};
    private static final String[][] textFractions = {{"целая ", "сотая"}, {"целых ", "сотых"}};

    private static int number;                       // Число, которое нужно преобразовать
    private static double numberDbl;                 // Число, которое нужно преобразовать
    private static int numberMax = 999_999_999;
    private static int millions;
    private static int thousands;
    private static int toThousands;
    private static int hundreds;
    private static int tens;
    private static int units;
    private static int indexN;                       // Индекс строки массива "textMillionsAndThousands"
    private static int indexFirst;                   // Индекс строки массива "textFractions"
    private static int indexSecond;                  // Индекс строки массива "textFractions"
    private static int firstPart;                    // Целая часть дробного числа
    private static int secondPart;                   // Дробная часть (остаток от деления) дробного числа

    private static String spelledNum;                // Целое число прописью
    private static String spelledNumDbl;             // Дробное число прописью


    /**
     * Метод, который преобразует целое число в пропись
     * @param n число, которое нужно преобразовать
     * @return число прописью
     */
    public static String spellIt(int n) {
        number = n;
        spelledNum = "";

        if (number < -numberMax || number > numberMax) {
            return "Число выходит за пределы допустимых границ";
        }

        if (number < 0) {
            spelledNum = "минус ";
            number = -number;
        }

        if (number == 0 ) {
            return "ноль ";
        }

        // Деление числа на степени и разряды
        millions = number / 1000000;
        thousands = (number - millions * 1000000) / 1000;
        toThousands = number % 1000;
        hundreds = (number - millions * 1000000 - thousands * 1000) / 100;
        tens = (number - millions * 1000000 - thousands * 1000 - hundreds * 100) / 10;
        units = number % 10;

        // Формирование числа прописью
        spelledNum = spelledNum + toThousandSpeller(millions, 2) + toThousandSpeller(thousands, 1) + toThousandSpeller(toThousands, 0);

        return spelledNum;
    }

    /**
     * Метод, который преобразует степени числа
     * @param numericValue степень числа (тысяча, миллион и т.д.)
     * @param index индекс столбца массива "textMillionsAndThousands"
     * @return степень или единицы числа прописью
     */
    private static String toThousandSpeller(int numericValue, int index) {
        hundreds = numericValue / 100;
        tens = (numericValue - hundreds * 100) / 10;
        units = numericValue % 10;

        // Формирование числа без степени (до 1000)
        if (tens == 1) {
            spelledNum = textHundreds[hundreds] + textFrom10To19[units];
        } else {
            spelledNum = textHundreds[hundreds] + textTens[tens] + textUnits[units];
        }

        // Формирование окончаний единиц
        if (index == 1) {
            if (units == 1 && tens != 1) {
                spelledNum = spelledNum + "на ";
            } else if (units == 2 && tens != 1) {
                spelledNum = spelledNum + "е ";
            } else if (units > 2 && tens != 1) {
                spelledNum = spelledNum + " ";
            }
        } else if (units == 1 && tens != 1) {
            spelledNum = spelledNum + "ин ";
        } else if (units == 2 && tens != 1) {
            spelledNum = spelledNum + "а ";
        } else if (units > 2 && tens != 1) {
            spelledNum = spelledNum + " ";
        }

        // Формирование окончаний степеней числа
        indexN = 0;

        if (numericValue != 0) {
            if (units == 1 && tens != 1) {
                indexN = 1;
            } else if (units > 1 && units < 5 && tens != 1) {
                indexN = 2;
            } else {
                indexN = 3;
            }
        }

        // Конкатенация степеней числа
        spelledNum = spelledNum + textMillionsAndThousands[indexN][index];

        return spelledNum;
    }

    /**
     * Метод, который преобразует дробное число в пропись
     * @param n число, которое нужно преобразовать
     * @return число прописью
     */
    public static String spellIt (double n) {
        numberDbl = n;

        firstPart = (int) n;

        BigDecimal bigN = new BigDecimal(n);
        bigN = bigN.setScale(2, RoundingMode.DOWN);

        BigDecimal bigHundred = new BigDecimal(100.00);

        secondPart = (bigN.multiply(bigHundred).remainder(bigHundred)).intValueExact();

        // Формирование окончаний слов "целая", "целых"
        indexFirst = 0;
        if (firstPart % 10 == 1) {
            indexFirst = 0;
        } else {
            indexFirst = 1;
        }

        // Формирование окончаний слов "сотая", "сотых"
        indexSecond = 0;
        if (secondPart % 10 == 1) {
            indexSecond = 0;
        } else {
            indexSecond = 1;
        }

        spelledNumDbl = spellIt(firstPart) + textFractions[indexFirst][0] + spellIt(Math.abs(secondPart)) + textFractions[indexSecond][1];

        return spelledNumDbl;
    }
}