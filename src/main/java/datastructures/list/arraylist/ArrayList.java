package datastructures.list.arraylist;

import java.util.Objects;

public class ArrayList {
    int size = 0;
    int[] data = new int[16];

    public int length() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void add(int value) {
        if (data.length == size) {
            changeSize(size * 2);
        }
        data[size] = value;
        size++;
    }

    public int get(int index) {
        Objects.checkIndex(index, size);
        return data[index];
    }

    public void set(int index, int value) {
        Objects.checkIndex(index, size);
        data[index] = value;
    }

    public int remove(int index) {
        int result = data[index];
        size--;
        if (notRemovingTheLast(index)) {
            System.arraycopy(data, index + 1, data, index, size - index);
        }
        if (wastingSpaceByFour()) {
            changeSize(size * 2);
        }
        return result;
    }

    private boolean notRemovingTheLast(int index) {
        return size - index >= 0;
    }

    private boolean wastingSpaceByFour() {
        return size < data.length / 4 && size > 1;
    }

    private void changeSize(int newSize) {
        var newData = new int[newSize];
        System.arraycopy(data, 0, newData, 0, size);
        data = newData;
    }
}
