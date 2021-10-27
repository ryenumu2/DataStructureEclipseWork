package strings;

public class Palindrome {
	
	public boolean isItPalindrome(String s) {

		String lowercase = s.toLowerCase();
		
		for (int i=0, j = lowercase.length()-1; i<(lowercase.length())/2; i++, j--) {
			//while (i < j) {//cannot put while loop in for loop: this will cause while loop to run at i=0 and j=lowercase.length() iteration permanently if the characters match
			if (lowercase.charAt(i) < 'a' || lowercase.charAt(i) > 'z') {
				i++;
			}
			if (lowercase.charAt(j) < 'a' || lowercase.charAt(j) > 'z') {
				j--;
			}
			if (lowercase.charAt(i) >= 'a' && lowercase.charAt(i) <= 'z' && lowercase.charAt(j) >= 'a' && lowercase.charAt(j) <= 'z') {
				if (lowercase.charAt(i) != lowercase.charAt(j)) {
					return false;
				}
			}
		//}
			//what might be the problem: after running through for loop, always incrementing i and decrementing j
			
			//try this: have two while loops, one that increments string from left to right, another that increments from right to left.
			//now, instead of a for loop, that will decrement and increment along with the if statements within it,
			//you are only incrementing/decrementing while characters match/ while looking at letters and not all other symbols
			
		}
		return true;
		
	}
	
	public boolean isItPalindromeNew(String s) {
		
		String lowercase = s.toLowerCase().replace(" ", "");
		
		//use replace instead of replaceAll, which uses regex. Additionally, this helps avoid situations
		//where you are iterating over multiple non-characters in a row
		int i = 0;
		int j = lowercase.length() - 1;
		
		while (i<=j) {
			if (lowercase.charAt(i) < 'a' || lowercase.charAt(i) > 'z') {
				i++;
			}
			
			if (lowercase.charAt(j) < 'a' || lowercase.charAt(j) > 'z') {
				j--;
			}
			
			if (lowercase.charAt(i) >= 'a' && lowercase.charAt(j) <='z') { //remember the equals sign!!
				if (lowercase.charAt(i) != lowercase.charAt(j)) {
					return false;
				} 
					i++;
				
					j--;
				
				
			}
		}
		return true;
	}
	
	public boolean RightSolution(String s) {
		
		//String lowercase = s.toLowerCase().replaceAll("[^a-zA-Z]", "").toLowerCase(); 
		String lowercase = s.toLowerCase().toLowerCase().replaceAll("[^a-z]", ""); 
		//above way makes sure to completely replace and remove all non-alphabetic characters using regex
		//replaceAll will take in regex, while replace will not!
		//WILL HAVE TO KNOW HOW TO USE REGEX IF USING THIS METHOD!
		
		int i = 0;
		int j = lowercase.length() - 1;
		
		while (i<=j) {
			if (lowercase.charAt(i) != lowercase.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
	
	public static void main(String[] args) {
		Palindrome test1 = new Palindrome();
		//System.out.println(test1.isItPalindromeNew("Don't nod")); //true
		//System.out.println(test1.isItPalindromeNew("race a car"));//false
		System.out.println(test1.RightSolution("Don't nod")); //true
		System.out.println(test1.RightSolution("race a car"));//false
		System.out.println(test1.RightSolution("a man, a plan, a canal, Panama"));//true

	}
}