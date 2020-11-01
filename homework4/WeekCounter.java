package homework4;

public class WeekCounter {

    private static int days;
    private static int weeks;
    private static int index;
    private static int numberMax = 2_147_483_647;
    private static String weeksResult;

    private static final String[] textWeeks = {" неделя", " недели", " недель"};

    public static String toWeek(int d) {
        days = d;

        if (days < 0) {
            return "Неверное значение";
        }

        weeks = days / 7;

        if (weeks > 10 && weeks < 20) {
            index = 2;
        } else if (weeks % 10 == 1) {
            index = 0;
        } else if (weeks % 10 > 1 && weeks % 10 < 5) {
            index = 1;
        } else index = 2;

        return weeksResult = weeks + textWeeks[index];
    }
}
