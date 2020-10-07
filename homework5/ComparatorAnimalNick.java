package homework5;

import java.util.Comparator;

public class ComparatorAnimalNick implements Comparator<Animal> {           // Задание 2

    @Override
    public int compare(Animal a1, Animal a2) {
        return a1.getNick().compareTo(a2.getNick());
    }
}
