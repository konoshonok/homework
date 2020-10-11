package homework6;

import java.util.*;

import static usefulFeatures.ReadFileToString.readAllBytesJava7;

public class AnimalCollectionsMethods {

    public static Collection<Animal> animalsCollectionGenerator(Collection<Animal> collectionName, int initialSize) {
        String filePath = "D://Projects//homework//homework//src//homework6//filesToUse//Pet_nicks.txt";
        String nicksTemp = readAllBytesJava7(filePath);
        String[] nicks = nicksTemp.split(", ");
        Random rnd = new Random();

        for (int i = 0; i < initialSize; i++) {
            collectionName.add(new Animal(nicks[rnd.nextInt(nicks.length)], rnd.nextInt(15) + 1));
        }

        return collectionName;
    }

    public static void iteration(Collection<Animal> collectionToIterate) {
        Iterator itr = collectionToIterate.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println();
    }

    public static void iterationListFor(List<Animal> listToIterate) {
        for (int i = 0; i < listToIterate.size(); i++) {
            Animal animal = listToIterate.get(i);
            System.out.println(animal);
        }

        System.out.println();
    }

    public static void iterationSetFor(Set<Animal> setToIterate) {
        Animal[] tempSetArray = new Animal[setToIterate.size()];
        Animal[] animalsSetArray = setToIterate.toArray(tempSetArray);

        for (int i = 0; i < animalsSetArray.length; i++) {
            Animal animal = animalsSetArray[i];
            System.out.println(animal);
        }

        System.out.println();
    }

    public static void printCollection(Collection<Animal> CollectionToPrint) {
        for (Animal animal : CollectionToPrint) {
            System.out.println(animal);
        }

        System.out.println();
    }
}