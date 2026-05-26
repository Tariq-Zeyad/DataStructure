package FinalProjectOfDS;

public class Stack<T> {

    private class Node {

        T data;
        Node next;

        Node(T data) {
            this.data = data;
        }
    }

    private Node top;

    public void push(T data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }

    public T pop() {
        if (top == null) {
            return null;
        }
        T data = top.data;
        top = top.next;
        return data;
    }

    public T peek() {
        return top == null ? null : top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void display() {
        if (top == null) {
            System.out.println("Stack is empty!");
            return;
        }

        Node current = top;
        int count = 1;

        while (current != null) {
            System.out.println(count + "- " + current.data);
            current = current.next;
            count++;
        }
    }
}
