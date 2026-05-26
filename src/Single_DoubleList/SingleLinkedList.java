/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Single_DoubleList;

public class SingleLinkedList<T> {

    class Node<T> {

        T data;
        Node<T> next;

        public Node(T data) {
            this.data = data;
            this.next = next;

        }
    }
    Node<T> head;
    int size = 0;

    public SingleLinkedList() {
        this.head = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        return this.head == null;

    }

    public void clear() {

        this.head = null;
        this.size = 0;

    }

    public void insertAtBegainning(T data) {

        Node<T> newNode = new Node(data);
        this.head = newNode;
        newNode.next = head;
        size++;

    }

    public void deleteFromBegainning() {
        head = head.next;
        size--;
    }

    public void insertEnd(T data) {
        Node<T> newNode = new Node(data);
        if (this.isEmpty()) {
            this.insertAtBegainning(data);
        } else if (this.head == null) {
            head.next = newNode;
            size++;
        } else {
            Node<T> currnet = head;
            while (currnet.next != null) {
                currnet = currnet.next;
            }
            currnet.next = newNode;
            size++;
        }

    }

    public void deleteFromEnd() {
        if (this.isEmpty()) {
            System.out.println("List is Empty ...");

        } else if (head.next == null) {
            head = null;
            size--;
        } else {
            Node<T> currnet = head;
            while (currnet.next != null) {
                currnet = currnet.next;
            }
            currnet = null;
            size--;
        }
    }
}
    