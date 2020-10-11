package homework6;

import java.util.Comparator;

public class PersonComparatorPassAndNick implements Comparator<Person> {            // Задание 2.2

    @Override
    public int compare(Person p1, Person p2) {
        if (p1.getPassword().length() != p2.getPassword().length()) {
            return p1.getPassword().length() - p2.getPassword().length();
        } else {
            return p1.getNick().compareTo(p2.getNick());
        }
    }
}