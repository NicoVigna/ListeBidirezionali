public class Lista <T> {
    private Nodo<T> head;
    private Nodo<T> tail;
    private int size;

    public Lista() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }


    public void add(T value) {
        Nodo<T> newNodo = new Nodo<>(value);
        if (head == null) {
            head = newNodo;
            tail = newNodo;
        } else {
            tail.setNext(newNodo);
            tail = newNodo;
        }
        size++;
    }

    public int getSize() {
        return size;
    }


}
