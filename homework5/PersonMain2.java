package homework5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class PersonMain2 {
    public static void main(String[] args) {
        int initialSize = 1000000;

        LinkedList<Person> personsLinked = new LinkedList<>();

        for (int i = 0; i < initialSize; i++) {
            personsLinked.add(new Person(AnyRandom.nextString(10), AnyRandom.nextString(10)));
        }

        System.out.println("Размер 'personsLinked': " + personsLinked.size() + " элементов");

        for (Person person : personsLinked) {
            System.out.println(person);
        }

        System.out.println("_____________________________________");

        ArrayList<Person> personsArray = new ArrayList<>();

        for (int i = 0; i < initialSize; i++) {
            personsArray.add(new Person(AnyRandom.nextString(10), AnyRandom.nextString(10)));
        }

        System.out.println("Размер 'personsArray': " + personsArray.size() + " элементов");

        for (Person person : personsArray) {
            System.out.println(person);
        }

        System.out.println("_____________________________________");

        HashSet<Person> personsHash = new HashSet<>();

        for (int i = 0; i < initialSize; i++) {
            personsHash.add(new Person(AnyRandom.nextString(10), AnyRandom.nextString(10)));
        }

        System.out.println("Размер 'personsHash': " + personsHash.size() + " элементов");

        for (Person person : personsHash) {
            System.out.println(person);
        }

        System.out.println("_____________________________________");

        TreeSet<Person> personsTree = new TreeSet<>();

        for (int i = 0; i < initialSize; i++) {
            personsTree.add(new Person(AnyRandom.nextString(10), AnyRandom.nextString(10)));
        }

        System.out.println("Размер 'personsTree': " + personsTree.size() + " элементов");

        for (Person person : personsTree) {
            System.out.println(person);
        }

        System.out.println("_____________________________________");
    }
}
