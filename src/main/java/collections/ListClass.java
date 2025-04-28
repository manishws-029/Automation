package collections;

public class ListClass<E> {
    private java.util.ArrayList<E> list;

    public ListClass() {
        list = new java.util.ArrayList<>();
    }

    public void initialize() {
        list = new java.util.ArrayList<>();
    }

    public void add(E element) {
        list.add(element);
    }

    public E get(int index) {
        return list.get(index);
    }

}