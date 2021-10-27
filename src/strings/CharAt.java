package strings;

import java.util.Arrays;

public class CharAt{
	
	public boolean checkIfPalindrome(String s) {
		
		char[] StoreInArray = new char[s.length()]; //char[s.length()-1] is incorrect: 
						//REMEMBER: in 'new char[i]', i should be the length of the array, NOT the maximum indice!!
		for(int i=0;i<s.length(); i++) {
			StoreInArray[i] = s.charAt(i);
			//System.out.println(s.length());
			//System.out.println(i);
			System.out.println(s.charAt(i));
		}
		
		char[] StoreInArray2 = new char[s.length()];
		
		for(int j = s.length()-1, k = 0; j >= 0; j--, k++) {
			
			StoreInArray2[k] = s.charAt(j);
			System.out.println(s.charAt(j));

		}
		//if (StoreInArray == StoreInArray2) { //this will not work if you're comparing contents of arrays!
		if (Arrays.equals(StoreInArray, StoreInArray2)) {
			return true;
		}
		return false;
		
		
	}
	
	public boolean checkIfPalindrome2(String s) {
		
		for(int i = 0, j = s.length()-1; i<j; i++, j--) {
			if (s.charAt(i) != s.charAt(j)) {
				return false;
			}
		}
		return true;
	}
	
	
public static void main(String[] args) {
	
	/*
		String myChar = "Hello";
		char result = myChar.charAt(1);
		System.out.println(result);
		
		String s = "freeesomething";
		char[] stored = new char[s.length()]; //remember the new constant: this will set a length to the string
		
		for (int i = 0; i < s.length(); i++) {
			//char[] stored = {}; mistake 1
			stored[i] = s.charAt(i);
		}
		System.out.println(stored);
		System.out.println(stored[6]);
		
		for (int j = s.length()-1, i = 0; j >= 0; j--, i++) { //this is how you get two variables to increment and/or decrement

			 stored[i] = s.charAt(j);
			
		} //easy way to think about '-1': if the variable you're thinking of doing minus 1 is something you start counting at 1 with,
		  //then add a 'minus 1'. Else, if variable starts at 0, such as in arrays, do nothing. 
		System.out.println(stored);
	*/
	CharAt charat = new CharAt();
	System.out.println(charat.checkIfPalindrome("radar"));
	System.out.println(charat.checkIfPalindrome2("abfqatytytaqfba"));
	}
		
}