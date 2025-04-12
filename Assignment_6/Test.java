package Assignment_6;

class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class BST3 {
    private Node root;

    public BST3() {
        this.root = null;
    }

    public void insert(int data) {
        Node temp = new Node(data);
        if (root == null) {
            root = temp;
            return;
        }

        Node cur = root;
        Node parent = null;

        while (cur != null) {
            parent = cur;
            if (data < cur.data) {
                cur = cur.left;
            } else if (data > cur.data) {
                cur = cur.right;
            } else {
                // Ignore duplicate values
                return; 
            }
        }

        if (data < parent.data) {
            parent.left = temp;
        } else {
            parent.right = temp;
        }
    }

    public void inOrderTraversal(Node node) {
        if (node != null) {
            inOrderTraversal(node.left);
            System.out.print(node.data + " ");
            inOrderTraversal(node.right);
        }
    }

    public void print() {
        inOrderTraversal(root);
        System.out.println();
    }
}

public class Test {
    public static void main(String[] args) {
        BST3 b = new BST3();
        int[] values = {50, 30, 70, 20, 40, 60, 80};
        for (int val : values) {
            b.insert(val);
        }
        b.print(); // This will print the elements of the BST in sorted order.
    }
}