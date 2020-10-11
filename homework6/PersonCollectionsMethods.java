package homework6;

import java.util.*;

import usefulFeatures.AnyRandom;

import static usefulFeatures.ReadFileToString.readAllBytesJava7;

public class PersonCollectionsMethods {

    public static Collection<Person> personsCollectionGenerator(Collection<Person> collectionName, int initialSize) {
        String filePath = "D://Projects//homework//homework//src//homework6//filesToUse//names.txt";
        String nicksTemp = readAllBytesJava7(filePath);
        String[] nicks = nicksTemp.split(", ");
        Random rnd = new Random();

        for (int i = 0; i < initialSize; i++) {
            collectionName.add(new Person(nicks[rnd.nextInt(nicks.length)], AnyRandom.nextString(rnd.nextInt(10) + 5)));
        }

        return collectionName;
    }

    public static void iteration(Collection<Person> collectionToIterate) {
        Iterator itr = collectionToIterate.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println();
    }

    public static void iterationListFor(List<Person> listToIterate) {
        for (int i = 0; i < listToIterate.size(); i++) {
            Person person = listToIterate.get(i);
            System.out.println(person);
        }

        System.out.println();
    }

    public static void iterationSetFor(Set<Person> setToIterate) {
        Person[] tempSetArray = new Person[setToIterate.size()];
        Person[] personsSetArray = setToIterate.toArray(tempSetArray);

        for (int i = 0; i < personsSetArray.length; i++) {
            Person person = personsSetArray[i];
            System.out.println(person);
        }

        System.out.println();
    }

    public static void printCollection(Collection<Person> CollectionToPrint) {
        for (Person person : CollectionToPrint) {
            System.out.println(person);
        }

        System.out.println();
    }
}