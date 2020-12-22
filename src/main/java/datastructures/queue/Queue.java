package datastructures.queue;

public class Queue <T> {

    private QueueNode<T> peek =  null;
    private QueueNode<T> rear = null;
    private int length = 0;

    public QueueNode<T> getRear() {
        return rear;
    }

    public void enqueue(T data) {
        QueueNode<T> temp = new QueueNode<>(data);
        if(length == 0) {
            rear = temp;
            peek = temp;
        }
        else if (length == 1) {
            rear.setNext(temp);
            peek = temp;
        }
        else {
            peek.setNext(temp);
            peek = peek.getNext();
        }
        length++;
    }

    public T dequeue() {
        if (rear == null) {
            throw new NullPointerException();
        }
        T data = rear.getData();
        if (rear.getNext() == null) {
            rear = null;
            peek = null;
            return data;
        }
        rear = rear.getNext();
        length--;
        return data;
    }

    public QueueNode<T> peek() {
        return peek;
    }

    public T elementData(int index) {
        QueueNode<T> temp = peek;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.getNext();
        }
        return temp.getData();
    }

    public boolean isEmpty() {
        return peek == null;
    }

    public static class QueueNode <T> {
        private T data;
        private QueueNode<T> next = null;

        public QueueNode(T data) {
            this.data = data;
        }

        public void setNext(QueueNode<T> next) {
            this.next = next;
        }

        public QueueNode<T> getNext() {
            return next;
        }

        public T getData() {
            return data;
        }

        public void setData(T newData) {
            this.data = newData;
        }
    }
}
