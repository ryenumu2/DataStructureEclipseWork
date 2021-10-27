package linkedLists;

public class ListNode {
    public int val;
    public ListNode next;
	//public Integer data;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    public ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

/*
		System.out.println(dummyHead.next.val);
		System.out.println(dummyHead.next.next.val);
		System.out.println(dummyHead.next.next.next.val);
		System.out.println(dummyHead.next.next.next.next.val);
		System.out.println(dummyHead.next.next.next.next.next.val);
*/
