package linkedLists;
//remember, when debugging, after making a change to something, completely stop program, then press debug button again to reset variables from beginning!!
public class reverseSubList {
	
	public static OldListNode<Integer> reverse(OldListNode<Integer> L, int s, int f) {
		
		OldListNode<Integer> dummyHead = new OldListNode<>(0, null);
		dummyHead.next = L;
		OldListNode<Integer> head = dummyHead;
		OldListNode<Integer> real_end = dummyHead.next;
		int n = f-s;
		
		while (s>1) { //this shouldn't be s>0: while loop exits ONCE s is 0, meaning it will go through with s = 1, increment head, decrement s to 0, THEN quit
			head = head.next;
			s--;
		}
		
		while (f > 0) {
			real_end = real_end.next;
			f--;
		}
		
		
		OldListNode<Integer> end = head.next;
		OldListNode<Integer> prev = head.next;
		OldListNode<Integer> curr = prev.next;
		OldListNode<Integer> third;
		
		
		
		while (n > 1) {
			third = curr.next;
			curr.next = prev;
			prev = curr;
			curr = third;
			n--;
		}
		
		head.next = curr;
		end.next = real_end;
		
		System.out.println(dummyHead.next.data);
		System.out.println(dummyHead.next.next.data);
		System.out.println(dummyHead.next.next.next.data);
		System.out.println(dummyHead.next.next.next.next.data);
		System.out.println(dummyHead.next.next.next.next.next.data);
		
		return dummyHead.next;
	}
	
	public static void main(String[] args) {

		OldListNode<Integer> g = new OldListNode<Integer>(2, null);
		OldListNode<Integer> f = new OldListNode<Integer>(7, g);
		OldListNode<Integer> e = new OldListNode<Integer>(9, f);
		OldListNode<Integer> d = new OldListNode<Integer>(8, e);
		OldListNode<Integer> c = new OldListNode<Integer>(5, d);
		OldListNode<Integer> b = new OldListNode<Integer>(3, c);
		OldListNode<Integer> a = new OldListNode<Integer>(11, b);
		
		System.out.println(reverseSubList.reverse(a, 3, 6)); //went from 11->3->5->8->9->7->2 to 
															 //			 11->3->7->9->8->5->2

	}
}