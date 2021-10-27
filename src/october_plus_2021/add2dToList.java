package october_plus_2021;

import java.util.ArrayList;
import java.util.List;

public class add2dToList {
	
	
	List<Integer> addTo1d;
	int[] anarray;
	List<int[]> for10_24_2d;
	
	public void addToListNormally(int[] anarray) { //add
		addTo1d = new ArrayList<Integer>();
		for(int i: anarray) {
			addTo1d.add(i);
		}
	}
	
	public void compareToArr(List<Integer> aList) {
	
		//if (addTo1d.toArray(new int[anarray.length]) == anarray) { won't work due to List<Integer> and int[] type discrepency
		
		int[] newanarray = aList.stream().mapToInt((Integer i)-> i).toArray();
		System.out.println("Yes, we can convert a List of type <Integer> to Array of primitive type int[]!");
		for (int i: newanarray) {
			System.out.println(i);
		}
	}
	
	public void List2d_10_24() {
		int[][] arrtest = {{2,3}, {4,5}, {8, 10}}; //how to initialize and declare a 2d array
		for10_24_2d = new ArrayList<>();
		
		for (int[] i: arrtest) {
			for10_24_2d.add(i);
		}	
	}
	
	public static void main(String[] args) {
		
		add2dToList for_10_24 = new add2dToList();
		int[] arr = {3,5,7,1,5};
		for_10_24.addToListNormally(arr);
		System.out.println(for_10_24.addTo1d); //[3, 5, 7, 1, 5]
		for_10_24.compareToArr(for_10_24.addTo1d);
		
		//test 2d array
		for_10_24.List2d_10_24();
		System.out.println(for_10_24.for10_24_2d.get(1));
	}
}