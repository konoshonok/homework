package homework2;

import java.util.Arrays;

public class SortBubble {                                   // Задание 4.2.1
    public static void main(String[] args) {
        int [] array = {17, 7, 26, 25, 13};
        boolean isSorted = false;
        int temp;

        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length-1; i++) {
                if(array[i] > array[i+1]){
                    isSorted = false;
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(array));
    }
}
