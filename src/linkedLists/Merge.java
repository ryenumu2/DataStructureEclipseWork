package linkedLists;

public class Merge {
	
	public static Integer merge(OldListNode<Integer> L1, OldListNode<Integer> L2) {
 		OldListNode<Integer> p1 = L1;
		OldListNode<Integer> p2 = L2;
		
		OldListNode<Integer> dummyHead = new OldListNode<>(0,null);
		
		OldListNode<Integer> curr = dummyHead;
		
		while (p1 != null && p2 != null) {
			if (p2.data<p1.data) {
				//p2 = curr.next; //with this statement you are making p2, which originally contained 2,4,5, into null
				//curr.next = p2; //with this statement you are setting the next pointer for curr, which is currently
				//pointing to null, to the ENTIRE linked list for p2, which is 2,4,5. THIS IS THE CORRECT WAY, BECAUSE
				//YOU ARE TRYING TO RETURN DUMMY HEAD, NOT CURR.NEXT!!!
				//curr.next.data = p2.data; //you can't access data if curr.next is null! NullPointerException
				curr.next = p2;
				p2 = p2.next;
				curr = curr.next;
			}
			
			else if (p1.data<p2.data) { //why you need else if instead of just if: 
				curr.next = p1;
				p1 = p1.next;
				curr = curr.next;
			}
		}
		
		if(p1 != null) 
			curr.next = p1;
		
		else if (p2 != null)
			curr.next = p2;
		
		return dummyHead.next.next.data;
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
		
		System.out.println(Merge.merge(a, d));
	}
}