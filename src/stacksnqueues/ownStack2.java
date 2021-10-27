package stacksnqueues;

import java.util.Deque;
import java.util.LinkedList;

public class ownStack2 {
	
	Deque<ElementsWithCachedMax> a = new LinkedList<>();
	
	/*
	class ElementsWithCachedMax {
	private Integer element;
	private Integer max;
	
	public ElementsWithCachedMax() {
		this.value = value;
		this.max = max;
			}
		}
	*/
	
	public Integer pop() {
		//can have if condition: if empty, throw new IllegalStateException(), else
		return a.removeFirst().element;
	}
	
	public Integer max() {
		if (a.isEmpty()) {
			throw new IllegalStateException();
		}
		return a.peek().max; //question: how to get max parameter from a, 
		//without doing pop(), since that will remove the first element
		
		//answer: don't forget about peek(), which will look at the very
		//first element in the stack WITHOUT completely removing it from stack
	}
	
	public boolean empty() {
		/*
		if (a != null) {
			return true;
		}
		*/
		
		//^this was the mistake: (a==null) is not a valid thing to test for emptiness
		if (a.isEmpty()) {
			return true;
		}
		return false;
	}
	
	public void push(Integer x) {
		//a.addFirst(x, isEmpty() ? x: Math.max(x, max())); //remember to add Math before max
		
		//remember: when adding a new element with a custom type, that custom type is defined
		//by using the new keyword, followed by the appropriate parameters for each field in that
		//custom type. 
		
		a.addFirst(new ElementsWithCachedMax(x, empty() ? x: Math.max(x, max())));
		//also, a.max() won't work: is not a method associated with new object. Instead, 
		//simply write max(), since this is a method within the ownStack2 class
		
		/*
		if (empty()) {
			a.addFirst(new ElementsWithCachedMax(x, x));
		}
		else {
			a.addFirst(new ElementsWithCachedMax(x, Math.max(x, max())));
		}
		*/
	}
	
	public static void main(String[] args) {
		ownStack2 a = new ownStack2();
		a.push(7);
		System.out.println(a.empty());
		a.push(12);
		System.out.println("max: " + a.max());
		System.out.println("pop: " + a.pop());
		System.out.println("max: " + a.max());
	}
}