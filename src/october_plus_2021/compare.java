package october_plus_2021;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class compare {
	
	
	public void maxHeap(int[] array) {
		
	PriorityQueue<Integer> a = new PriorityQueue<Integer>(new Comparator<Integer>() {
		public int compare(Integer num1, Integer num2) {
			return Integer.compare(num1, num2);
		} //max-heap: will pop out the minimum numbers first
	});
	
	for (int ele: array) {
		a.add(ele);
	}
	
	System.out.println(a);
	System.out.println(a.poll()); //will remove 1 
	System.out.println(a.poll()); //will remove 2 
	System.out.println(a.poll()); //will remove 3 

	}
	
	
	public void minHeap(int[] array) {
		
		PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>(array.length, new Comparator<Integer>() {
			public int compare(Integer x1, Integer x2) {
				return Integer.compare(x1,x2) * -1;
			}
		}); //largest values will be spit out of PriorityQueue first
		
		for(int a: array) {
			minHeap.add(a);
		}
		
		System.out.println(minHeap);
		
	}
	
	/*
	public String[] comparatorExample(String[] logs) {
		Comparator<String> myComp = new Comparator<String>() {
			public int compare(String log1, String log2) {
				String[] split
			}
		}
		
		return logs;
	}
	*/
	
	
	public int comparator(int[] array) {
		
		Comparator<String> cmp = new Comparator<String>() {
			public int compare(String x1, String x2) {
				String[] split1 = x1.split(" ", 2);
				String[] split2 = x2.split(" ", 2);
				
				boolean isDigit1 = Character.isDigit(split1[1].charAt(0));
				boolean isDigit2 = Character.isDigit(split2[1].charAt(0));
				
				
				if (!isDigit1 && !isDigit2) {
					if (split1[1].compareTo(split2[1]) > 0) {
						return 1;
					}
					else if (split1[1].compareTo(split2[1]) < 0) {
						return -1;
					}
					else {
						return 0;
					}
				}
				
				//if (split1[1].getChar(0).isDigit())
				//if (Character.isDigit(split1[1].charAt(0))) {	
				//}
				else if (!isDigit1 && isDigit2) {
					
				}
				return 0;
			}
		};
		return 0;
	}
	
	
	public int compareTo(String s1, String s2) {
		return s1.compareTo(s2);
	}
	
	public void compareTest(String[] array) {
		Comparator<String> c = new Comparator<String>() {
			public int compare(String s1, String s2) {
				if (s1.compareTo(s2) > 0) { //s1 is larger than s2
					return 1;
				}
				else if (s1.compareTo(s2) < 0) {
					return -1;
				}
				else {
					return 0;
				}
				
				//idea behind compare: 
			}
		};
		
		/*
		for (int i: array) {
			c.add(i);
		}
		*/
		
		Arrays.sort(array, c); //can only sort array if of type String, and with comparator 'c'
								//also remember: Arrays.sort(array, c) returns void. Also, haven't
								//implemented a Heap that we can for each .add into, realize that
								//array will automatically dynamically change to be sorted!
		for (String s: array) {
			System.out.println(s);
		}
		
		}
	
	public void PriorityQueue10_21(){
		
		PriorityQueue<Integer> test10_21 = new PriorityQueue<Integer>(new Comparator<Integer>() {
			public int compare(Integer x1, Integer x2) {
				return Integer.compare(x1,x2);
			}
		});
	}
	
	public void Comparator10_21(String[] array) {
		
		Comparator<String> test10_21 = new Comparator<String>() {
			public int compare(String x1, String x2) {
				x1.compareTo(x2);
				
				if (x1.compareTo(x2) == 0) {
					return 0;
				}
				else if (x1.compareTo(x2) < 0) {
					return -1;
				}
				else return 1;
			}
		};
		
		Arrays.sort(array, test10_21); //remember this: way to USE a comparator. Note that array will
		//forever be changed after this is done.
		
	} //will organize strings lexicographically
		
	
	
	public static void main(String[] args) {
		
		//tests for maxHeap
		int[] arr1 = new int[] {3,6,78,2,1};
		compare test1 = new compare();
		test1.maxHeap(arr1);
		
		//tests for minHeap
		test1.minHeap(arr1);
		
		//test for compareTo
		System.out.println( "compareTo " + "heleo and hello " + test1.compareTo("heleo", "hello"));
		System.out.println( "compareTo " + "hello and helloLonger " + test1.compareTo("hello", "helloLonger"));
		//^-6: s1 is -6 characters shorter than 0
		
		//tests for split(), charAt()
		String split1[] = {"dig1 8 1 5 1", "let1 art can", "dig2 3 6", "let2 own kit dig", "let3 art zero"};
		System.out.println(split1[0]);
		
		String[] splitter1 = split1[0].split(" ", 2); //.split() is for a string. First argument is where
		//spacing should occur, and second argument is how many times it's done. Thus, since first 'word'
		//is the identifier, will have the rest, 8 1 5 1, in a separate indice as well.
		for (String i:splitter1) { 
		System.out.println(i);
		}
		
		//test for compare
		for (int i =0; i < split1.length; i++) {
		System.out.println(split1[i]);
		}
		
		System.out.println("Compare ");
		test1.compareTest(split1); //will order strings by character order 
		
		
		//10_21
		compare test10_21 = new compare();
		String[] test21_arr = {"dog", "hello", "doh", "doi", "eo"};
		test10_21.Comparator10_21(test21_arr);
		
		for (String s: test21_arr) {
			System.out.println(s);
		}	//will print dog, doh, doi, eo, hello	
	}
}

