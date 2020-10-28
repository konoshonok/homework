package homework4;

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
    private static final String[] textFrom10To19 = {"десять", "одиннадцать", "двенадцать", "тринадцать", "четырнадцать", "пятнадцать", "шестнадцать", "семьнадцать", "восемнадцать", "девятнадцать"};
    private static final String[] textUnits = {"", "од", "дв", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять"};

    private static int number;                       // Число для спеллинга
    private static int numberMax = 999_999_999;
    private static int millions;
    private static int thousands;
    private static int toThousands;
    private static int hundreds;
    private static int tens;
    private static int units;
    private static int indexN;

    private static String spelledNum;                // Число прописью


    /**
     * Метод, который преобразует число в пропись
     * @param n число, которое нужно преобразовать
     * @return число прописью
     */
    public static String spellIt(int n) {
        number = n;

        if (number < -numberMax || number > numberMax) {
            return "Число выходит за пределы допустимых границ";
        }

        if (number < 0) {
            spelledNum = "минус ";
            number = -number;
        }

        if (number == 0 ) {
            return "ноль";
        }

        millions = number / 1000000;
        thousands = (number - millions * 1000000) / 1000;
        toThousands = number % 1000;
        hundreds = (number - millions * 1000000 - thousands * 1000) / 100;
        tens = (number - millions * 1000000 - thousands * 1000 - hundreds * 100) / 10;
        units = number % 10;

        spelledNum = toThousandSpeller(millions, 2) + toThousandSpeller(thousands, 1) + toThousandSpeller(toThousands, 0);

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

        // Формируем число до 1000

        if (tens == 1) {
            spelledNum = textHundreds[hundreds] + textFrom10To19[units];
        } else {
            spelledNum = textHundreds[hundreds] + textTens[tens] + textUnits[units];
        }

        // Формируем окончания единиц

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

        // Формируем окончания степеней числа

        indexN = 0;     // индекс строки массива "textMillionsAndThousands"

        if (numericValue != 0) {
            if (units == 1 && tens != 1) {
                indexN = 1;
            } else if (units > 1 && units < 5 && tens != 1) {
                indexN = 2;
            } else {
                indexN = 3;
            }
        }

        spelledNum = spelledNum + textMillionsAndThousands[indexN][index];

        return spelledNum;
    }
}