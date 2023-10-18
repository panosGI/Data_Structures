import java.io.PrintStream;
import java.util.NoSuchElementException;

// PRWTO STOIXEIO THEOROYMAI TO TAIL

    public class StringDoubleEndedQueueImpl<T> implements StringDoubleEndedQueue<T> {
        Node<T> head = null;
        Node<T> tail = null;
        int counter ;
        public boolean isEmpty() {
            return (tail == null || head ==null);
        }

        public void addFirst(T item) {
            Node n = new Node(item);
            if (isEmpty() == true) {
                head = tail =n;
            }
            else {
                n.next = tail;
                tail.prev = n;
                tail = n;
            }
                counter++;
        }

        public T removeFirst() throws NoSuchElementException {
            if (isEmpty() == true) {
                throw new NoSuchElementException();
            }
            T s = tail.item;
            if (size()==1){
                head=tail=null;
            }else {
                tail = tail.next;
                tail.prev = null;
            }
                counter--;
                return s;
        }

        public void addLast(T item) {
            Node n = new Node(item);
            if (isEmpty() == true) {
                head = tail =n;
            }else {
                n.prev = head;
                head.next = n;
                head = n;
            }
                 counter++;
        }

        public T removeLast() throws NoSuchElementException {
            if (isEmpty() == true) {
                throw new NoSuchElementException();
            }
            T s = head.item;
            if (size() == 1){
                head=tail=null;
            }else {
                head = head.prev;
                head.next = null;
            }
            counter--;
            return s;
        }

        public T getFirst() {
            if (isEmpty() == true) {
                throw new NoSuchElementException();
            } return tail.item;

        }

        public T getLast() {
            if (isEmpty() == true) {
                throw new NoSuchElementException();
            } else {
                return head.item;
            }
        }

        public void printQueue(PrintStream stream) {
            if (isEmpty() == true) {
                throw new NoSuchElementException();
            }
            Node<T> temp = tail;
            while (temp != null) {
                System.out.print(temp.item + "  ");
                temp = temp.next;
            }

        }
        public int size() {
            return counter;
        }

    }