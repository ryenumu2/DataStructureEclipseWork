package heap;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;

public class longestK {
	
public static List<String> topK(int k, Iterator<String> iter) {
	//k represents how many of the longest strings out of the list
	//we want to return. For example, if we want to return 3, and we iterate
	//over a string with a longer string length than any of the
	//top three strings already iterated over, remove the smallest
	//length string from the group of 3 strings to replace.
	PriorityQueue<String> minHeap
	= new PriorityQueue<>(k, new Comparator<String>() {
		public int compare(String s1, String s2) {
			return Integer.compare(s1.length(), s2.length());
		}
	});
	
	while (iter.hasNext()) { //.hasNext: check if there's at least one
		//element left to iterate over. Usually paired with while loop
		minHeap.add(iter.next()); //step over next element and 
		//add it to priority queue simultaneously
		if (minHeap.size() > k) {
			minHeap.poll(); //will retrieve first element at head then REMOVE it. peek() will only retrieve the first element in the queue
		}
	}
	return new ArrayList<>(minHeap);
}

public static void main(String[] args) {
	
	List<String> a = new ArrayList<String>();
	a.add("Hello");
	a.add("huh");
	a.add("whassup");
	a.add("mynameisjeff");
	a.add("somethinglight");
	
	List<String> b = a;
	
	Iterator<String> it = a.iterator();
	Iterator<String> it2 = b.iterator();
	
	System.out.println(topK(4, it)); //returns [Hello, mynameisjeff, whassup, somethinglight]
	System.out.println(topK(2, it2)); //will return [mynameisjeff, somethinglight]
	System.out.println(topK(2, it2)); //will return []: list is already iterated over
	
	
}
}