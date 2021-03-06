package homework6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PersonMain1 {                                                       // Задание 2.99
    public static void main(String[] args) {

        Person person1 = new Person("Jack", "qwerty123");
        Person person2 = new Person("John", "qwerty12");
        Person person3 = new Person("Juliet", "qwerty1");
        Person person4 = new Person("Jeffrey", "qwerty1234");
        Person person5 = new Person("Jaconda", "qwerty");
        Person person6 = new Person("Jennifer", "qwerty21");
        Person person7 = new Person("Johnathon", "qwerty11");
        Person person8 = new Person("Jabulani", "qwerty20");

        List<Person> persons = new ArrayList<>();

        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
        persons.add(person4);
        persons.add(person5);
        persons.add(person6);
        persons.add(person7);
        persons.add(person8);

        System.out.println("Исходный: " + persons);

        Comparator passComp = new PersonComparatorPass();
        Collections.sort(persons, passComp);

        System.out.println("По длине пароля: " + persons);

        Comparator passAndNickComp = new PersonComparatorPassAndNick();
        Collections.sort(persons, passAndNickComp);

        System.out.println("По длине пароля и нику: " + persons);
    }
}