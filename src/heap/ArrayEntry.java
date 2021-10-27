package heap;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;

//will create a complete sorted array 
//out of all the different arrays sorted
//out. For example, <3,5,7>, <0,6>, and <0,6,28>
//will combine to form <0,0,3,5,6,6,7,28>

class ArrayEntry {
	public Integer value;
	public Integer arrayId;
	
	public ArrayEntry(Integer value, Integer arrayId) {
		this.value = value;
		this.arrayId = arrayId;
	}

	
	public static List<Integer> mergeSortedArrays(List<List<Integer>> sortedArrays)
	//List<List<Integer>> will be a list of different lists of integers, as shown in problem description on the first lines
	{
		List<Iterator<Integer>> iters = new ArrayList<>(sortedArrays.size()); //create a new, empty arraylist with size of number of integers in array
		//System.out.println(sortedArrays.size()); //will print out 3
		for (List<Integer> array: sortedArrays) { //array is at first [3,5,7], then [0,6], etc.
			iters.add(array.iterator()); //iterator: read and remove operation
		}
		//iters, of type Iterator<Integer>, will now have three lists of type integer, each of which contains the different lists of numbers
		PriorityQueue<ArrayEntry> minHeap = new PriorityQueue<>(
				//minHeap is a new PriorityQueue that will have size of sortedArrays (3) and orders elements based off the one
				//with the bigger value
			((int)sortedArrays.size()), new Comparator<ArrayEntry>() {
				@Override
				public int compare(ArrayEntry o1, ArrayEntry o2) {
					return Integer.compare(o1.value, o2.value);
				}
				//ArrayEntry is the type, which contains 'value' and 'arrayId'. The parameter
				//being compared is 'value'.
			});
		
		for (int i = 0; i < iters.size(); ++i) {
			if (iters.get(i).hasNext()) {
				minHeap.add(new ArrayEntry(iters.get(i).next(), i)); 
				System.out.println("iters.get.next:" + iters.get(i).next()); //will print out 5,6, and 6, the 1st index of each array respectively
				//will first add the 0th index from arrayId 0 (value of 3) to minHeap
				//will then add 0th index from arrayId 1 (value of 0), make this index 0 of
				//minHeap, make 3 the index 1 of minHeap
			}
		}
		
		List<Integer> result = new ArrayList<>();
		while (!minHeap.isEmpty()) {
			ArrayEntry headEntry = minHeap.poll(); //retrieve/fetch then remove first element of queue
			result.add(headEntry.value); 
			//will first add 0 from arrayId 2
			if (iters.get(headEntry.arrayId).hasNext()) {
				minHeap.add(new ArrayEntry(iters.get(headEntry.arrayId).next(), headEntry.arrayId));
				//wll then add the next indice of the List whose first index was removed just now (0 in this case)
				//next indice of arrayId: 1 has value of 6, is added to last index of minHeap
			}
		}
		return result;

	}
	
	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<>();
		a.add(3);
		a.add(5);
		a.add(7);
		List<Integer> b = new ArrayList<>();
		b.add(0);
		b.add(6);
		List<Integer> c = new ArrayList<>();
		c.add(0);
		c.add(6);
		c.add(28);
		
		List<List<Integer>> abc = new ArrayList<List<Integer>>();
		abc.add(a); //if define ArrayList up top, don't have to cast here
		abc.add((ArrayList<Integer>) b);
		abc.add((ArrayList<Integer>) c);
		
		System.out.println(mergeSortedArrays(abc));
	}
}