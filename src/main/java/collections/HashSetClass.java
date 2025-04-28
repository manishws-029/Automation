package collections;

public class HashSetClass<E> {
    private java.util.HashSet<E> set;

    public HashSetClass() {
        set = new java.util.HashSet<>();
    }

    public void initialize() {
        set = new java.util.HashSet<>();
    }

    public void add(E element) {
        set.add(element);
    }

    public boolean contains(E element) {
        return set.contains(element);
    }


}
