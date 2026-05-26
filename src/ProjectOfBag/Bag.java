/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjectOfBag;

/**
 *
 * @author LTC2023
 */
public class Bag<T> {
    private T[] items;
    private int capacity;
    private int size;

    public Bag(int capacity) {
        this.capacity = capacity;
        this.items = (T[]) new Object[capacity];
        this.size = 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void add(T item) {
        if (isFull()) {
            System.out.println("Bag is Full!");
            return;
        }
        items[size++] = item;
    }

    public T get(int index) {
        return items[index];
    }

    public void remove(int index) {
        items[index] = items[size - 1];
        size--;
    }
}


