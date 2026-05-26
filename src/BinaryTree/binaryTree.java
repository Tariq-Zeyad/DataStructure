package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class binaryTree<T> {

    class Node<T> {
        T data;
        Node<T> left, right;

        public Node(T data) {
            this.data = data;
            this.left = null;
            this.right = null;

        }
    }
    Node<T> root;

    public binaryTree() {
        this.root = null;

    }

    public void insert(T data) {
        Node<T> newNode = new Node(data);
        if (this.root == null) {
            root = newNode;
            return;
        }
        Queue<Node<T>> queue = new LinkedList<>();
        queue.add(root);
        Node<T> curnnet;
        while (!queue.isEmpty()) {
            curnnet = queue.poll();
            if (curnnet.left == null) {
                curnnet.left = newNode;
                break;
            } else {
                queue.add(curnnet.left);
            }
            if (curnnet.right == null) {
                curnnet.right = newNode;
                break;
            } else {
                queue.add(curnnet.right);
            }
        }
    }

    public boolean isEmpty() {

        return this.root == null;
    }

    public void preOrder() {
        PreOrderRec(root);
        System.out.println();
    }

    public void PreOrderRec(Node<T> node) {
        if (node == null) {
            return;
        }
        System.out.print(node.data + " ");
        PreOrderRec(node.left);
        PreOrderRec(node.right);
    }

    public void postOrder() {
        PostOrderRec(root);
        System.out.println();
    }

    public void PostOrderRec(Node<T> node) {
        if (node == null) {
            return;
        }
        {
            PostOrderRec(node.left);
            PostOrderRec(node.right);
            System.out.print(node.data + " ");
        }
    }

    public void InOrder() {
        InOrderRec(root);
        System.out.println();
    }

    public void InOrderRec(Node<T> node) {
        if (node == null) {
            return;
        }
        {
            InOrderRec(node.left);
            System.out.print(node.data + " ");
            InOrderRec(node.right);

        }
    }

    public void delete(T data){
        if (this.isEmpty()) {
            return;
        }
        if (this.root.right==null && root.left==null) {
            if (root.data.equals(data)) {
                root=null;
                return;
            }
        }
        Queue<Node<T>> queue = new LinkedList<>();
        queue.add(root);
        Node<T> curnnet,delNode=null;
        while(!queue.isEmpty()){
        curnnet=queue.poll();
            if (curnnet.data.equals(data)) {
                delNode=curnnet;
            }
            if (curnnet.left!=null) {
                queue.add(curnnet.left);
            }
               if (curnnet.right!=null) {
                queue.add(curnnet.right);
            }
        
        if (delNode!=null) {
            delNode.data=curnnet.data;
            deleteDeepset(curnnet.data);
        }
    }}
    public void deleteDeepset(T delNode){
    Queue<Node<T>> queue = new LinkedList<>();
        queue.add(root);
       while(!queue.isEmpty()){
       Node<T>curnnet=queue.poll();
           if (curnnet.left!=null) {
               if (curnnet.left==delNode) {
               curnnet.left=null;
               return;
               }
               else{
                   queue.add(curnnet.left);
               }
           }
              if (curnnet.right!=null) {
               if (curnnet.right==delNode) {
               curnnet.right=null;
               return;
               }
               else{
                   queue.add(curnnet.right);
               }
           }
       }    
    }
    public static void main(String[] args) {
        binaryTree<Integer> num = new binaryTree<>();
        num.insert(70);
        num.insert(30);
        num.insert(80);
        num.insert(15);
        num.insert(10);
        num.insert(7);
        num.insert(22);
         num.delete(30);
        System.out.println("Pre Order ...");
        num.preOrder();
        System.out.println("Post Order ...");
        num.postOrder();
        System.out.println("In Order ...");
        num.InOrder();
        
    }
}
