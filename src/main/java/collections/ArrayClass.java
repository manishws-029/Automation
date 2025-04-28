package collections;

public class ArrayClass {
    private int[] array;

    public ArrayClass(int size) {
        array = new int[size];
    }

    public void initialize(int size) {
        array = new int[size];
    }

    public void set(int index, int value) {
        array[index] = value;
    }

    public int get(int index) {
        return array[index];
    }


}