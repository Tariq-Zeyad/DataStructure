/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Queue;

/**
 *
 * @author LTC2023
 */
public class Deque<T> {

    private class Node<T> {
        T data;
        Node<T> next;
        Node<T> prev;

        Node(T data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }

    }

    private Node<T> front;
    private Node<T> rear;
    private int size;

    public Deque() {
        this.front = null;
        this.rear = null;
        this.size = 0;
    }

    public void AddFirst(T data) {
        Node<T> newNode = new Node<>(data);
        if (this.size == 0) {
            front = newNode;
            front = rear = newNode;
        } else {
            newNode.next = front;
            front.prev = newNode;
            front = newNode;
        }
        size++;
    }

    public void AddLast(T data) {
        Node<T> newNode = new Node<>(data);
        if (this.size == 0) {
            front = newNode;
            front = rear = newNode;

        } else {
            newNode.prev = rear;
            rear.next = newNode;
            rear = newNode;
        }
        size++;

    }
    public T removeFirat() {
        if (this.size == 0) {
            System.out.println("Is Empty ...");
            return null;
        } else {
            T data = front.data;
            front = front.next;
            if (front == null) {
                rear = null;
            } else {
                front.prev = null;

            }
            size--;
return data;
        }

    }

public T removeLast(){
    if (this.size == 0) {
            System.out.println("Is Empty ...");
            return null;
        }else{
        T data = rear.data;
        rear=rear.prev;
        if (rear==null) {
            front=null;
        }else{
        rear.next=null;
        }
        size--;
   return data;
    }

}
  public int size(){
  return this.size;
  }
}
