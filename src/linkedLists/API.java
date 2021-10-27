package linkedLists;

import java.util.LinkedList;

public class API {
	
	public static OldListNode<String> search(OldListNode<String> N, String key) { 
		//OldListNode<String> means you must return a OldListNode!
		
		while (N != null && N.data != key) {
			N = N.next;
		}
		
		return N;
	}
	
	public static void insertAfter(OldListNode<String> node, OldListNode<String> newNode) {
		newNode.next = node.next;
		node.next = newNode;
	}
	
	public static void deleteNodeAfter(OldListNode<String> node) {
		node.next = node.next.next;
	}
	
	public static void main(String[] args) {
		
		//LinkedList<OldListNode> test1 = new LinkedList<OldListNode>();
		
		API test1 = new API();
		
		OldListNode<Integer> dummyHead = new OldListNode<Integer>(0,null);
		
		
		
	}
}