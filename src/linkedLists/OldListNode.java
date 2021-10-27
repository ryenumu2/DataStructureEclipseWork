package linkedLists;

public class OldListNode<T> { //<T> makes this a generic class that can be parameterized over different non-primitive types
	public OldListNode(T data, OldListNode<T> next) {
		this.data = data;
		this.next = next;
	}
	public T data;
	public OldListNode<T> next;
}

//Leetcode implementation:
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
