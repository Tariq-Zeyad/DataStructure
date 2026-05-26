/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Queue;

/**
 *
 * @author LTC2023
 * @param <T>
 */
public class ProrityQueue<T> {
    private class Node<T>{
    T data;
    int prority;
    Node<T>next;
    public Node(T data,int prority){
    this.data=data;
    this.prority=prority;
    this.next=null;
    }
    }
        private Node<T>head;

    public ProrityQueue(){
    this.head=head;
    }
    public void add(T item , int pri ){
    Node<T> newNode=new Node<>(item,pri);
        if (this.head==null ||pri<head.prority ) {
            newNode.next=head;
            head=newNode;
        }else{
        Node<T>curnnet=head;
        while(curnnet.next !=null && curnnet.next.prority<pri){
        curnnet=curnnet.next;//قدم خطووة ممعناها 
      
        }
        newNode.next=curnnet.next;
        curnnet.next=newNode;
        }
    
    
    }

  public T dequeue(){
     if (this.head==null) {
         System.out.println("Is Empty");
         return null;
     }else{
     T data = head.data;
     head=head.next; 
     return data;
     }
 }
    public T peek(){
     if (this.head==null) {
         System.out.println("Is Empty");
         return null;
     }else{
     
     return head.data;
     }
 }




}
