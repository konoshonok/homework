package homework2;

public class NumbersMultiplication {                            // Задание 1.2
    public static void main(String[] args) {
        String[] splitArgs = args[0].split("");
        StringBuilder sb = new StringBuilder();
        int result = 1;

        for(int i = 0; i < splitArgs.length; i++) {
            int intValueArg = Integer.parseInt(splitArgs[i]);
            result = result * intValueArg;
            sb.append(intValueArg);
            if (i != splitArgs.length - 1) {
                sb.append("*");
            }
        }

        sb.append("=").append(result);

        System.out.println(sb.toString());
    }
}
