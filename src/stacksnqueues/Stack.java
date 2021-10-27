package stacksnqueues;

import java.util.Deque;
import java.util.LinkedList;

public class Stack {
	
	private Deque<ElementsWithCachedMax> elementWithCachedMax = new LinkedList<>();

	public boolean empty() {
		return elementWithCachedMax.isEmpty();
	}
	
	public Integer max() {
		if (empty()) {
			throw new IllegalStateException("max(): empty stack");
		}
		return elementWithCachedMax.peek().max; 
		//return whatever is the max parameter 
	}
	
	public Integer pop() {
		if (empty()) {
			throw new IllegalStateException("pop(): empty stack");
		}
		return elementWithCachedMax.removeFirst().element;
	}
	
	public void push(Integer x) {
		elementWithCachedMax.addFirst(new ElementsWithCachedMax(x, Math.max(x, empty() ? x : max())));
	}
	
	public static void main(String[] args) {
		
		Stack a = new Stack();
		
		System.out.println(a.empty()); //print true
		a.push(3);
		a.push(1);
		a.push(5);
		System.out.println("max:" + a.max()); //print 5
		System.out.println("popped:" + a.pop()); //print 5;
		System.out.println("max:" + a.max()); //print 3;
		System.out.println("empty:" + a.empty()); //print false
		
		
		
	}
}