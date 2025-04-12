package Assignment_6;
class BstNode{
	int info;
	BstNode left,right;
	public BstNode(int info) {
		this.info=info;
		this.left=null;
		this.right=null;
	}
}
class BST{
	BstNode root;
	public BST() {
		root=null;
	}
	public void insert(int key) {
		root=insertRec(root,key);
	}
	private BstNode insertRec(BstNode root, int key) {
		if(root==null) {
			return new BstNode(key);
		}
		if(key<root.info) {
			root.left=insertRec(root.left,key);
		}
		else if(key>root.info) {
			root.right=insertRec(root.right,key);
		}
		return root;
	}
	public void preorder() {
		System.out.println("Pre-order:");
		preOrderRec(root);
		System.out.println();
	}
	private void preOrderRec(BstNode node) {
		if(node!=null) {
			System.out.println(node.info+" ");
			preOrderRec(node.left);
			preOrderRec(node.right);
			
		}
	}
	public void Inorder() {
		System.out.println("In-order:");
		InOrderRec(root);
		System.out.println();
	}
	private void InOrderRec(BstNode node) {
		if(node!=null) {
			InOrderRec(node.left);
			System.out.println(node.info+" ");
			InOrderRec(node.right);
			
		}
	}
	public void Postorder() {
		System.out.println("Post-order:");
		PostOrderRec(root);
		System.out.println();
	}
	private void PostOrderRec(BstNode node) {
		if(node!=null) {
			PostOrderRec(node.left);
			PostOrderRec(node.right);
			System.out.println(node.info+" ");
		}
	}
}

public class Q1BST {
 
	public static void main(String[] args) {
	BST b=new BST();
	int []v= {50,30,70,20,40,60,80};
	for(int val:v) {
		b.insert(val);
	}
	b.preorder();
	b.Postorder();
	b.Inorder();
	

	}

}
