package homework5;

import java.util.Comparator;

public class ComparatorAnimalAge implements Comparator<Animal> {        // Задание 2.3

    @Override
    public int compare(Animal a1, Animal a2) {
        return a1.getAge() - a2.getAge();
    }
}
