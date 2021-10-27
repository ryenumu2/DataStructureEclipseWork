package strings;
public class ReplaceAndRemove {
	
	public char[] RandR(int size, char[] s) {
		
		/*
		int newSize = 0;
		for (int h = 0; h<s.length; h++) {
			if (s[h] == 'a') {
				newSize =+ 2;
			}
			else if (s[h] == 'b') {
				newSize--;
			}
			else {
				newSize++;
			}
		}
		*/
		
		char[] sol = new char[10];
		int j=0;
		
		for (int i = 0; i<s.length; i++) {
			if (s[i] == 'a') {
				sol[j] = 'd';
				sol[j+1] = 'd';
				j+=2;
			}
			else if (s[i] != 'b') {
				sol[j] = s[i];
				j+=1; //REMEMBER THAT IT SHOULD BE += NOT =+
			}
			
			
		}
		return sol;
	}
	
	
	public static void main(String[] args) {
		
		//char[] t = {3,6,2,5,70,1}; //if defining an array, make sure to use CURLY braces, not square
		//System.out.println(t.length());	//will not work: length() doesn't apply when trying to find length of ARRAY, as it does for a STRING
		//System.out.println(t.length);
		
		//char[] x = {10, 20, 40}; initialize like this if you know the values you want to populate the array with
		
		/*
		int z = 1000;
		char[] x = new char[z]; //initialize like this if you're about to populate array, only know size
		x[0] = '4';
		x[1] = 'A';
		x[2] = 'Z';
		System.out.println(x[0]);
		System.out.println(x);
		*/
		
		ReplaceAndRemove test1 = new ReplaceAndRemove();
		System.out.println(test1.RandR(7, new char[]{'a','c','d','b','b','c','a'})); //remember to System.out.println!!
		System.out.println(test1.RandR(7, new char[]{'b','b','d','d','b','c','a'}));

	}
	
	//pg. 99 of book: better approach: going forward through array, remove b's, while counting a's, then going backwards replace 'a' with 'dd'
	//two variant problems as well
		
}