package stacksnqueues;

import java.util.Deque;
import java.util.LinkedList;

public class ValidParenth {
    public boolean isValid(String s) {
        
        Deque <Character> a = new LinkedList<>();
        
        Deque <Character> b = new LinkedList<>();
            
        for (int i = 0; i<s.length(); i++) {
            a.addFirst(s.charAt(i));
        }
        
        while (!a.isEmpty()) {
        	
        	char some = a.removeFirst();
        	
            if ((some == ']' && a.peek() == '[') || (some == '}' && a.peek() == '{') || (some == ')' && a.peek() == '(')) {
                b.addFirst(some);
            	b.removeFirst();
                a.removeFirst();
            }
            
            else if (some == '}' || some == ']' || some == ')') {
                b.addFirst(some);
            }
            
            else if (some == '{' || some == '[' || some == '(') {
            	b.addFirst(some);
            }
        }
        return b.isEmpty();
    }
}