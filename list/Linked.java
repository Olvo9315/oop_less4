package list;

public interface Linked<E> {
    void addLast(E elem);
    void addFirst(E elem);
    int size();
    E getElementByIndex(int counter);
    void remove(int index);
}
