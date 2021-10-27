package strings;

public class Spreadsheet {
	
	public int idToInteger(String id) {
		
		int finalCount = 0;
		
		for(int i = id.length() - 1, j = 0; i >=0; i--, j++) {
			int total = 1;
			int k = i;
			while (k > 0) {
				total = total*26;
				k--;
			}
			finalCount = total * (id.charAt(j) - '@') + finalCount;
		}
		return finalCount;
	}
	public static void main(String[] args) {
		Spreadsheet test1 = new Spreadsheet();
		System.out.println(test1.idToInteger("Z")); //26
		System.out.println(test1.idToInteger("AAA")); //703
	}
}