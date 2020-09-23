package homework4;

import java.util.Arrays;

public class DataContainerMain {
    public static void main(String[] args) {
        DataContainer<String> dataContainer = new DataContainer<>();

        System.out.println(dataContainer);
        dataContainer.add("Aleksei");
        dataContainer.add("Alexa");
        dataContainer.add("Ashley");
        dataContainer.add("Paul");
        dataContainer.add("Peter");
        System.out.println(dataContainer);
        System.out.println(dataContainer.add("Laura"));
        System.out.println(dataContainer);

        System.out.println(dataContainer.get(5));
        System.out.println(dataContainer.get(6));


        System.out.println(dataContainer.getItems());
        System.out.println(Arrays.toString(dataContainer.getItems()));

        dataContainer.deleteByIndex(4);
        System.out.println(dataContainer);
        System.out.println(dataContainer.deleteByIndex(4));
        System.out.println(dataContainer);

        System.out.println(dataContainer.delete("Paul"));
        System.out.println(dataContainer.delete("qwerty"));
        System.out.println(dataContainer);
    }
}
