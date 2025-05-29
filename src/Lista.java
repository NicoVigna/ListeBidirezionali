public class Lista<T> {
    private Nodo<T> first;
    private Nodo<T> last;
    public Lista() {
        this.first = null;
        this.last=null;
    }

    public void addHead(T value) {
        Nodo<T> newNodo = new Nodo<>(value);
        if (first == null) {
            first = newNodo;
            last = newNodo;
        } else {
            first.setPrev(newNodo);
            newNodo.setNext(first);
            first = newNodo;
        }
    }

    public int getSize() {
        int size = 0;
        Nodo<T> temp = first;
        while (temp != null) {
            size++;
            temp = temp.getNext();
        }
        return size;
    }

    public String toStringReverse() {
        StringBuilder sb = new StringBuilder();
        Nodo<T> current = last;
        while (current != null) {
            sb.append(current.getValue()).append(" ");
            current = current.getPrev();
        }
        return sb.toString().trim();
    }

 

@Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Nodo<T> current = first;
        while (current != null) {
            sb.append(current.getValue()).append(" ");
            current = current.getNext();
        }
        return sb.toString().trim();
    }
}
