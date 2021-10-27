package october_plus_2021;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListTest {
	
	public static void main(String[] args) {
		List<Integer> a = new ArrayList<Integer>();
		//below: why it's better to use List<> instead of ArrayList<>
		//https://stackoverflow.com/questions/2279030/type-list-vs-type-arraylist-in-java
		a.add(3);
		a.add(2);
		a.add(1);
		a.add(0, 4); //add 4 to the beginning of the list
		
		//System.out.println(a);
				
		//Convert string array to a list
		String[] arr = new String[2]; //can only fit 2 indices
		arr[0] = "rohit";
		arr[1] = "says";
		List<String> newList = Arrays.asList(arr);
		//System.out.println(newList);
		
		//Convert a List to an array
		
		//First, let's make the List:
		
		String[] arr1 = new String[6];
		arr1[0] = "ykc 82 01";
		arr1[1] = "eo first qpx";
		arr1[2] = "09z cat hamster";
		arr1[3] = "06f 12 25 6";
		arr1[4] = "az0 first qpx";
		arr1[5] = "236 cat dog rabbit snake";
		
		System.out.println(arr1[0].compareTo(arr1[1])); //will output 20
		
		List<String> amzQ1 = Arrays.asList(arr1);
		
		//below: how to do a basic conversion from 'List' to array:
		String[] wordsArray = new String[amzQ1.size()];
		wordsArray = amzQ1.toArray(wordsArray);
		
		for (String i: wordsArray) {
			System.out.println(i);
		}
		
		System.out.println(wordsArray[0].compareTo(wordsArray[1])); //will also output 20!

		//Reasoning behind this: cannot use array methods such as compareTo(), so 
		
		
		//System.out.println(amzQ1[0]); must be of type array to work
		//System.out.println(amzQ1[0].compareTo(amzQ1[1])); must be of type array to work
		
		
		
		
		
		
		
		//List<String> test = ["hello", "how", "are", "you"];
	}
}