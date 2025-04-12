package Assignment_6;
class BSTNode2 {
	int info;
	BSTNode2 left,right;
	public BSTNode2(int info) {
		this.info=info;
		this.left=null;
		this.right=null;
	}	
}
class BinarySearchTree2 {
	BSTNode2 node;
	public BinarySearchTree2() {
		node=null;
	}
	public boolean isBST() {
		return isBST(node,Integer.MIN_VALUE,Integer.MAX_VALUE);
	}
	private boolean isBST(BSTNode2 node,int min,int max) {
		if(node==null) {
			return true;
		}
		if(node.info<=min||node.info>=max) {
			return false;
		}
		return isBST(node.left,min,node.info) && isBST(node.right,node.info,max);
	}
	public BSTNode2 insert(BSTNode2 node,int value) {
		if(node==null) {
			return new BSTNode2(value);
		}
		if(value<node.info) {
			node.left=insert(node.left,value);
		}else if(value>node.info) {
			node.right=insert(node.right,value);
		}
		return node;
	}
	public void insert(int value) {
		node=insert(node,value);
	}
}
public class Q3 {
	public static void main(String[] args) {
		BinarySearchTree2 bst2= new BinarySearchTree2();
		bst2.insert(50);
		bst2.insert(30);
		bst2.insert(70);
		bst2.insert(20);
		bst2.insert(40);
		bst2.insert(60);
		bst2.insert(80);
		if(bst2.isBST()) {
			System.out.println("The tree is a binary search tree.");
		}else {
			System.out.println("The tree is a binary search tree.");
		}
	}

}
