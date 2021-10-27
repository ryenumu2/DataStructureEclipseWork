package linkedLists;

class evenOdd {
	
public static ListNode oddEvenList(ListNode head) {
        
	ListNode dummyHead = new ListNode(0,null);
	dummyHead.next = head;
	ListNode curr = dummyHead.next;
	
	if (curr == null || curr.next == null) {
		return dummyHead.next;
	} //make sure to keep if statement before you initialize even_start. This is to 
	  //take the null head into account, where even_start will throw an error since null.next is a
	  //nullpointer exception!
	
	ListNode even_start = curr.next;
	ListNode even_checkpoint = even_start;
	
	/*
	if (curr == null || curr.next == null) {
		return dummyHead.next;
	}
	*/
	
	while (curr != null && curr.next != null && even_start != null && even_start.next != null) {
		curr.next = curr.next.next;
		even_start.next = even_start.next.next;
		curr = curr.next;
		even_start = even_start.next;

	}
	
	if (curr.next == null) {
		curr.next = even_checkpoint;
	}
	else if (curr.next != null) {
		curr.next = null;
		curr.next = even_checkpoint;
	}//make sure to add this else statement for the situation where the number of nodes is even:
	  //this is because curr will equate to the second to last node, and
	  //curr.next will equate to the last node. Not having this statemnt will result in you
	  //connecting the last node to even_checkpoint. To counter this, need to delete this connection
	  //between curr and curr.next, then curr.next, which is now equal to null, will go to even_checkpoint.
	
	else if (curr.next.next == null) {
		curr.next.next = even_checkpoint;
	}
	
	System.out.println(dummyHead.next.val);
	System.out.println(dummyHead.next.next.val);
	System.out.println(dummyHead.next.next.next.val);
	System.out.println(dummyHead.next.next.next.next.val);
	//System.out.println(dummyHead.next.next.next.next.next.val);
	//System.out.println(dummyHead.next.next.next.next.next.next.val);

	
	return dummyHead.next;
	
	
    }

	public static void main(String[] args) {
	//ListNode f = new ListNode(6, null);
	//ListNode e = new ListNode(5, f);
	ListNode d = new ListNode(4, null);
	ListNode c = new ListNode(3, d);
	ListNode b = new ListNode(2, c);
	ListNode a = new ListNode(1, b);
	
	System.out.println(evenOdd.oddEvenList(a));
	}
}