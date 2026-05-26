package FinalProjectOfDS;

public class ArrayBag<T> {

    private Object[] arr;
    private int size;

    public ArrayBag() {
        arr = new Object[50];
        size = 0;
    }

    public void add(T data) {
        arr[size++] = data;
    }

    public T get(int index) {
        return (T) arr[index];
    }

    public int size() {
        return size;
    }
}
