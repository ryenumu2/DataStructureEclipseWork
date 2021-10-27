package strings;

public class reverse {
	
	public StringBuilder ReverseS(String s) {
		String[] sol_orig = s.split(" ");
		//String[] sol = new String[s.length()]; new array should have size of array of sol_orig, which is of size 3, NOT of string, which has size of 14
		String[] sol = new String[sol_orig.length];
		
		for(int i=0, j = sol_orig.length-1; i<sol_orig.length; i++, j--) {
			sol[j] = sol_orig[i];
		}
		
		StringBuilder a = new StringBuilder();
		for(int k=0; k<sol.length; k++) {
			a.append(sol[k] + " ");
		}
		return a;
		}
	
	public static void main(String[] args) {
		
		/*
		String s = "Bob loves Mary";
		String[] sol_orig = s.split(" ");
		System.out.println(sol_orig[1]);
		
		String[] sol = new String[3];
		sol[0] = "Bob";
		sol[1] = "loves";
		sol[2] = "Mary";
		
		StringBuilder a = new StringBuilder();
		a.append(sol[0] + " ");
		a.append(sol[1] + " ");
		
		System.out.println(a);
		*/
		
		reverse test1 = new reverse();
		System.out.println(test1.ReverseS("Mary loves Bob"));
		System.out.println(test1.ReverseS("Living on the edge of the Earth's crack"));
	}
}

//method in book doesn't use .split. Develop another method that will do it differently, without it

