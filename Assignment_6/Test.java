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
    public static Node root=null;

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
                // Ignore duplicate datavalue
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
    
    public static Node minvalueNode(Node node) {
    	Node cur=node;
    	while(cur.left!=null)
    		cur=cur.left;
    	return cur;
    }
    public static Node deleteNode(Node root,int key) {
    	if(root==null) {
    		return root;
    	}
    	if(key<root.data) 
    		root.left=deleteNode(root.left,key);
    		else if(key>root.data) 
    			root.right=deleteNode(root.right,key);
    			else {
    				if(root.left==null) {
    					return root.right;
    				}
    				else if(root.right==null)
    					return root.left;
    				Node successor=minvalueNode(root.right);
    				root.data=successor.data;
    				root.right=deleteNode(root.right,successor.data);
    			}
    	return root;
    		}
    		
}

public class Test {
    public static void main(String[] args) {
        BST3 b = new BST3();
        int[] datav = {50, 30, 70, 20, 40, 60, 80};
        for (int data : datav) {
            b.insert(data);
        }
        b.print(); // This will print the elements of the BST in sorted order.
        Node k=b.deleteNode(b.root, 20);
        b.print();
        
    }
}