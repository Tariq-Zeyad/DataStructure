package FinalProjectOfDS;

public class AdminBinaryTree<T extends Comparable<T>> {

    class Node {

        T data;
        Node left, right;

        Node(T data) {
            this.data = data;
        }
    }

    private Node root;

    public void insert(T data) {
        root = insertRec(root, data);
    }

    private Node insertRec(Node root, T data) {
        if (root == null) {
            return new Node(data);
        }
        if (data.compareTo(root.data) < 0) {
            root.left = insertRec(root.left, data);
        } else if (data.compareTo(root.data) > 0) {
            root.right = insertRec(root.right, data);
        }
        return root;
    }

    public void inOrder() {
        inOrderRec(root);
    }

    private void inOrderRec(Node ietm) {
        if (ietm == null) {
            return; 
        }
        System.out.println(ietm.data);
        inOrderRec(ietm.left);
        inOrderRec(ietm.right);
    }
}
