package stacksnqueues;

import java.util.Deque;
import java.util.LinkedList;

import linkedLists.ListNode;

public class stacksBootCamp {
	
	//push() : addFirst()
	//peek() : peekFirst()
	//pop() :  removeFirst()
	
	public static void printLinkedListInReverse(ListNode head) {
		Deque<Integer> nodes = new LinkedList<>();
		while (head != null) {
			nodes.addFirst(head.val);
			head = head.next;
		}
		while (!nodes.isEmpty()) {
			System.out.println(nodes.poll()); //display the head of the deque, then remove it from the stack
		}
	}
	
	public static void main(String[] args) {
		ListNode d = new ListNode(1, null);
		ListNode c = new ListNode(8, d);
		ListNode b = new ListNode(3,c);
		ListNode a = new ListNode(12, b);
		printLinkedListInReverse(a); //will print 1,8,3,12 (from last node to first node)
	}
}