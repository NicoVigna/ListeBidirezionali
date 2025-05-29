public class Nodo<T> {
    private T value;
    private Nodo<T> next;
    private Nodo<T> prev;

    public Nodo(T value) {
        this.value = value;
        this.next = null;
        this.prev = null;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Nodo<T> getNext() {
        return next;
    }

    public void setNext(Nodo<T> next) {
        this.next = next;
    }

    public Nodo<T> getPrev() {
        return prev;
    }
    public void setPrev(Nodo<T> prev) {
        this.prev = prev;
    }

    @Override
    public String toString() {
        return "Nodo{" +
                "value=" + value +
                ", next=" + (next != null ? next.getValue() : "null") +
                ", prev=" + (prev != null ? prev.getValue() : "null") +
                '}';
    }
}
