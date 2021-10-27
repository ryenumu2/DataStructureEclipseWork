package binaryTrees;

public class BalanceStatusWithHeight {
	public boolean balanced;
	public int height;
	
	public BalanceStatusWithHeight(boolean balanced, int height) {
		this.balanced = balanced;
		this.height = height;
	}


	public static boolean isBalanced(TreeNode tree) {
		return checkBalanced(tree).balanced;
	}

	private static BalanceStatusWithHeight checkBalanced(TreeNode tree) {
		if (tree == null) {
			return new BalanceStatusWithHeight(true, -1);
		}
		
		BalanceStatusWithHeight leftResult = checkBalanced(tree.left);
		if (!leftResult.balanced) {
			return leftResult;
		}
		
		BalanceStatusWithHeight rightResult = checkBalanced(tree.right);
		if (!rightResult.balanced) {
			return rightResult;
		}
		
		boolean isBalanced = Math.abs(leftResult.height - rightResult.height) <= 1;
		int height = Math.max(leftResult.height, rightResult.height) + 1;
		return new BalanceStatusWithHeight(isBalanced, height);
		}
	
	public static void main(String[] args) {
		TreeNode e = new TreeNode(7, null, null);
		TreeNode d = new TreeNode(15, null, null);
		TreeNode c = new TreeNode(20, d, e);
		TreeNode b = new TreeNode(9, null, null);
		TreeNode a = new TreeNode(3, b, c);
		
		System.out.println(BalanceStatusWithHeight.isBalanced(a));
		
		TreeNode l = new TreeNode(4, null, null);
		TreeNode k = new TreeNode(4, null, null);
		TreeNode j = new TreeNode(3, null, null);
		TreeNode i = new TreeNode(3, k, l);
		TreeNode h = new TreeNode(2, null, null);
		TreeNode g = new TreeNode(2, i, j);
		TreeNode f = new TreeNode(1, g, h);
		
		System.out.println(BalanceStatusWithHeight.isBalanced(f));

		
		
	}
}