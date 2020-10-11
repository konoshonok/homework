package homework6;

import java.util.Comparator;

public class AnimalComparatorAgeAndNick implements Comparator<Animal> {           // Задание 2

    @Override
    public int compare(Animal a1, Animal a2) {
        if (a1.getAge() != a2.getAge()) {
            return a1.getAge() - a2.getAge();
        } else {
            return a1.getNick().compareTo(a2.getNick());
        }
    }
}