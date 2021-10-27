package Search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class binarySearch {
	
	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<>();
		a.add(3);
		a.add(4);
		a.add(8);
		a.add(10);
		System.out.println(a); //[3,4,8,10]
		
		System.out.println(Collections.binarySearch(a, 8)); //will return indice 2, which contains 8
		
		
		int[] b = new int[6]; //remember how to initialize a regular array
		
		b[0] = 5;
		b[1] = 10;
		b[2] = 2;
		b[3] = 80;
		b[4] = 19;
		
		System.out.println(b); //note how this will print the location of array in memory
		
		for (int e:b) {
			//System.out.println(e);
		}
		
		System.out.println(Arrays.binarySearch(b,80)); //returns -11 : array b isn't sorted
		System.out.println(Arrays.binarySearch(b,10)); //returns 1
		System.out.println(Arrays.binarySearch(b,80)); //returns -11 : array b isn't sorted
		
		PriorityQueue<Integer> c = new PriorityQueue<Integer>(new Comparator<Integer>() {
			public int compare(Integer a, Integer b) {
				return Integer.compare(a,b);
			}
		});
		
		for (int ele: b) {
			c.add(ele);
		}
		
		//System.out.println(c.poll()); confirm c is from least to greatest 
		//System.out.println(c.poll());
		//System.out.println(c.poll());
		
		int[] d = new int[b.length];
		
		for (int i=0; i<b.length; i++) {
			d[i] = c.poll();
		}
		
		for (int aq: d) {
			System.out.println(aq); //array d is now sorted in ascending order
		}
		
		System.out.println("correct: " + Arrays.binarySearch(d,80)); //returns 5: index where 80 exists
		System.out.println("correct: " + Arrays.binarySearch(d,10)); //returns 3: index where 10 exists
		
		//remember MUST BE SORTED before hand if using binarySearch, or will output garbage answers!!
		
		
		ArrayList<Integer> dup = new ArrayList<>();
		
		dup.add(3);
		dup.add(3);
		dup.add(3);
		dup.add(3);
		dup.add(4);
		dup.add(4);
		
		System.out.println(Collections.binarySearch(dup,3)); //will output 2, which is NOT the first occurrence (is closest to midpoint)
		System.out.println(Collections.binarySearch(dup,3)); //still 2, so not garbage
		System.out.println(Collections.binarySearch(dup,3)); //still 2
		
		
		//identify midpoint index of array:
		
		int mid = ((dup.size()-1)-0)/2; //NOTE: java int will round down!! So, since this is 2.5, will round down to 2!!!
		System.out.println(mid); //will print 2, which is the index closest to mid-point
		


	}
}