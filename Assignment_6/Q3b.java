package Assignment_6;
class TreeNode
{
	int val;
	int data;
    TreeNode left, right;
    TreeNode(int v) {
        data = v;
        left = null;
        right = null;
    }
}
public class Q3b 
{
	public static boolean isBinarySearchTree(TreeNode root)
	{
		if(root==null)
			return true;
		if(root.left!=null && getMax(root.left)>root.val)
			return false;
		if(root.right!=null && getMin(root.right)<root.val)
			return false;
		if(!isBinarySearchTree(root.left)||!isBinarySearchTree(root.right))
			return false;
		return true;
	}
	static int getMax(TreeNode root)
	{
		if(root==null)
			return Integer.MIN_VALUE;
		return Math.max(root.val, Math.max(getMax(root.left),getMax(root.right)));
	}
	static int getMin(TreeNode root)
	{
		if(root==null)
			return Integer.MAX_VALUE;
		return Math.min(root.val, Math.min(getMin(root.left),getMin(root.right)));
	}
	public static void main(String[] args)
	{
		TreeNode root = new TreeNode(50);
        root.left = new TreeNode(30);
        root.right = new TreeNode(70);
        root.left.left = new TreeNode(20);
        root.left.right = new TreeNode(40);
        root.right.left = new TreeNode(60);
        root.right.right = new TreeNode(80);
        if (isBinarySearchTree(root))
            System.out.println("The tree is a binary search tree.");
        else
            System.out.println("The tree is NOT a binary search tree.");	
//       int min=root.getMin(root);
	}
}
