package datastructures.stack;

import java.util.EmptyStackException;

/**
 * Last In First Out (LIFO) Data Structure
 *
 * Operations
 * Push: Adds an item in the stack. If the stack is full, then it is said to be an Overflow condition.
 * Pop: Removes an item from the stack. The items are popped in the reversed order in which they are pushed. If the stack is empty, then it is said to be an Underflow condition.
 * Peek or Top: Returns top element of stack.
 * isEmpty: Returns true if stack is empty, else false.
 */
public class Stack <T> {
    StackNode<T> top = null;
    StackNode<T> bottom = null;

    int length = 0;

    public void push(T data) {
        StackNode <T> temp = new StackNode<>(data);
        if (top == null) {
            top = temp;
        }
        if (bottom == null) {
            bottom = temp;
        }
        else {
            top.setNext(new StackNode<>(data));
            top = top.getNext();
        }
        length++;
    }

    public T pop() {
        if (top == null) {
            throw new EmptyStackException();
        }
        T data = top.getData();
        if (length == 1) {
            top = null;
            bottom = null;
        }
        else {
            StackNode<T> holder = bottom;
            for (int i = 0; i < length - 2; i++) {
                holder = holder.getNext();
            }
            holder.setNext(null);
            top = holder;
        }
        length--;
        return data;
    }

    public StackNode<T> getTop() {
        return top;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public T getTopData() {
        return top.getData();
    }

    public int getLength() {
        return length;
    }

    public static class StackNode <T> {
        private final T data;
        private StackNode<T> next = null;

        public StackNode(T data) {
            this.data = data;
        }

        public void setNext(StackNode<T> next) {
            this.next = next;
        }

        public StackNode<T> getNext() {
            return next;
        }

        public T getData() {
            return data;
        }
    }
}