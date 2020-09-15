package homework2;

public class SortShaker {                           // Задание 4.2.2
    public static void main(String[] args)
        {
            int[] array = {17, 7, 26, 25, 13};
            int left = 0;
            int right = array.length - 1;
            int temp;

            do
            {
                for (int i = left; i < right; i++)
                {
                    if(array[i] > array[i+1])
                    {
                        temp = array[i];
                        array[i] = array[i+1];
                        array[i+1] = temp;
                    }
                }
                right--;                            // уменьшаем правую границу

                for (int i = right; i > left ; i--)
                {
                    if(array[i] < array[i-1])
                    {
                        temp = array[i];
                        array[i] = array[i-1];
                        array[i-1] = temp;
                    }
                }
                left++;                             // увеличиваем левую границу
            } while (left <= right);

            for (int i : array) System.out.print(i + " ");
        }
    }
