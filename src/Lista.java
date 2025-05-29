public class Lista <T> {
    private Node<T> head;
    private Node<T> tail;
    private int size;

    public Lista() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void add(T value) {
        Node<T> newNode = new Node<>(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.setNext(newNode);
            tail = newNode;
        }
        size++;
    }

    public int getSize() {
        return size;
    }


}
