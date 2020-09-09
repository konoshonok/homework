package homework1;

public class Priorities {                       // Задание 2
    public static void main(String[] args){
        int a = 5;
        int b = 2;
        int c = 8;
        int d = 7;
        int e = 20;
        int f = 68;
        int g = 22;
        int h = 6;
        int i = 3;
        int j = 12;
        int k = 119;
        boolean l = true;
        boolean m = false;
        System.out.println(a + b / c); // Результат = 5. Деление, сложение. Тип int - дробная часть отбрасывается.
        System.out.println((a + b) / c); // Результат = 0. Скобки, деление.
        System.out.println((a + b++) / c); // Результат = 0. Сложение в скобках, инкремент в память, деление.

        b = 2;
        System.out.println((a + b++) / --c); // Результат = 1. Сложение в скобках, инкремент в память, декремент, деление.

        b = 2;
        c = 8;
        System.out.println((a * b >> b++) / --c); // Результат = 0. Произведение в скобках, инкремент в память, сдвиг вправо, декремент, деление.

        b = 2;
        c = 8;
        System.out.println((a + d > e ? f : g * b >> b++) / --c); // Результат = 1. Условие в тернарном опереторе = false, выполняется второй блок: произведение, инкремент в память, сдвиг вправо, декремент, деление.

        b = 2;
        c = 8;
        //System.out.println((a + d > e ? f >= f : g * b >> b++) / --c); // Ошибка из-за различных типов операндов ((boolean ? boolean : int) / int).

        b = 2;
        c = 8;
        System.out.println(h - b > i && j * j <= k); // Результат = false. true && false = false.
        System.out.println(l && m); // Результат = false. true && false = false.
    }
}
