package homework6;

import java.util.*;

import static homework6.AnimalCollectionsMethods.*;

public class AnimalMain2 {
    public static void main(String[] args) {
        int initialSize = 1000000;

        LinkedList<Animal> animalsLinked = new LinkedList<>();

        long startTimerAddLinked = System.currentTimeMillis();

        animalsCollectionGenerator(animalsLinked, initialSize);

        long finishTimerAddLinked = System.currentTimeMillis();
        long timeOfLinkedListGenerating = finishTimerAddLinked - startTimerAddLinked;

        System.out.println("Итерация 'animalsLinked' с Iterator:");

        long startTimerItrLinked = System.currentTimeMillis();

        iteration(animalsLinked);

        long finishTimerItrLinked = System.currentTimeMillis();
        long timeOfLinkedListIteration = finishTimerItrLinked - startTimerItrLinked;

        System.out.println("Итерация 'animalsLinked' c for:");

        long startTimerItrForLinked = System.currentTimeMillis();

        iterationListFor(animalsLinked);

        long finishTimerItrForLinked = System.currentTimeMillis();
        long timeOfLinkedListIterationFor = finishTimerItrForLinked - startTimerItrForLinked;

        ArrayList<Animal> animalsArray = new ArrayList<>();

        long startTimerAddArray = System.currentTimeMillis();

        animalsCollectionGenerator(animalsArray, initialSize);

        long finishTimerAddArray = System.currentTimeMillis();
        long timeOfArrayListGenerating = finishTimerAddArray - startTimerAddArray;

        System.out.println("Итерация 'animalsArray' с Iterator:");

        long startTimerItrArray = System.currentTimeMillis();

        iteration(animalsArray);

        long finishTimerItrArray = System.currentTimeMillis();
        long timeOfArrayListIteration = finishTimerItrArray - startTimerItrArray;

        System.out.println("Итерация 'animalsArray' с for:");

        long startTimerItrForArray = System.currentTimeMillis();

        iterationListFor(animalsArray);

        long finishTimerItrForArray = System.currentTimeMillis();
        long timeOfArrayListIterationFor = finishTimerItrForArray - startTimerItrForArray;

        HashSet<Animal> animalsHash = new HashSet<>();

        long startTimerAddHash = System.currentTimeMillis();

        animalsCollectionGenerator(animalsHash, initialSize);

        long finishTimerAddHash = System.currentTimeMillis();
        long timeOfHashSetGenerating = finishTimerAddHash - startTimerAddHash;

        System.out.println("Итерация 'animalsHash' с Iterator:");

        long startTimerItrHash = System.currentTimeMillis();

        iteration(animalsHash);

        long finishTimerItrHash = System.currentTimeMillis();
        long timeOfHashSetIteration = finishTimerItrHash - startTimerItrHash;

        System.out.println("Итерация 'animalsHash' с for:");

        long startTimerItrForHash = System.currentTimeMillis();

        iterationSetFor(animalsHash);

        long finishTimerItrForHash = System.currentTimeMillis();
        long timeOfHashSetIterationFor = finishTimerItrForHash - startTimerItrForHash;

        TreeSet<Animal> animalsTree = new TreeSet<>();

        long startTimerAddTree = System.currentTimeMillis();

        animalsCollectionGenerator(animalsTree, initialSize);

        long finishTimerAddTree = System.currentTimeMillis();
        long timeOfTreeSetGenerating = finishTimerAddTree - startTimerAddTree;

        System.out.println("Итерация 'animalsTree' с Iterator:");

        long startTimerItrTree = System.currentTimeMillis();

        iteration(animalsTree);

        long finishTimerItrTree = System.currentTimeMillis();
        long timeOfTreeSetIteration = finishTimerItrTree - startTimerItrTree;

        System.out.println("Итерация 'animalsTree' с for:");

        long startTimerItrForTree = System.currentTimeMillis();

        iterationSetFor(animalsTree);

        long finishTimerItrForTree = System.currentTimeMillis();
        long timeOfTreeSetIterationFor = finishTimerItrForTree - startTimerItrForTree;

        Comparator ageComp = new AnimalComparatorAge();
        Collections.sort(animalsLinked, ageComp);

        System.out.println("Отсортированный 'animalsLinked' по возрасту:");

        printCollection(animalsLinked);

        Comparator ageAndNickComp = new AnimalComparatorAgeAndNick();
        Collections.sort(animalsLinked, ageAndNickComp);

        System.out.println("Отсортированный 'animalsLinked' по возрасту и кличке:");

        printCollection(animalsLinked);

        Collections.sort(animalsArray, ageComp);

        System.out.println("Отсортированный 'animalsArray' по возрасту:");

        printCollection(animalsArray);

        Collections.sort(animalsArray, ageAndNickComp);

        System.out.println("Отсортированный 'animalsArray' по возрасту и кличке:");

        printCollection(animalsArray);

        ArrayList<Animal> animalsHashArrayList = new ArrayList<>(animalsHash);
        Collections.sort(animalsHashArrayList, ageComp);

        System.out.println("Отсортированный 'animalsHash' по возрасту:");

        printCollection(animalsHashArrayList);

        Collections.sort(animalsHashArrayList, ageAndNickComp);

        System.out.println("Отсортированный 'animalsHash' по возрасту и кличке:");

        printCollection(animalsHashArrayList);

        ArrayList<Animal> animalsTreeArrayList = new ArrayList<>(animalsTree);
        Collections.sort(animalsTreeArrayList, ageComp);

        System.out.println("Отсортированный 'animalsTree' по возрасту:");

        printCollection(animalsTreeArrayList);

        Collections.sort(animalsTreeArrayList, ageAndNickComp);

        System.out.println("Отсортированный 'animalsTree' по возрасту и кличке:");

        printCollection(animalsTreeArrayList);

        long startTimerTreeClear = System.currentTimeMillis();

        animalsTree.clear();

        long finishTimerTreeClear = System.currentTimeMillis();
        long TimeOfTreeSetCleaning = finishTimerTreeClear - startTimerTreeClear;

        System.out.println("'animalsTree' после удаления всех элементов c clear(): " + animalsTree);
        System.out.println();

       Iterator itrRemTree = animalsTree.iterator();

       long startTimerTreeRem = System.currentTimeMillis();

       while (itrRemTree.hasNext()) {
           itrRemTree.next();
           itrRemTree.remove();
       }

       long finishTimerTreeRem = System.currentTimeMillis();
       long timeOfTreeSetRemove = finishTimerTreeRem - startTimerTreeRem;

       System.out.println("'animalsTree' после удаления всех элементов c Iterator: " + animalsTree);

        System.out.println("Операция: заполнение LinkedList. Заняла " + timeOfLinkedListGenerating + " мс");
        System.out.println("Операция: заполнение ArrayList. Заняла " + timeOfArrayListGenerating + " мс");
        System.out.println("Операция: заполнение HashSet. Заняла " + timeOfHashSetGenerating + " мс");
        System.out.println("Операция: заполнение TreeSet. Заняла " + timeOfTreeSetGenerating + " мс");
        System.out.println("Операция: итерация LinkedList с Iterator. Заняла " + timeOfLinkedListIteration + " мс");
        System.out.println("Операция: итерация LinkedList с for. Заняла " + timeOfLinkedListIterationFor + " мс");
        System.out.println("Операция: итерация ArrayList с Iterator. Заняла " + timeOfArrayListIteration + " мс");
        System.out.println("Операция: итерация ArrayList с for. Заняла " + timeOfArrayListIterationFor + " мс");
        System.out.println("Операция: итерация HashSet с Iterator. Заняла " + timeOfHashSetIteration + " мс");
        System.out.println("Операция: итерация HashSet с for. Заняла " + timeOfHashSetIterationFor + " мс");
        System.out.println("Операция: итерация TreeSet с Iterator. Заняла " + timeOfTreeSetIteration + " мс");
        System.out.println("Операция: итерация TreeSet с for. Заняла " + timeOfTreeSetIterationFor + " мс");
        System.out.println("Операция: удаление элементов TreeSet с Iterator. Заняла " + timeOfTreeSetRemove + " мс");
//        System.out.println("Операция: удаление элементов TreeSet с clear(). Заняла " + TimeOfTreeSetCleaning + " мс");
    }
}