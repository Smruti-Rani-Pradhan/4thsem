package Assignment_6;
class BSTNode1 {
	int info;
	BSTNode1 left,right;
	public BSTNode1(int info) {
		this.info=info;
		this.left=null;
		this.right=null;
	}	
}
class BinarySearchTree1 {
	BSTNode1 root;
	public BinarySearchTree1() {
		root=null;
	}
	public void createTree(int[] arr) {
		root=createTreeRec(arr,0,arr.length-1);
	}
	private BSTNode1 createTreeRec(int[] arr, int start, int end) {
		if(start>end) {
			return null;
		}
		int mid=(start+end)/2;
		BSTNode1 node=new BSTNode1(arr[mid]);
		node.left=createTreeRec(arr,start,mid-1);
		node.right=createTreeRec(arr,mid+1,end);
		return node;
	}
	public void inOrder() {
		System.out.print("In-Order: ");
		inOrderRec(root);
		System.out.println();
	}
	private void inOrderRec(BSTNode1 node) {
		if(node!=null) {
			inOrderRec(node.left);
			System.out.print(node.info+" ");
			inOrderRec(node.right);
		}
	}
}
public class Q2 {
	public static void main(String[] args) {
		BinarySearchTree1 bst1= new BinarySearchTree1();
		int[] values= {10,20,30,40,50,60,70,80,90,100};
		bst1.createTree(values);
		bst1.inOrder();
	}

}
