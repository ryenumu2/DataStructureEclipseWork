package testsForConcepts;

import java.util.ArrayList;
import java.util.List;

public class ListFunctionalities {
	
	public static void main(String[] args) {
	//List a = new ArrayList<Integer>(); //List can never be the one being instantiated (via 'new' keyword)
	//^why above isn't good idea: https://stackoverflow.com/questions/14207005/warning-arraylist-is-a-raw-type-references-to-generic-type-arrayliste-should
	
	//List b = new List<Integer>(); //Error: you are 'instantiating' List. 'List' is an interface, so it cannot be instantiated

	List<Integer> a = new ArrayList<Integer>(); //to be safe: can define type on both sides of equation, so that
	//compiler can check if the value you added is consistent with type 'Integer' or not. Without it, you could
	//simply add an 'Object' and still be ok.
	a.add(3);
	a.add(5);
	
	for(Integer s: a) {
		//System.out.println(s);
	}
	
	List<Integer> b = new ArrayList<Integer>();
	
	b.add(1);
	b.add(24);
	
	System.out.println(a.get(1)); //will return the value in specified index
	//a.get(1).add(3); //cannot do this with instantiation done above
	
	//List<ArrayList<Integer>> c = new ArrayList<ArrayList<Integer>>(); //will also work
	
	List<List<Integer>> c = new ArrayList<List<Integer>>(); //reccommended way according to post below
	//https://stackoverflow.com/questions/30401948/initialize-listlistinteger-in-java/30402035
	
	c.add(a);
	c.add(b);
	//c.get(0);
	c.get(1).add(2);
	c.add(a);
	c.add(a);
	c.get(3).add(45); //.add() will add '45' to EACH of the indices that contain a, NOT JUST the indice you're trying to get
	
	System.out.println(c);
	
	System.out.println(c.size()); //number of 'sets' of lists in 'list' c
	
	c.add(new ArrayList<Integer>()); //can add a newly initialized ArrayList to this list
	
	System.out.println(c.size()); //will reflect newest addition: will print out 5 instead of 4
	
	
	//below: testing out adding values to a list in a list:
	
	List<List<Integer>> some = new ArrayList<List<Integer>>();
	List<Integer> t = new ArrayList<>();
	some.add(t);
	System.out.println(some); //will printout [[]]
	some.add(new ArrayList<>()); //WAY TO ADD MULTIPLE NEW LISTS INTO A LIST!!
	System.out.println(some); //will printout [[],[]]
	some.get(1).add(2);
	System.out.println(some);
	}
}