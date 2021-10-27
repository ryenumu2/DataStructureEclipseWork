package stacksnqueues;

import java.util.Deque;
import java.util.LinkedList;

public class ElementsWithCachedMax {
	
	public Integer element; //why Integer (wrapper class) instead of int? 
	public Integer max;

	public ElementsWithCachedMax(Integer element, Integer max) {
		this.element = element;
		this.max = max;
	}
}
