package binaryTrees;

public class Sym {
	
public static boolean isSymmetric(TreeNode root) {
		return symAnalysis(root.left, root.right);
    }

public static boolean symAnalysis(TreeNode left_subtree, TreeNode right_subtree) {
	if ((left_subtree == null) && (right_subtree == null)) {
		return true;
	}

	
	if ((left_subtree != null) && (right_subtree != null)) {
		if ((left_subtree.val == right_subtree.val) 
				&& symAnalysis(left_subtree.left, right_subtree.right) 
				&& symAnalysis(left_subtree.right, right_subtree.left)) {
			return true;
		}
	}
	
	return false;
}

public static void main(String[] args) {
	
	TreeNode l = new TreeNode(3, null, null);
	TreeNode k = new TreeNode(4, null, null);
	TreeNode j = new TreeNode(4, null, null);
	TreeNode i = new TreeNode(3, null, null);
	TreeNode h = new TreeNode(2, k, l);
	TreeNode g = new TreeNode(2, i, j);
	TreeNode f = new TreeNode(1, g, h);
	
	//System.out.println(Sym.isSymmetric(f));
	
	TreeNode e = new TreeNode(3, null, null);
	TreeNode d = new TreeNode(3, null, null);
	TreeNode c = new TreeNode(2, null, e);
	TreeNode b = new TreeNode(2, null, d);
	TreeNode a = new TreeNode(1, b, c);
	
	System.out.println(Sym.isSymmetric(a));
	}
}