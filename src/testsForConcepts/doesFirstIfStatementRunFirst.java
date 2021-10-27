package testsForConcepts;

public class doesFirstIfStatementRunFirst {
	
	
	public static void main (String[] args) {
		
		String s[] = {"/","a","/","/","b","c","/","t","/","/","z"};
		
		for (int i = 0; i<s.length; i++) {
			//if (s[i] && s[i+1]) {	
			//}
			//won't work : && not viable for this
			
			if (i <= s.length-1) {
				if (s[i] == "/" && s[i+1] == "/" || s[i] == "/") {
					System.out.println(i);
					
					//0
					//2
					//3
					//6
					//8
					//9
				}
			}
			
		}
	}
}