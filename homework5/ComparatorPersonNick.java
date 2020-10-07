package homework5;

import java.util.Comparator;

public class ComparatorPersonNick implements Comparator<Person> {       // Задание 2

    @Override
    public int compare(Person p1, Person p2) {
        return p1.getNick().compareTo(p2.getNick());
    }
}
