package stacksnqueues;

import java.util.Deque;
import java.util.LinkedList;

public class ownStack {
	Deque <ElementsWithCachedMax> elem = new LinkedList<>();
	
	public Integer max() {
		if (elem.isEmpty()) {
			throw new IllegalStateException();
		}
		else return elem.peek().max;
	}
	
	public Integer pop() {
		if (elem.isEmpty()) {
			throw new IllegalStateException();
		}
		else return elem.removeFirst().element;
	}
	
	public boolean isEmpty() {
		if (elem == null) {	//not the right way to do it: will not actually prove if empty or not
			return true;
		}
		
		return false;
	}
	
	public void pushin(Integer x) {
		elem.addFirst(new ElementsWithCachedMax(x, Math.max(elem.isEmpty()/*this 
		will use the isEmpty() functionality, NOT the actual isEmpty() method defined in this class*/ ? x : max(), x)));
	}
	
	public static void main(String[] args) {
		ownStack a = new ownStack();
		a.pushin(7);
		System.out.println(a.isEmpty());
		a.pushin(12);
		System.out.println("max: " + a.max());
		System.out.println("pop: " + a.pop());
		System.out.println("max: " + a.max());
	}
}