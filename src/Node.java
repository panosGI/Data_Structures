public class Node<T> {
    T item;
    Node<T> next = null;
    Node<T> prev = null;

    Node(T v) {
        item = v;
        next = null;
        prev = null;
    }

}
