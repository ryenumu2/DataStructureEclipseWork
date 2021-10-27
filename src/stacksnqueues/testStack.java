package stacksnqueues;

import java.util.Deque;
import java.util.LinkedList;

public class testStack {
	
	Deque<String> a = new LinkedList();
	Deque<String> b = new LinkedList(); //can I not have a type for Deque? NO
	public static void main(String[] args) {
		
		testStack test = new testStack();
		test.a.addFirst("3");
		test.a.addFirst("8");
		test.a.addFirst("2");
		//test.a.addFirst(1);
		
		
		/*
		test.b.addFirst(test.a.removeFirst());
		test.b.addFirst(test.a.removeFirst());

		
		System.out.println(test.b); //will print out 1: means the line above works
		System.out.println(Integer.parseInt(test.b.removeFirst()) + Integer.parseInt(test.b.removeFirst()));
		//without Integer.parseInt around EACH operand, will not output (3): 2 + 1. Instead, will output 21
		*/
		System.out.println(test.a);
		if (test.a.removeFirst() == "2") {
			test.a.removeFirst();
		}
		System.out.println(test.a); //yes, the removeFirst in the if statement will automatically
		//compute, and the removeFirst in the body of the if statement will compute as well
	}
}