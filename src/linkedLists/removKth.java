package linkedLists;

public class removKth {
	
	public static OldListNode<Integer> removeKth(OldListNode<Integer> L, int k) {
		
		OldListNode<Integer> dummyHead = new OldListNode<>(0, null);
		
		dummyHead.next = L;
		OldListNode<Integer> start = dummyHead;
		OldListNode<Integer> end = dummyHead;
		
		while (k>0) {
			end = end.next;
			k--;
		}
		
		while (end.next != null) {
			start = start.next;
			end = end.next;
		}
		
		start.next = start.next.next;
		
		System.out.println(dummyHead.next.data);
		System.out.println(dummyHead.next.next.data);
		System.out.println(dummyHead.next.next.next.data);
		System.out.println(dummyHead.next.next.next.next.data);
		System.out.println(dummyHead.next.next.next.next.next.data);
		
		return dummyHead.next;
	}
	
	public static void main(String[] args) {
		
		OldListNode<Integer> f = new OldListNode<Integer>(1, null);
		OldListNode<Integer> e = new OldListNode<Integer>(2, f);
		OldListNode<Integer> d = new OldListNode<Integer>(5, e);
		OldListNode<Integer> c = new OldListNode<Integer>(6, d);
		OldListNode<Integer> b = new OldListNode<Integer>(8, c);
		OldListNode<Integer> a = new OldListNode<Integer>(3, b);
		
		System.out.println(removKth.removeKth(a, 5)); //should make list 3,6,5,2,1
		System.out.println(removKth.removeKth(a, 2)); //should make list 3,8,6,5,1
		
	}
}