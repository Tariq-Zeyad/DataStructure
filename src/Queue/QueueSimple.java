/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Queue;
public class QueueSimple<T> {
    private static class Node<T> {
        T data;
        Node<T> next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }

    }
    Node<T> front;
    Node<T> rear;
    int size;

    public QueueSimple() {
        this.front = null;
        this.rear = null;
        this.size = 0;

     }

    public void enqueue(T data) {
        Node<T> newNode = new Node(data);
        if (this.isEmpty()) {
            front = newNode;
        } else {
            rear.next = newNode;
        }
         rear = newNode;
            size++;
        }
    
  public T dequeue(){
   if (this.isEmpty()) {
       System.out.println("IS Empty ...");
        } 
   T data =  front.data;
   front=front.next;
       if (front==null) {
           rear=null;
}
       size--;
       return data;
     
   }
  
  public T peek(){
  if (this.isEmpty()) {
       System.out.println("IS Empty ...");
        }
  return  front.data;
  }
  public int size(){
  return this.size;
  }

    public boolean isEmpty() {
        return this.size == 0;
    }
   
}
