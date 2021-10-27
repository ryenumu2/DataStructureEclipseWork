package linkedLists;

public class basicListAPI {
	
public static OldListNode <Integer> search(OldListNode<Integer> L, int key) {
	while (L != null && L.data != key) {
		L = L.next;
	}
	return L; //search for a specific linkedNode with the key (int key)
}

public static void insertAfter(OldListNode<Integer> node, OldListNode<Integer> newNode) {
	newNode.next = node.next;
	node.next = newNode;
}

public static void deleteList(OldListNode<Integer> aNode) {
	aNode.next = aNode.next.next;
}

//insert and delete have O(1) time complexity
//search has O(n) time complexity, where n is the number of nodes

public static OldListNode <Integer> search2(OldListNode<Integer> L, int key) {
	while (L != null && L.data != key) {
		L = L.next;
	}
	return L;
}

public static void deleteList2(OldListNode<Integer> aNode) {
	aNode.next = aNode.next.next;
}

public static void main(String[] args) {
	basicListAPI test1 = new basicListAPI();
	//test1.search()
	
	
}

}


