/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Queue;

/**
 *
 * @author LTC2023
 * @param <T>
 *
 */
public class CireculrQueue<T> {

    private  T[] queue ;
    private int front;
    private int rear;
    private  int capacity;
    private int size ;
   
    public CireculrQueue(int capacity) {
        this.queue= (T[]) new Object[capacity];
        this.front = 0;
        this.rear = 1;
        this.capacity=capacity;
        this.size = 0;
    }

    public int size() {

        return this.size;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public boolean isfull() {
        return this.size == this.capacity;
    }

    public void enqueue(T data) {
        if (this.isfull()) {
            System.out.println("Is Full");
        } else {
            rear = (rear + 1) % capacity;
            queue[rear] =(T)data;
            size++;
        }
    }

    public T dequeue() {
        T data = null;
        if (this.isEmpty()) {
            System.out.println("IS Empty ...");
        } else {
            data =  queue[front];
            front = (front + 1) % capacity;
            size--;
        }
        return data;
    }

    public T peek() {
                T data = null;

        if (this.isEmpty()) {
            System.out.println("IS Empty ...");
        } else {
            data =  queue[front];
        }
        return  data;
    }

}
