package homework6;

import java.util.Comparator;

public class PersonComparatorPass implements Comparator<Person> {       // Задание 2.1

    @Override
    public int compare(Person p1, Person p2) {
        return p1.getPassword().length() - p2.getPassword().length();
    }
}