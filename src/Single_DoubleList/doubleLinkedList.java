/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Single_DoubleList;

/**
 *
 * @author LTC2023
 * @param <T>
 */
public class doubleLinkedList<T>{
     
    class Node<T>{
     T data;
     Node<T>next;
     Node<T>prev;
     public Node(T data)
     {
     this.data=data;
     this.next=null;
     this.prev=null;
     }
     }
     Node<T>head;
     int size=0;
      public doubleLinkedList() {
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
     
  public void insertAtBegaining(T data)
  {
  Node<T> newNode = new Node<>(data);
  if(this.isEmpty())
  {
  head=newNode;
  
  }else{
  newNode.next=head;
  head.prev=newNode;
  head=newNode;
  
  }}

  public void insertAtEnd(T data){
    Node<T> newNode = new Node<>(data);
  if(this.isEmpty())
  {
  head=newNode;
  }
  else{
  Node<T>temp=head;
  while(temp.next!=null){
  temp=temp.next;
  }
  temp.next=newNode;
  newNode.prev=temp;
  }

}
  public void deleteFromBegaining(T data){
      if(this.isEmpty()){
          System.out.println("List is Empty ...");
      }else{
      head.next.prev=null;
      }
      head=head.next;
  }
    public void deleteFromEnd()
    {
     if(this.isEmpty()){
          System.out.println("List is Empty ...");
      }
     else if(head.next==null){
     head=null;
     
     }else{
         Node<T> temp=head;
         while(temp.next!=null){
         temp=temp.next;
         }
     temp.prev.next=null;
     }}
     public boolean search(T data)
     {
   Node<T> temp=head;
     while(temp !=null){
     if(temp.data.equals(data)){
         return true;
     }
     }
     temp=temp.next;
     return false;
     }
     public void reverse(){
     Node<T> temp= null;
     Node<T> curnnet= null;
     while(curnnet !=null){
     temp=curnnet.prev;
     curnnet.prev=curnnet.next;
     curnnet.next=temp;     
     }
         

     
     }
    }



    
      
     
     

