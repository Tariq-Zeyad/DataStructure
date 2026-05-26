/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bag;

/**
 *
 * @author LTC2023
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class Bag<T> {

    private T item[];
    private int capacity;
    private int size;

    public Bag(int capacity) {
        this.capacity = capacity;
        this.item = ((T[]) new Object[capacity]);
        this.size = 0;

    }

    public boolean isFull() {
        boolean isFull = false;
        if (this.size == this.capacity) {
            isFull = true;

        }
        return isFull;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void Add(T ietm) {
        if (isFull()) {
            System.out.println("Sory Bag IS Full !!");
            return;

        }
        addItem(ietm);
        System.out.println(ietm + " Adedd succesfully");
    }

    public void addItem(T ietm) {
        this.item[size] = ietm;
        size++;
    }

    public int size() {
        return size;

    }

    public boolean contains(T ietm) {
        boolean isFound = false;
        if (!isEmpty()) {
            for (int i = 0; i < size; i++) {
                if (this.item[i] == ietm) {
                    isFound = true;
                    break;
                }
            }

        }
        return isFound;
    }

    public int indexOf(T ietm) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (this.item[i] == ietm) {
                index = i;
            }
        }
        return index;
    }

    public void remove(T ietm) {
        if (!isEmpty()) {
            int index = indexOf(ietm);
            if (index != -1) {
                for (int i = 0; i < size; i++) {
                    this.item[i] = this.item[i + 1];
                }
                size--;
            }
            System.out.println("Deleat Succsufully .........");
        } else {
            System.out.println("Bag is Empty...");
        }
    }
    public void toArray(){
        for (int i = 0; i < size; i++) {
            System.out.println("ietm  :"+this.item[i]);
        }
    }
    public void removeAt(int index){
   T indexIetm =get(index);
    }
    public T get(int index){
        if (!isEmpty()&& index<0 &&index>size) {
              for (int i = 0; i < size; i++) {
            if (this.item[i]==this.item[index]) {
                return this.item[i];
            }
        }
        }
        return null;
    }
}

