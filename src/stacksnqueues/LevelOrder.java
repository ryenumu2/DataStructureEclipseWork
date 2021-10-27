package stacksnqueues;

import java.util.ArrayList;
import java.util.List;

import binaryTrees.TreeNode;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class LevelOrder {
    List<List<Integer>> a = new ArrayList<List<Integer>>();
    
    public List<List<Integer>> levelOrder(TreeNode root) {
        check(root,0);
        return a;
    }
    
    public void check(TreeNode root, int level) {
            if (root==null) {
                return;
            }
            if (a.size() == level) {
                a.add(new ArrayList<Integer>());
            }
            a.get(level).add(root.val);

            
            check(root.left, level+1);
            check(root.right, level+1);
        }
}