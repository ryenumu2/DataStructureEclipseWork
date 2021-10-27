package october_plus_2021;

public class Intervals {
	
	
	public static void main(String[] args) {
		
		int[][] twod_array = {{3,5}, {4,6}, {5,7}};
		
		for (int i=0; i< twod_array.length; i++) {
			//System.out.println(twod_array[i][]); //will result in error
			System.out.println(twod_array[i][1]); //5,6,7
		}
		System.out.println(twod_array.length); //prints 3
		
		//Q: can I copy array from one index into another by only calling twod_array[i][]?
		//twod_array[1][] = twod_array[2][]; //no, I cannot. Need to declare 
		//System.out.println(twod_array);
		
		//copying entire 2d array into another: https://stackoverflow.com/questions/1686425/copy-a-2d-array-in-java
		//use foo[i].clone();
		
		/*
		Elements in primitive arrays can't be empty. They'll always get initialized to something

		If you declare the array like so

		 int [] newData = new int [17];
		then all of the elements will default to zero.
		*/
	}
}