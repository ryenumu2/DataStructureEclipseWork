package binaryTrees;

public class TreeNode {
	public int val;
	public TreeNode left;
	public TreeNode right;
	
	TreeNode(int val) {
		this.val = val;
	}
	
	TreeNode(TreeNode left, TreeNode right) {
		left = this.left;
		right = this.right;
	}
	
	TreeNode(int val, TreeNode left, TreeNode right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}
}

//a node that has no descendants except for itself is a leaf node
//a node is an ancestor of d if the node lies in the search path
//between the root node and d
