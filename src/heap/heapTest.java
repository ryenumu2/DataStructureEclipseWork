package heap;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;

public class heapTest {

	public static List<String> topK(int k, Iterator<String> iter) {
		return null;
		//PriorityQueue<String> minHeap
	}
	
public static void main(String[] args) {
	
	PriorityQueue<String> minHeap = new PriorityQueue<>(3, new Comparator<String>() {
		public int compare(String s1, String s2) {
			return Integer.compare(s1.length(), s2.length());
		}
	});
	
	PriorityQueue<Integer> ab = new PriorityQueue<Integer>(3, new Comparator<Integer>() {
		public int compare(Integer s1, Integer s2) {
			return Integer.compare(s1, s2);
		}
	});
	


	
	//You cannot instantiate an Iterator because Iterator is an interface
		ArrayList<String> a = new ArrayList<String>();
		a.add("hi");
		a.add("whats");
		a.add("up");
		Iterator<String> testIt = a.iterator();
		
		while (testIt.hasNext()) { //returns true if iteration has more elements
		minHeap.add(testIt.next()); //will print true if minHeap.add() done successfully
		//System.out.println(testIt.next()); //returns next element in iteration
		
		//testIt.next() will iterate to next element in arrayList
		//therefore, another System.out.println(testIt.next()) will 
		//make it so that "hi" is iterated by minHeap.add, and "whats"
		//is what actually gets printed out
		}
		System.out.println(new ArrayList<>(minHeap));
		
		PriorityQueue <Integer> abb = new PriorityQueue<Integer>(3, new Comparator<Integer>() {
			public int compare(Integer a, Integer b) {
				return Integer.compare(a,b);
			}
		}); //abb is a minHeap. It will order the elements in the array based on the Comparator, which
			//orders the numbers based on their magnitude. Thus, every time we pop() abb, we will be 
			//popping the least number in the list. IF we continue popping, we will reach the biggest
			//numbers last.
		
		PriorityQueue <Integer> abbc = new PriorityQueue<Integer>(3, new Comparator<Integer>() {
			public int compare(Integer a, Integer b) {
				return Integer.compare(a,b) * -1;
			}
		}); //abbc is a MaxHeap, with the addition of *-1
		
		abb.add(4);
		//System.out.println(abb);
		abb.add(2);
		//System.out.println(abb);
		abb.add(1);
		//System.out.println(abb);
		abb.add(5);
		//System.out.println(abb);
		//System.out.println("peek: " + abb.peek()); //1 is at head of queue
		abb.poll();
		//System.out.println(abb);
		abb.poll();
		//System.out.println(abb);

		
		
		while (abb.size() > 0) {
			abb.poll();
		}
		//can do abb.clear() to clear all elements as well
		//System.out.println(abb); //is now empty
		
		
		ArrayList<Integer> b = new ArrayList<Integer>();
		b.add(3);
		b.add(2);
		b.add(14);
		b.add(6);
		b.add(1);
		
		//Iterator itB = new ArrayList<Integer>(); wrong way to use Iterator
		Iterator<Integer> itB = b.iterator();
		
		while (itB.hasNext()) {
			abb.add(itB.next());
			if (abb.size() > 3) {
				//System.out.println("removing: " + abb.poll());
				//when abb.size() reaches 4, will find the head of array and remove element
			}
		}
		//System.out.println(abb);
		//System.out.println(new ArrayList<>(abb));
		
		//int[] array = new int[3];
		int[] array = {2,10,9};
		//array[] = [2,6,7];
		
		
		PriorityQueue<Integer> bigRock = new PriorityQueue<>(3, new Comparator<Integer>() {
			public int compare(Integer x1, Integer x2) {
				return Integer.compare(x1, x2);
			}
		});
		
		for (int element: array) {
			bigRock.add(element);
		}
		
		System.out.println(new ArrayList(bigRock)); //notice how array is [2, 10, 9]
		System.out.println(bigRock);
		bigRock.poll();
		System.out.println(bigRock); //will be [9, 10], with 2 being removed at head
		//this is a minHeap: the k greatest elements are displayed 
		bigRock.add(12);
		bigRock.add(1);
		System.out.println(bigRock);
		bigRock.poll();
		System.out.println(bigRock);
		//adding an element to PriorityQueue WILL organize the number into the correct indice 
		//based on order specfied by PriorityQueue comparator. It will NOT just add the number to
		//the end of the PriorityQueue regardless of magnitude
		
		//Integer.intValue(): will return the int form of wrapper Integer


		
		
		
		
		
	
}
}