package binaryTrees;

public class TreeBootCamp {
	
	public static void treeTraversal(TreeNode root) {
		if (root != null) {
			System.out.println("Preorder:" + root.val);
			treeTraversal(root.left);
			
			System.out.println("Inorder:" + root.val);
			treeTraversal(root.right);
			
			System.out.println("Postorder:" + root.val);
		}
	}
	
	public static void main(String[] args) {
		
	/*
		TreeNode a = new TreeNode(b,k);
		TreeNode b = new TreeNode(c,h);
		TreeNode c = new TreeNode(d,g);
		TreeNode d = new TreeNode(e,f);
		TreeNode e = new TreeNode(null,null);
		TreeNode f = new TreeNode(null,null);
		TreeNode g = new TreeNode(null,null);
		TreeNode h = new TreeNode(i,j);
		TreeNode i = new TreeNode(null,null);
		TreeNode j = new TreeNode(null,null);
		TreeNode k = new TreeNode(l,o);
		TreeNode l = new TreeNode(m,n);
		TreeNode m = new TreeNode(null,null);
		TreeNode n = new TreeNode(null,null);
		TreeNode o = new TreeNode(null,null);
	*/
		TreeNode o = new TreeNode(15,null,null);
		TreeNode n = new TreeNode(14,null,null);
		TreeNode m = new TreeNode(13,null,null);
		TreeNode l = new TreeNode(12,m,n);
		TreeNode k = new TreeNode(11,l,o);
		TreeNode j = new TreeNode(10,null,null);
		TreeNode i = new TreeNode(9,null,null);
		TreeNode h = new TreeNode(8,i,j);
		TreeNode g = new TreeNode(7,null,null);
		TreeNode f = new TreeNode(6,null,null);
		TreeNode e = new TreeNode(5,null,null);
		TreeNode d = new TreeNode(4,e,f);
		TreeNode c = new TreeNode(3,d,g);
		TreeNode b = new TreeNode(2,c,h);
		TreeNode a = new TreeNode(1,b,k);
		
		TreeBootCamp.treeTraversal(a);	
	}
}