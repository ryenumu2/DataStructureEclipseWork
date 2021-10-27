package heap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

class heapTest2 {
	
	public static void main(String[] args) {
	
	PriorityQueue<Integer> b = new PriorityQueue<>(new Comparator<Integer>() {
		public int compare(Integer x, Integer y) {
			return x-y;
		}
	});
		
	PriorityQueue<Integer> a = new PriorityQueue<>(new Comparator<Integer>() {
		public int compare(Integer x, Integer y) {
			return Integer.compare(x,y);
		}
	});
	
	ArrayList<Integer> arr = new ArrayList<>();
	arr.add(5);
	arr.add(2);
	arr.add(8);
	arr.add(1);
	
	
	for(int ele: arr) {
		b.add(ele);
	}
	
	System.out.println(b);
	b.poll();
	System.out.println(b);
	b.poll();
	System.out.println(b);
	b.poll();
	System.out.println(b);

	for(int ele: arr) {
		a.add(ele);
	}
	
	System.out.println(a);
	a.poll();
	System.out.println(a);
	a.poll();
	System.out.println(a);
	a.poll();
	System.out.println(a);
	
	
	//both return x-y and Integer.compare(x,y) will do the same thing;
	
	
	int[][] arr2 = {{2,3}, {5,10}, {12, 5}, {1,6}};
	
	Arrays.sort(arr2, new Comparator<int[]>() {
		public int compare(int x[], int y[]) {
			return Integer.compare(x[0],y[0]);
		}
	}); //how to order multidimensional arrays in ascending order
	
	for(int i=0;i<arr2.length;i++) {
		for (int j=0; j<2; j++) {
	System.out.println(arr2[i][j]);
			}
		}
	}
}