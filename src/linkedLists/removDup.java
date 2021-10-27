package linkedLists;

public class removDup {
	
	public static OldListNode<Integer> removeDup(OldListNode<Integer> L) {
		
		OldListNode<Integer> dummyHead = new OldListNode<>(0,null);
		dummyHead.next = L;
		OldListNode<Integer> prev = dummyHead;
		while(prev.next != null) {
			if (prev.data != prev.next.data) {
				prev = prev.next;
			}
			
			else if (prev.data == prev.next.data && prev.next.next != null) {
				prev.next = prev.next.next;
				prev = prev.next.next;
			}
			
			else if (prev.data == prev.next.data && prev.next.next == null) { 
				//this accounts for situation where second to last node is 11, last node is 11. Here, prev is pointing to 
				//second to last node, and prev.next.next is null, so instead of doing prev = prev.next.next, which is null,
				//I simply make the pointer coming from prev point to nothing, in other words, null.
				prev.next = null;
			}
		}
		
		System.out.println(dummyHead.next.data);
		System.out.println(dummyHead.next.next.data);
		System.out.println(dummyHead.next.next.next.data);
		System.out.println(dummyHead.next.next.next.next.data);
		System.out.println(dummyHead.next.next.next.next.next.data);
		return dummyHead.next;
	}
	
	public static void main(String[] args) {
		
		OldListNode<Integer> g = new OldListNode<Integer>(11, null);
		OldListNode<Integer> f = new OldListNode<Integer>(11, g);
		OldListNode<Integer> e = new OldListNode<Integer>(7, f);
		OldListNode<Integer> d = new OldListNode<Integer>(5, e);
		OldListNode<Integer> c = new OldListNode<Integer>(3, d);
		OldListNode<Integer> b = new OldListNode<Integer>(2, c);
		OldListNode<Integer> a = new OldListNode<Integer>(2, b);
		
		System.out.println(removDup.removeDup(a)); //should make list 2,3,5,7,11
	}
}