package binaryTrees;

class BalanceLeet {
	
	public boolean isBalanced(TreeNode root) {
		if (root==null) {
			return true;
		}
		return height(root) != -1;
	}
	
	public int height(TreeNode node) {
		if (node==null) {
			return 0;
		}
		
		int lh = height(node.left);
		if (lh == -1) {
			return -1;
		}
		
		int rh = height(node.right);
		if (rh == -1) {
			return -1;
		}
		
		if (lh - rh < -1) {
			return -1;
		}
		return Math.max(lh,rh)+1;
	}
}