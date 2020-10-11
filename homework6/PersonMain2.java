package homework6;

import java.util.*;

import static homework6.PersonCollectionsMethods.*;

public class PersonMain2 {
    public static void main(String[] args) {
        int initialSize = 1000000;

        LinkedList<Person> personsLinked = new LinkedList<>();

        long startTimerAddLinked = System.currentTimeMillis();

        personsCollectionGenerator(personsLinked, initialSize);

        long finishTimerAddLinked = System.currentTimeMillis();
        long timeOfLinkedListGenerating = finishTimerAddLinked - startTimerAddLinked;

        System.out.println("Итерация 'personsLinked' с Iterator:");

        long startTimerItrLinked = System.currentTimeMillis();

        iteration(personsLinked);

        long finishTimerItrLinked = System.currentTimeMillis();
        long timeOfLinkedListIteration = finishTimerItrLinked - startTimerItrLinked;

        System.out.println("Итерация 'personsLinked' c for:");

        long startTimerItrForLinked = System.currentTimeMillis();

        iterationListFor(personsLinked);

        long finishTimerItrForLinked = System.currentTimeMillis();
        long timeOfLinkedListIterationFor = finishTimerItrForLinked - startTimerItrForLinked;

        ArrayList<Person> personsArray = new ArrayList<>();

        long startTimerAddArray = System.currentTimeMillis();

        personsCollectionGenerator(personsArray, initialSize);

        long finishTimerAddArray = System.currentTimeMillis();
        long timeOfArrayListGenerating = finishTimerAddArray - startTimerAddArray;

        System.out.println("Итерация 'personsArray' с Iterator:");

        long startTimerItrArray = System.currentTimeMillis();

        iteration(personsArray);

        long finishTimerItrArray = System.currentTimeMillis();
        long timeOfArrayListIteration = finishTimerItrArray - startTimerItrArray;

        System.out.println("Итерация 'personsArray' с for:");

        long startTimerItrForArray = System.currentTimeMillis();

        iterationListFor(personsArray);

        long finishTimerItrForArray = System.currentTimeMillis();
        long timeOfArrayListIterationFor = finishTimerItrForArray - startTimerItrForArray;

        HashSet<Person> personsHash = new HashSet<>();

        long startTimerAddHash = System.currentTimeMillis();

        personsCollectionGenerator(personsHash, initialSize);

        long finishTimerAddHash = System.currentTimeMillis();
        long timeOfHashSetGenerating = finishTimerAddHash - startTimerAddHash;

        System.out.println("Итерация 'personsHash' с Iterator:");

        long startTimerItrHash = System.currentTimeMillis();

        iteration(personsHash);

        long finishTimerItrHash = System.currentTimeMillis();
        long timeOfHashSetIteration = finishTimerItrHash - startTimerItrHash;

        System.out.println("Итерация 'personsHash' с for:");

        long startTimerItrForHash = System.currentTimeMillis();

        iterationSetFor(personsHash);

        long finishTimerItrForHash = System.currentTimeMillis();
        long timeOfHashSetIterationFor = finishTimerItrForHash - startTimerItrForHash;

        TreeSet<Person> personsTree = new TreeSet<>();

        long startTimerAddTree = System.currentTimeMillis();

        personsCollectionGenerator(personsTree, initialSize);

        long finishTimerAddTree = System.currentTimeMillis();
        long timeOfTreeSetGenerating = finishTimerAddTree - startTimerAddTree;

        System.out.println("Итерация 'personsTree' с Iterator:");

        long startTimerItrTree = System.currentTimeMillis();

        iteration(personsTree);

        long finishTimerItrTree = System.currentTimeMillis();
        long timeOfTreeSetIteration = finishTimerItrTree - startTimerItrTree;

        System.out.println("Итерация 'personsTree' с for:");

        long startTimerItrForTree = System.currentTimeMillis();

        iterationSetFor(personsTree);

        long finishTimerItrForTree = System.currentTimeMillis();
        long timeOfTreeSetIterationFor = finishTimerItrForTree - startTimerItrForTree;

        Comparator passComp = new PersonComparatorPass();
        Collections.sort(personsLinked, passComp);

        System.out.println("Отсортированный 'personsLinked' по длине пароля:");

        printCollection(personsLinked);

        Comparator passAndNickComp = new PersonComparatorPassAndNick();
        Collections.sort(personsLinked, passAndNickComp);

        System.out.println("Отсортированный 'personsLinked' по длине пароля и нику:");

        printCollection(personsLinked);

        Collections.sort(personsArray, passComp);

        System.out.println("Отсортированный 'personsArray' по длине пароля:");

        printCollection(personsArray);

        Collections.sort(personsArray, passAndNickComp);

        System.out.println("Отсортированный 'personsArray' по длине пароля и нику:");

        printCollection(personsArray);

        ArrayList<Person> personsHashArrayList = new ArrayList<>(personsHash);
        Collections.sort(personsHashArrayList, passComp);

        System.out.println("Отсортированный 'personsHash' по длине пароля:");

        printCollection(personsHashArrayList);

        Collections.sort(personsHashArrayList, passAndNickComp);

        System.out.println("Отсортированный 'personsHash' по длине пароля и нику:");

        printCollection(personsHashArrayList);

        ArrayList<Person> personsTreeArrayList = new ArrayList<>(personsTree);
        Collections.sort(personsTreeArrayList, passComp);

        System.out.println("Отсортированный 'personsTree' по длине пароля:");

        printCollection(personsTreeArrayList);

        Collections.sort(personsTreeArrayList, passAndNickComp);

        System.out.println("Отсортированный 'personsTree' по длине пароля и нику:");

        printCollection(personsTreeArrayList);

        long startTimerTreeClear = System.currentTimeMillis();

        personsTree.clear();

        long finishTimerTreeClear = System.currentTimeMillis();
        long TimeOfTreeSetCleaning = finishTimerTreeClear - startTimerTreeClear;

        System.out.println("'personsTree' после удаления всех элементов c clear(): " + personsTree);
        System.out.println();

//       Iterator itrRemTree = personsTree.iterator();

//       long startTimerTreeRem = System.currentTimeMillis();

//       while (itrRemTree.hasNext()) {
//           itrRemTree.next();
//           itrRemTree.remove();
//       }

//       long finishTimerTreeRem = System.currentTimeMillis();
//       long timeOfTreeSetRemove = finishTimerTreeRem - startTimerTreeRem;

//       System.out.println("'personsTree' после удаления всех элементов c Iterator: " + personsTree);

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
        System.out.println("Операция: удаление элементов TreeSet с clear(). Заняла " + TimeOfTreeSetCleaning + " мс");
//      System.out.println("Операция: удаление элементов TreeSet с Iterator. Заняла " + timeOfTreeSetRemove + " мс");
    }
}