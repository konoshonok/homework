package homework1;

public class Priorities {                       // Задание 2
    public static void main(String[] args){
        int b = 2;
        int c = 8;

        System.out.println(5 + 2 / 8); // Результат = 5. Деление, сложение. Тип int - дробная часть отбрасывается.
        System.out.println((5 + 2) / 8); // Результат = 0. Скобки, деление.
        System.out.println((5 + b++) / 8); // Результат = 0. Сложение в скобках, инкремент в память, деление.

        b = 2;
        System.out.println((5 + b++) / --c); // Результат = 1. Сложение в скобках, инкремент в память, декремент, деление.

        b = 2;
        c = 8;
        System.out.println((5 * 2 >> b++) / --c); // Результат = 0. Произведение в скобках, инкремент в память, сдвиг вправо, декремент, деление.

        b = 2;
        c = 8;
        System.out.println((5 + 7 > 20 ? 68 : 22 * 2 >> b++) / --c); // Результат = 1. Условие в тернарном опереторе = false, выполняется второй блок: произведение, инкремент в память, сдвиг вправо, декремент, деление.

        b = 2;
        c = 8;
        //System.out.println((5 + 7 > 20 ? 68 >= 68 : 22 * 2 >> b++) / --c); // Ошибка из-за различных типов операндов ((boolean ? boolean : int) / int).

        b = 2;
        c = 8;
        System.out.println(6 - 2 > 3 && 12 * 12 <= 119); // Результат = false. true && false = false.
        System.out.println(true && false); // Результат = false. true && false = false.
    }
}