package homework2;

public class MultiplicationTable {                                  // Задание 1.5
    public static void main(String[] args) {
        int a = 2;
        int n = 1;

        while (a < 10) {
            while (n < 11) {
                System.out.println(a + " x " + n + " = " + a*n);
                n++;
            }
            n = 1;
            a++;
        }
    }
}
