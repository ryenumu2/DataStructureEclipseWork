package linkedLists;

class RemoveDup {
    public ListNode deleteDuplicates(ListNode head) {
    	
        ListNode dummyHead = new ListNode(0,null);
		dummyHead.next = head;
		ListNode prev = dummyHead;
		while(prev != null && prev.next != null) { //have to also make sure prev != null. 
			
			if (prev.val == prev.next.val && prev.next.next == null) { 

				prev.next = null;
			}
			
			while (prev != null && prev.next != null && prev.val != prev.next.val && prev.next.next != null) {
			if (prev.val != prev.next.val) {
				prev = prev.next;
			}
			
			prev.next = prev.next.next;
			prev = prev.next;
			}

			
		}

		System.out.println(dummyHead.next.val);
		System.out.println(dummyHead.next.next.val);
		System.out.println(dummyHead.next.next.next.val);
		System.out.println(dummyHead.next.next.next.next.val);
		System.out.println(dummyHead.next.next.next.next.next.val);
		return dummyHead.next;
    }
    
    public ListNode deleteDupes(ListNode head) {
    	
    	ListNode dummyHead = new ListNode(-101, null); //made dummy head -101, because .val can only be between -100 and 300
    	dummyHead.next = head;
    	
    	ListNode prev = dummyHead;
    	
    	while (prev != null && prev.next != null && prev.next.next != null) {
    		
    		if (prev.val == prev.next.val) {
    			prev.next = prev.next.next;
    			if (prev.val != prev.next.val) {
    				prev = prev.next;
    			}
    		}
    		
    		else if (prev.val != prev.next.val) {
    			prev = prev.next;
    		}
    	}
    	
    	if (prev != null && prev.next != null) {
    		if (prev.val == prev.next.val) {
    			prev.next = null;
    		}
    		else prev = prev.next;
    	}
    	
		return dummyHead.next;
    	
    }
    
    //test case to think about: [0,0,0,0,0] should output [0], not [].
    
	public static void main(String[] args) {
		
		ListNode m = new ListNode(1, null);
		ListNode l = new ListNode(1, m);
		ListNode k = new ListNode(1, l);
		
		ListNode j = new ListNode(2, null);
		ListNode i = new ListNode(1, j);
		ListNode h = new ListNode(1, i);	
		
		ListNode g = new ListNode(11, null);
		ListNode f = new ListNode(11, g);
		ListNode e = new ListNode(7, f);
		ListNode d = new ListNode(5, e);
		ListNode c = new ListNode(3, d);
		ListNode b = new ListNode(2, c);
		ListNode a = new ListNode(2, b);
		
		RemoveDup test1 = new RemoveDup();
		//System.out.println(test1.deleteDuplicates(a)); //should make list 2,3,5,7,11
		//System.out.println(test1.deleteDuplicates(h)); 
		System.out.println(test1.deleteDupes(k));

	}
}


/*
public class ListNode {
	public ListNode(int val, ListNode next) {
	this.val = val;
	this.next = next;
}
sample use case: 

ListNode dummyHead = new ListNode(0,null);
*/