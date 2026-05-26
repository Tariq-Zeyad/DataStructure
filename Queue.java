package FinalProjectOfDS;

public class Queue<T> {

    private class Node {
        T data;
        Node next;

        Node(T data) {
            this.data = data;
        }
    }

    private Node front, rear;

    public void enqueue(T data) {
        Node newNode = new Node(data);
        if (front == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;//بعد rear 
            rear = newNode;
        }
    }

    public T dequeue() {
        if (front == null) {
            return null;
        }
        T data = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        return data;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public void display() {
        Node currnet = front;
        while (currnet != null) {
            System.out.println(currnet.data);
            currnet = currnet.next;
        }
    }
}
