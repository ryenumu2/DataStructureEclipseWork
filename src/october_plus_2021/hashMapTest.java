package october_plus_2021;

import java.util.HashMap;
import java.util.Map;

public class hashMapTest {
	
	
	
	
	public static void main(String[] args) {
		String note="randomnote";
		
		Map<Character, Integer> n = new HashMap<Character, Integer>();
		
		for (int i = 0; i < note.length(); i++) {
			if (n.containsKey(note.charAt(i)) == false) {
				n.put(note.charAt(i), 1);
			}
			else {
				int oldCount = n.get(note.charAt(i));
				n.put(note.charAt(i), oldCount+1);
			}
		}
		
		System.out.println(n); //{a=1, r=1, d=1, t=1, e=1, m=1, n=2, o=2}
		
		//
		//
		
		String note2 = "randomnotewww";
		
		Map<Character, Integer> b = new HashMap<Character, Integer>(); //don't forget 'new HashMap'!!
		
		for(int i = 0; i<note2.length(); i++) {
			if (b.containsKey(note2.charAt(i)) == false) {
				b.put(note2.charAt(i), 1);
			}
			else {
				int oldValue = b.get(note2.charAt(i));
				b.put(note2.charAt(i), oldValue+1);
			}
		}
		
		for (char l: b.keySet()) {
			int ab = n.getOrDefault(l, 0);
			System.out.println(l + ": " + ab); //will print '0' for w
			
		}
		
		System.out.println(b.keySet());

	}
}