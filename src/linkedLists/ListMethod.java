package linkedLists;

import java.util.ArrayList;
import java.util.List;

public class ListMethod {
	
	
	public static void main(String[] args) {
		List<String> wegotit = new ArrayList<>();
		wegotit.add("B");
		wegotit.add("2");
		wegotit.add(2,"H");
		wegotit.add(0,"A");
		
		//[A, B, 2, H] will be the new list for wegotit
		System.out.println(wegotit);
		
		List<String> secondList = new ArrayList<>();
		
		secondList.add("C");
		secondList.add("D");
		secondList.add("E");
		
		wegotit.addAll(2, secondList); //add the entire list of secondList starting
		//at the second INDICE of wegotit
		
		System.out.println(wegotit);
		
		wegotit.addAll(secondList); //will add the secondList contents to the END of list
		System.out.println(wegotit);
		
		System.out.println(wegotit.contains("E")); //will print true because E exists in list
		
		
		
		
	}
}