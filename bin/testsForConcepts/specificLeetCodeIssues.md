for https://leetcode.com/problems/balanced-binary-tree/submissions/: Time Limit Exceeded, maybe because returning
check(root.left), check(root.right)??

class Solution {
    
    boolean balancedFlag = true;

    public int check(TreeNode root) {
            if (root==null) {
                return 0;
            }
            this.check(root.left);
            this.check(root.right);
            if (Math.abs(check(root.left)-check(root.right)) > 1) {
                this.balancedFlag = false;
                
            }
            return Math.max(this.check(root.left), this.check(root.right)) + 1;
        }
    
    public boolean isBalanced(TreeNode root) {
        this.check(root);
        return this.balancedFlag;
    }
}

solution: did this:

class Solution {
    
    boolean balancedFlag = true;

    public int check(TreeNode root) {
            if (root==null) {
                return 0;
            }
            int left = this.check(root.left);
            int right = this.check(root.right);
            if (Math.abs(left-right) > 1) {
                this.balancedFlag = false;
                
            }
            return Math.max(left, right) + 1;
        }
    
    public boolean isBalanced(TreeNode root) {
        this.check(root);
        return this.balancedFlag;
    }
}

where I created variables for this.check(root.left), so that the value is set to a variable and that variable is used, rather than computing check(root.left) every time Math.abs(left-right) > 1 and math.max(left, right) + 1 are run

Small note that helped me. if recursive calls before conditional check, then its bottom up. If recursive call after conditional check, its top down.

__________________________________________________________________________

Heap:

You cannot instantiate an Iterator because Iterator is an interface

Use heap when all you care about is the largest or smallest elements. You do not need to support fast lookup, delete, or search operations for arbitrary elements. Additionally, it is a good choice when you need to compute the k largest or k smallest elements in a collection. If you want to compute the k largest, use min-heap. When you want to compute the k smallest, use max-heap.

Min-heap: k largest
Max-heap: k smallest

Natural Order: a comparator will order it from minimum to maximum in a priority queue, so that 
by default, popping from the PriorityQueue will pop out the minimum element
https://stackoverflow.com/questions/11003155/change-priorityqueue-to-max-priorityqueue?noredirect=1&lq=1
