package testsForConcepts;

public class arrayConcepts {
	
	static int CirQueue[];
	
	public arrayConcepts(int k) {
		CirQueue = new int[k];
	}
		//Elements in primitive arrays can't be empty. They'll always get initialized to something
	
	public static void main(String[] args) {
		
		arrayConcepts a = new arrayConcepts(4);
		
		
		//for primitive arrays, .length is used, NOT .size(), which is for ArrayList!
		for (int i=0; i<CirQueue.length; i++) {
			//System.out.println(i + " : value is: " + CirQueue[i]);
		}
	
	int[][] arr = new int[3][8];
	
	arr[2][7] = 6;
	
	//System.out.println(arr[0][7]);
	
	//int[][] arrayPop = [[3,5], [8,6], [1,12]]; won't work
	
	int[][] arrayPop = {{3,5}, {8,6}, {1, 12}};
	
	//System.out.println(arrayPop[0][1]);
	//System.out.println(arrayPop[0][i]);

	
}
}