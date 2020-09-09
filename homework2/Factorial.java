package homework2;

public class Factorial {                            // Задание 1.1
    public static void main(String[] args) {
        int ar = Integer.parseInt(args[0]);
        int fact = 1;
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i < ar; i++) {
            sb.append(i).append("*");
            fact = fact * i;
        }

        fact = fact * ar;

        sb.append(ar).append("=").append(fact);

        System.out.println(sb.toString());
    }
}
