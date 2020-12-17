package datastructures.list.linkedlist;

public class Node<T> {
    private T data;
    private Node<T> parent;
    private Node<T> next = null;

    public Node(T data, Node<T> parent) {
        this.data = data;
        this.parent = parent;
        if (parent != null) {
            parent.setNext(this);
        }
    }

    public void setData(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public Node<T> getNext() {
        return next;
    }

    public Node<T> getParent() {
        return parent;
    }

    public void setParent(Node<T> parent) {
        this.parent = parent;
    }

    public String toString() {
        return "Data is " + data;
    }
}
