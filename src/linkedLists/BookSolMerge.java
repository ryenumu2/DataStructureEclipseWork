package linkedLists;

public class BookSolMerge {
	
	public static OldListNode<Integer> Merge(OldListNode<Integer> L1, OldListNode<Integer> L2) {
		//you will pass in two single OldListNodes to this method. The caveat is that each OldListNode will still have a next field that will
		//point to a different OldListNode, which might point to another OldListNode, etc.
		
		OldListNode<Integer> dummyHead = new OldListNode<>(0,null);
		OldListNode<Integer> current = dummyHead;
		OldListNode<Integer> p1 = L1;
		OldListNode<Integer> p2 = L2;
		
		while(p1 != null && p2 != null) {
			if (p1.data <= p2.data) {
				current.next = p1;
				p1 = p1.next;
			} else {
				current.next = p2;
				p2 = p2.next;
			}
			current = current.next;
		}
		
		current.next = p1 != null ? p1 : p2;
		
		return dummyHead.next;
		//return dummyHead.next.next.data; //if using this return method, Merge is of type Integer since will return '3'
		
	}
	public static void main(String[] args) {
		
		OldListNode<Integer> c = new OldListNode<Integer>(7, null);
		OldListNode<Integer> b = new OldListNode<Integer>(6, c);
		OldListNode<Integer> a = new OldListNode<Integer>(3, b);
		
		//System.out.println(a.data); //should print out 3
		//System.out.println(a.next.data); //should print out 6
		//System.out.println(a.next.next.data); //should print out 7
		
		OldListNode<Integer> f = new OldListNode<Integer>(5, null);
		OldListNode<Integer> e = new OldListNode<Integer>(4, f);
		OldListNode<Integer> d = new OldListNode<Integer>(2, e);
		
		System.out.println(BookSolMerge.Merge(a, d));


	}
}