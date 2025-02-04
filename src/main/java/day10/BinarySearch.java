package day10;

public class BinarySearch {
    Node root;

    public BinarySearch(int rootValue) {
        root = new Node(rootValue);
    }
    public void insert(int value) {
        root = insertRec(root, value);
    }
    private Node insertRec(Node current, int value) {
        if(current == null) {
            return new Node(value);
        }
        if(current.value > value) {
            current.left = insertRec(current.left, value);
        }
        else if(current.value < value) {
            current.right = insertRec(current.right, value);
        }
        return current;
    }

    public void inOrderTraversal() {
        inOrderRec(root);
    }
    private void inOrderRec(Node current) {
        if(current != null) {
            inOrderRec(current.left);
            System.out.print(current.value + " ");
            inOrderRec(current.right);
        }
    }
}
