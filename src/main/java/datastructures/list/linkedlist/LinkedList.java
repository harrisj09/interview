package datastructures.list.linkedlist;


/**
 * Doubly Linked List
 */

public class LinkedList<T> {

    private int length = 0;
    private Node<T> head = null;
    private Node<T> tail = null;

    public int length() {
        return length;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public void add(T value) {
        Node<T> data;
        if (length == 0) {
            head = new Node<>(value, null);
        } else {
            if (length == 1) {
                data = new Node<>(value, head);
                tail = data;
            } else {
                new Node<>(value, tail);
                tail = tail.getNext();
            }
        }
        length++;
    }

    public T get(int index) {
        assertIndex(index);
        Node<T> curr = head;
        for (int i = 0; i < index; i++) {
            curr = curr.getNext();
        }
        return curr.getData();
    }

    private void assertIndex(int index) {
        if(index > length) {
            throw new IndexOutOfBoundsException("Out of bounds");
        }
    }

    public void set(int index, T value) {
        assertIndex(index);
        Node<T> curr = head;
        for (int i = 0; i < index; i++) {
            System.out.println(curr.getData());
            curr = curr.getNext();
        }
        curr.setData(value);
    }

    public T remove(int index) {
        assertIndex(index);
        Node<T> curr;
        T data;
        if (index == 0) {
            data = head.getData();
            head = head.getNext();
        } else {
            if (index == length - 1) {
                data = tail.getData();
                tail.getParent().setNext(null);
                tail = tail.getParent();
            }
            else {
                curr = head;
                for (int i = 0; i < index; i++) {
                    curr = curr.getNext();
                }
                Node<T> parent = curr.getParent();
                curr.getNext().setParent(parent);
                curr.getParent().setNext(curr.getNext());
                data = curr.getData();
            }
        }
        length--;
        return data;
    }

    public void insertAtHead(T data) {
    }


    public void deleteAtHead() {
        head = head.getNext();
        System.out.println(head.getData());
    }

    public void printLinkedList() {
        Node<T> currentNode = head;
        for (int i = 0; i < length - 1; i++) {
            System.out.print(currentNode.getData() + " -> ");
        }
        System.out.print(currentNode.getData());
    }
}
