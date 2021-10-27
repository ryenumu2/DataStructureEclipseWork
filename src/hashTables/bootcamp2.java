package hashTables;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

class bootcamp2 {
	
	public static void main(String[] args) {
		
		String ransomNote = "somerandommessage";
		Map<Character, Integer> ransomNoteCount = new HashMap<Character, Integer>();
		
		for(int i = 0; i<ransomNote.length(); i++) {
			if (ransomNoteCount.get(ransomNote.charAt(i)) == null) { //can also do ransomNote.containsKey(ransomNote.charAt(i)) == false
				ransomNoteCount.put(ransomNote.charAt(i), 1);
			}
			else {
				int oldCount = ransomNoteCount.get(ransomNote.charAt(i));
				ransomNoteCount.put(ransomNote.charAt(i), oldCount+1);
			}
		}
		
		System.out.println(ransomNoteCount); //{a=2, r=1, s=3, d=1, e=3, g=1, m=3, n=1, o=2}
		
		String magazine = "anothermessagezzz";
		Map<Character, Integer> magazineCount = new HashMap<Character, Integer>();

		
		for(int i = 0; i<magazine.length(); i++) {
			if (magazineCount.get(magazine.charAt(i)) == null) { //can also do ransomNote.containsKey(ransomNote.charAt(i)) == false
				magazineCount.put(magazine.charAt(i), 1);
			}
			else {
				int oldCount = magazineCount.get(magazine.charAt(i));
				magazineCount.put(magazine.charAt(i), oldCount+1);
			}
		}
		
		System.out.println(magazineCount); //{a=2, r=1, s=3, d=1, e=3, g=1, m=3, n=1, o=2}

		//goal: get test case to pass: ensure the number of characters in ransomNote is less than or equal to 
		//the number of characters in magazineCount
		
		System.out.println("ransomNote keyset is: " + ransomNoteCount.keySet());
		for (char sing: ransomNoteCount.keySet()) { //cannot iterate through just a hashmap, need to make into keySet
			int count = magazineCount.getOrDefault(sing, 0);
			if (count < ransomNoteCount.get(sing)) {
				System.out.println(sing + " is in ransomNote but not (the same or greater than) in magazine!");
			}
		}
		
		

		/*
		PriorityQueue<Integer> abb = new PriorityQueue<Integer> ( new Comparator<Integer>() {
			public int compare(Integer a, Integer b) {
				return Integer.compare(a,b); //smallest to largest, with smallest values getting popped first
			}
		});
		
		abb.add(3);
		abb.add(5);
		abb.add(1);
		System.out.println(abb);
		abb.poll(); 
		System.out.println(abb);
		*/

	
	}
}