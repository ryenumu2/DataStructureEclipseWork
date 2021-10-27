package linkedLists;

public class rtRght {
	
	public static ListNode rightShift(ListNode head, int k) {
		
		ListNode dummyHead = new ListNode(0,null);
		dummyHead.next = head;
		ListNode curr = dummyHead;
		ListNode end = dummyHead;
		ListNode count = dummyHead;
		int length = 0;
		
		if (head == null) {
            return null;
        } //situation where head is null; edge case to remember to take into account
		
		while (count != null && count.next != null) {
			count = count.next;
			length++;
		}
		
		if (k >= length) {
			k = k % length;
		}
		
		while (k > 0) {
			
			end = end.next;
			k--;
		}
		while (end != null && end.next != null) { //add end != null too??
			curr = curr.next;
			end = end.next;
		}
		
		end.next = dummyHead.next;
		dummyHead.next = curr.next;
		curr.next = null;
		
		System.out.println(dummyHead.next.val);
		System.out.println(dummyHead.next.next.val);
		System.out.println(dummyHead.next.next.next.val);

		return dummyHead.next;
	}
	
	public static void main(String[] args) {
		ListNode c = new ListNode(2, null);
		ListNode b = new ListNode(3, c);
		ListNode a = new ListNode(5, b);
		
		System.out.println(rtRght.rightShift(a,4)); //this edge case makes it so that
		//you cannot iterate curr forward 4 spaces, since the array is only of size 3
		//solution: reduce k by modding it with length to get shift that is less than length (line 19)
	}
}