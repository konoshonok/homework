package homework5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AnimalMain {                                   // Задание 2.99
    public static void main(String[] args) {

        Animal pet1 = new Animal("Tuzik", 7);
        Animal pet2 = new Animal("Sharik", 3);
        Animal pet3 = new Animal("Pinki", 15);
        Animal pet4 = new Animal("Foxy", 2);
        Animal pet5 = new Animal("Pit", 12);
        Animal pet6 = new Animal("Milo", 12);
        Animal pet7 = new Animal("Pushok", 9);
        Animal pet8 = new Animal("Hulk", 4);

        List<Animal> pets = new ArrayList<>();

        pets.add(pet1);
        pets.add(pet2);
        pets.add(pet3);
        pets.add(pet4);
        pets.add(pet5);
        pets.add(pet6);
        pets.add(pet7);
        pets.add(pet8);

        System.out.println("Исходный: " + pets);

        Comparator petsAgeComp = new ComparatorAnimalAge();
        Collections.sort(pets, petsAgeComp);

        System.out.println("По возрасту: " + pets);

        Comparator ageNickComp = new ComparatorAnimalAge().thenComparing(new ComparatorAnimalNick());
        Collections.sort(pets, ageNickComp);

        System.out.println("По возрасту и кличке: " + pets);
    }
}
