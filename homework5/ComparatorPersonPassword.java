package homework5;

import java.util.Comparator;

public class ComparatorPersonPassword implements Comparator<Person> {       // Задание 2.1

    @Override
    public int compare(Person p1, Person p2) {
        return p1.getPassword().length() - p2.getPassword().length();
    }
}
