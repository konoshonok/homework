package homework4;

import java.util.Arrays;

public class DataContainer<T> {
    private T[] data;
    private static final int initialSize = 5;
    private int lastElementIndex = -1;

    public DataContainer() {
        this.data = (T[]) new Object[initialSize];
    }

    public int add(T item) {
        if (item == null)
            return -1;
        if (data[data.length - 1] != null) {
            this.data = Arrays.copyOf(data, data.length + 1);
        }
        data[++lastElementIndex] = item;
        return lastElementIndex;
    }

    public T get(int index) {
        if (index > data.length - 1) {
            return null;
        } else {
            return data[index];
        }
    }

    public T[] getItems() {
        return data;
    }

    public boolean deleteByIndex(int index) {
        if (index >= data.length || index < 0) {
            return false;
        }
        if (index == data.length - 1) {
            this.data = Arrays.copyOf(data, data.length - 1);
        } else {
            int resultLength = data.length - 1;
            T[] copy = (T[]) new Object[resultLength];
            for (int i = 0; i < index; i++) {
                copy[i] = data[i];
            }

            for (int i = index; i < resultLength; i++) {
                copy[i] = data[i + 1];
            }
            this.data = copy;
        }
        lastElementIndex--;
        return true;
    }

    public boolean delete(T item) {
        if (item == null) {
            return false;
        }
        for (int i = 0; i < data.length; i++) {
            if (data[i].equals(item)) {
                return deleteByIndex(i);
            }
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DataContainer = [");
        for (int i = 0; i < data.length; i++) {
            if (data[i] != null) {
                sb.append(data[i]);
                if (i != data.length - 1 && data[i + 1] != null) {
                    sb.append(",");
                }
            }
        }
        sb.append("]");
        return sb.toString();
    }
}