package datastructures;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import datastructures.list.linkedlist.LinkedList;

import java.util.concurrent.ThreadLocalRandom;

import static org.junit.jupiter.api.Assertions.*;

public class LinkedListTest {

    private LinkedList<Integer> list;

    @Test
    public void isEmptyTest() {
        LinkedList<Integer> list = new LinkedList<>();
        assertTrue(list.isEmpty());
    }

    @Test
    public void addTest() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(15);
        list.add(5);
        list.add(4);
        System.out.println(list.length());
        assertEquals(3, list.length());
    }

    @Test
    public void removeTest() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(15);
        list.add(9);
        list.remove(0);
        list.add(9);
        list.add(3);
        list.add(27);
        list.remove(list.length() - 1);
        list.add(4);
        list.add(88);
        list.add(23);
        list.remove(3);
        list.add(88);
        list.add(23);
        list.deleteAtHead();
        list.remove(3);
    }

    @Test
    public void getTest() {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < 15; i++) {
            list.add(i);
        }
        assertEquals(12, list.get(12));
    }

    @Test
    public void setTest() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(5);
        System.out.println(list.length());
        list.add(8);
        list.add(45);
        list.set(2, 3);
    }

    @Test
    public void myTest() throws InterruptedException {
        LinkedList<Integer> list = new LinkedList<>();
        assertTrue(list.isEmpty());
        for (int i = 0; i < 100; i++) {
            list.add(i);
        }
        assertFalse(list.isEmpty());
        assertEquals(100, list.length());
        System.out.println(list.get(95));
        assertEquals(95, list.get(95));
        list.set(95, 0);
        assertEquals(0, list.get(95));
        for (int i = 0; i < 100; i++) {
            list.remove(ThreadLocalRandom.current().nextInt(0, 100 - i));
        }
        assertTrue(list.isEmpty());
        for (int i = 0; i < 100; i++) {
            list.add(-i);
            list.add(0);
        }
        assertEquals(200, list.length());
        assertEquals(-50, list.get(100));
        assertEquals(0, list.get(101));
        for (int i = 0; i < list.length(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        assertEquals(-50, list.remove(100));
        for (int i = 0; i < list.length(); i++) {
            System.out.print(list.get(i) + " ");
        }
        assertEquals(0, list.get(102));
        while (!list.isEmpty()) {
            list.remove(0);
        }
        assertTrue(list.isEmpty());
        assertEquals(0, list.length());
    }
}
