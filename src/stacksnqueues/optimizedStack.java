package stacksnqueues;

import java.util.Deque;
import java.util.LinkedList;

public class optimizedStack {
	
	Deque<Integer> element = new LinkedList<>();
	Deque<MaxWithCount> b = new LinkedList<>();
	
	public boolean empty() {
		if (b.isEmpty()) { //cannot make this isEmpty(), since is method that attaches to a deque
			return true;
		}
		return false;
	}
	
	public void push(Integer x) {
		
		element.addFirst(x);
		if (!empty()) {
			if (Integer.compare(x,b.peek().max) == 0) {
				b.peek().count = b.peek().count + 1;
			}
			else if (Integer.compare(x,b.peek().max) > 0) {
				b.addFirst(new MaxWithCount(x, 1));
			}
		} else {
			b.addFirst(new MaxWithCount(x, 1));
		}
	}
	
	public Integer pop() {
		Integer whatisit;
		
		if (empty()) {
			throw new IllegalStateException();
		}
		else {
		
			if (Integer.compare(element.peek(), b.peek().max ) == 0 && b.peek().count >0) {
				b.peek().count = b.peek().count -1;
			}
			else if (Integer.compare(element.peek(), b.peek().max ) == 0 && b.peek().count == 0) {
				b.removeFirst();
			}
			//cannot pop element greater than max(since will be already recorded with push(), and
			//if pop element less than max, shouldn't affect the head of b at all (since head 
			//will always contain max integer stored in element, as well as its count
			whatisit = element.removeFirst(); //should put at end??
		}
		
		return whatisit;
	}
	
	public Integer max() {
		return b.peek().max;
	}
	
	public Integer maxCounter() {
		return b.peek().count;
	}
	
	public static void main(String[] args) {
		optimizedStack a = new optimizedStack();
		//System.out.println(a.pop()); //return IllegalStateException error
		a.push(3);
		System.out.println("max " + a.max()); //print 3
		a.push(4);
		System.out.println("max " + a.max()); //print 4
		a.push(4);
		System.out.println("max " + a.max()); //print 4
		System.out.println("max count " + a.maxCounter()); //print 2
		System.out.println("pop value " + a.pop()); //print 4
		System.out.println("max count " + a.maxCounter()); //print 1
		System.out.println("pop value " + a.pop()); //print 4
		System.out.println("pop value " + a.pop()); //print 3
		
	}
}