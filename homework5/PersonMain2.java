package homework5;

import java.util.*;

public class PersonMain2 {
    public static void main(String[] args) {
        int initialSize = 1000000;

        LinkedList<Person> personsLinked = new LinkedList<>();

        long startLinkedAdd = System.currentTimeMillis();

        for (int i = 0; i < initialSize; i++) {
            personsLinked.add(new Person(AnyRandom.nextString(10), AnyRandom.nextString(10)));
        }

        long finishLinkedAdd = System.currentTimeMillis();

        System.out.println("Итерация 'personsLinked' через while:");

        Iterator itrLink = personsLinked.iterator();

        long startLinkedItrWhile = System.currentTimeMillis();

        while (itrLink.hasNext()) {
            System.out.println(itrLink.next());
        }

        long finishLinkedItrWhile = System.currentTimeMillis();

        System.out.println();
        System.out.println("Итерация 'personsLinked' через for:");

        long startLinkedItrFor = System.currentTimeMillis();

        for (int i = 0; i < personsLinked.size(); i++) {
            Person person = personsLinked.get(i);
            System.out.println(person);
        }

        long finishLinkedItrFor = System.currentTimeMillis();

        System.out.println("_____________________________________");

        ArrayList<Person> personsArray = new ArrayList<>();

        long startArrayAdd = System.currentTimeMillis();

        for (int i = 0; i < initialSize; i++) {
            personsArray.add(new Person(AnyRandom.nextString(10), AnyRandom.nextString(10)));
        }

        long finishArrayAdd = System.currentTimeMillis();

        System.out.println("Итерация 'personsArray' через while:");

        Iterator itrArr = personsArray.iterator();

        long startArrayItrWhile = System.currentTimeMillis();

        while (itrArr.hasNext()) {
            System.out.println(itrArr.next());
        }

        long finishArrayItrWhile = System.currentTimeMillis();

        System.out.println();
        System.out.println("Итерация 'personsArray' через for:");

        long startArrayItrFor = System.currentTimeMillis();

        for (int i = 0; i < personsArray.size(); i++) {
            Person person = personsArray.get(i);
            System.out.println(person);
        }

        long finishArrayItrFor = System.currentTimeMillis();

        System.out.println("_____________________________________");

        HashSet<Person> personsHash = new HashSet<>();

        long startHashAdd = System.currentTimeMillis();

        for (int i = 0; i < initialSize; i++) {
            personsHash.add(new Person(AnyRandom.nextString(10), AnyRandom.nextString(10)));
        }

        long finishHashAdd = System.currentTimeMillis();

        System.out.println("Итерация 'personsHash' через while:");

        Iterator itrHash = personsHash.iterator();

        long startHashItrWhile = System.currentTimeMillis();

        while (itrHash.hasNext()) {
            System.out.println(itrHash.next());
        }

        long finishHashItrWhile = System.currentTimeMillis();

        System.out.println();
        System.out.println("Итерация 'personsHash' через for:");

        long startHashItrFor = System.currentTimeMillis();

        Person[] tempHashArray = new Person[personsHash.size()];
        Person[] personsHashArray = personsHash.toArray(tempHashArray);

        for (int i = 0; i < personsHashArray.length; i++) {
            Person person = personsHashArray[i];
            System.out.println(person);
        }

        long finishHashItrFor = System.currentTimeMillis();

        System.out.println("_____________________________________");

        TreeSet<Person> personsTree = new TreeSet<>();

        long startTreeAdd = System.currentTimeMillis();

        for (int i = 0; i < initialSize; i++) {
            personsTree.add(new Person(AnyRandom.nextString(10), AnyRandom.nextString(10)));
        }

        long finishTreeAdd = System.currentTimeMillis();

        System.out.println("Итерация 'personsTree' через while:");

        Iterator itrTree = personsTree.iterator();

        long startTreeItrWhile = System.currentTimeMillis();

        while (itrTree.hasNext()) {
            System.out.println(itrTree.next());
        }

        long finishTreeItrWhile = System.currentTimeMillis();

        System.out.println();
        System.out.println("Итерация 'personsTree' через for:");

        long startTreeItrFor = System.currentTimeMillis();

        Person[] tempTreeArray = new Person[personsTree.size()];
        Person[] personsTreeArray = personsTree.toArray(tempTreeArray);

        for (int i = 0; i < personsTreeArray.length; i++) {
            Person person = personsTreeArray[i];
            System.out.println(person);
        }

        long finishTreeItrFor = System.currentTimeMillis();

        System.out.println("_____________________________________");

        Comparator passLengthComp = new ComparatorPersonPassword();
        Collections.sort(personsLinked, passLengthComp);

        System.out.println("personsLinked по длине пароля:");

        for (Person person : personsLinked) {
            System.out.println(person);
        }

        System.out.println();

        Comparator passNickComp = new ComparatorPersonPassword().thenComparing(new ComparatorPersonNick());
        Collections.sort(personsLinked, passNickComp);

        System.out.println("personsLinked по длине пароля и имени:");

        for (Person person : personsLinked) {
            System.out.println(person);
        }

        System.out.println("_____________________________________");

        Collections.sort(personsArray, passLengthComp);

        System.out.println("personsArray по длине пароля:");

        for (Person person : personsArray) {
            System.out.println(person);
        }

        System.out.println();

        Collections.sort(personsArray, passNickComp);

        System.out.println("personsArray по длине пароля и имени:");

        for (Person person : personsArray) {
            System.out.println(person);
        }

        System.out.println("_____________________________________");

        ArrayList<Person> personsHashArrayList = new ArrayList<>(personsHash);
        Collections.sort(personsHashArrayList, passLengthComp);

        System.out.println("personsHashArrayList по длине пароля:");

        for (Person person : personsHashArrayList) {
            System.out.println(person);
        }

        System.out.println();

        Collections.sort(personsHashArrayList, passNickComp);

        System.out.println("personsHashArrayList по длине пароля и имени:");

        for (Person person : personsHashArrayList) {
            System.out.println(person);
        }

        System.out.println("_____________________________________");

        ArrayList<Person> personsTreeArrayList = new ArrayList<>(personsTree);
        Collections.sort(personsTreeArrayList, passLengthComp);

        System.out.println("personsTreeArrayList по длине пароля:");

        for (Person person : personsTreeArrayList) {
            System.out.println(person);
        }

        System.out.println();

        Collections.sort(personsTreeArrayList, passNickComp);

        System.out.println("personsTreeArrayList по длине пароля и имени:");

        for (Person person : personsTreeArrayList) {
            System.out.println(person);
        }

        System.out.println("_____________________________________");

        System.out.println("Удаление всех элементов 'personsTree' c clear():");

        long startPersonsTreeClear = System.currentTimeMillis();

        personsTree.clear();

        long finishPersonsTreeClear = System.currentTimeMillis();

        System.out.println(personsTree);

//        System.out.println("Удаление всех элементов 'personsTree' c while:");
//
//        Iterator itrRemTree = personsTree.iterator();
//
//        long startPersonsTreeRem = System.currentTimeMillis();
//
//        while (itrRemTree.hasNext()) {
//            Person person = itrRemTree.next();
//            person.remove();
//        }
//
//        long finishPersonsTreeRem = System.currentTimeMillis();
//
//        System.out.println(personsTree);

        System.out.println("Операция: заполнение LinkedList. Заняла " + (finishLinkedAdd - startLinkedAdd) + " мс");
        System.out.println("Операция: заполнение ArrayList. Заняла " + (finishArrayAdd - startArrayAdd) + " мс");
        System.out.println("Операция: заполнение HashSet. Заняла " + (finishHashAdd - startHashAdd) + " мс");
        System.out.println("Операция: заполнение TreeSet. Заняла " + (finishTreeAdd - startTreeAdd) + " мс");
        System.out.println("Операция: итерация LinkedList с Iterator. Заняла " + (finishLinkedItrWhile - startLinkedItrWhile) + " мс");
        System.out.println("Операция: итерация LinkedList с for. Заняла " + (finishLinkedItrFor - startLinkedItrFor) + " мс");
        System.out.println("Операция: итерация ArrayList с Iterator. Заняла " + (finishArrayItrWhile - startArrayItrWhile) + " мс");
        System.out.println("Операция: итерация ArrayList с for. Заняла " + (finishArrayItrFor - startArrayItrFor) + " мс");
        System.out.println("Операция: итерация HashSet с Iterator. Заняла " + (finishHashItrWhile - startHashItrWhile) + " мс");
        System.out.println("Операция: итерация HashSet с for. Заняла " + (finishHashItrFor - startHashItrFor) + " мс");
        System.out.println("Операция: итерация TreeSet с Iterator. Заняла " + (finishTreeItrWhile - startTreeItrWhile) + " мс");
        System.out.println("Операция: итерация TreeSet с for. Заняла " + (finishTreeItrFor - startTreeItrFor) + " мс");
//        System.out.println("Операция: удаление элементов TreeSet с Iterator. Заняла " + (finishPersonsTreeRem - startPersonsTreeRem) + " мс");
        System.out.println("Операция: удаление элементов TreeSet с clear(). Заняла " + (finishPersonsTreeClear - startPersonsTreeClear) + " мс");
    }
}
