package binarySearchTree;

public class binarySearchTree<T extends Comparable> {

}
//
//    public class Node<T> {
//
//        T data;
//        Node<T> left, right;
//
//        public Node(T data) {
//            this.data = data;
//            this.left = null;
//            this.right = null;
//        }
//
//    }
//    Node<T> root;
//
//    public binarySearchTree() {
//        this.root = root;
//
//    }
//
//    public void Insert(T data) {
//        root = InsertRec(root, data);
//
//    }
//
//    public Node<T> InsertRec(Node<T> node, T data) {
//        if (node == null) {
//            return new Node<>(data);
//        }
//        if (data.compareTo(node.data) < 0) {
//            node.left = InsertRec(node.left, data);
//        }
//        if (data.compareTo(node.data) > 0) {
//            node.right = InsertRec(node.right, data);
//        }
//
//        return node;
//    }
//
//    public void preOrder() {
//        PreOrderRec(root);
//        System.out.println();
//    }
//
//    public void PreOrderRec(Node<T> node) {
//        if (node == null) {
//            return;
//        }
//        System.out.print(node.data + " ");
//        PreOrderRec(node.left);
//        PreOrderRec(node.right);
//    }
//
//    public void postOrder() {
//        PostOrderRec(root);
//        System.out.println();
//    }
//
//    public void PostOrderRec(Node<T> node) {
//        if (node == null) {
//            return;
//        }
//        {
//            PostOrderRec(node.left);
//            PostOrderRec(node.right);
//            System.out.print(node.data + " ");
//        }
//    }
//
//    public void InOrder() {
//        InOrderRec(root);
//        System.out.println();
//    }
//
//    public void InOrderRec(Node<T> node) {
//        if (node == null) {
//            return;
//        }
//        {
//            InOrderRec(node.left);
//            System.out.print(node.data + " ");
//            InOrderRec(node.right);
//
//        }
//    }
//
//    public static void main(String[] args) {
//        binarySearchTree<Integer> BST = new binarySearchTree<>();
//        BST.Insert(100);
//        BST.Insert(70);
//        BST.Insert(102);
//        BST.Insert(30);
//        BST.Insert(75);
//        BST.Insert(101);
//        BST.Insert(105);
//        System.out.println("Pre Order ...");
//        BST.preOrder();
//        System.out.println("Post Order ...");
//        BST.postOrder();
//        System.out.println("In Order ...");
//        BST.InOrder();
//    }
//}
