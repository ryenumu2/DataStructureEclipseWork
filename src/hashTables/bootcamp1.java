package hashTables;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class bootcamp1 {


public static void main(String[] args) {

/*
HashMap<Integer, String> a = new HashMap<Integer, String>();
a.put(26, "z");
a.put(12, "a");
System.out.println(a); //will output {26=z, 12=a}

a.remove(26);
System.out.println(a); //will output {12=a}

System.out.println(a.get(26));
System.out.println(a.get(12)); //12 is mapped to a, so will print a

System.out.println(a.getOrDefault(26, "azz")); //return default value, azz, 
//if 26 isn't there, which would return z if it was
*/
	
String note = "ransomnote";

Map<Character, Integer> n = new HashMap<Character, Integer>();

for (int i=0; i<=note.length()-1; i++) {
	
	if (n.containsKey(note.charAt(i)) == false) {
		n.put(note.charAt(i), 1);
	}
	else {
		int oldCount = n.get(note.charAt(i));
		n.put(note.charAt(i), oldCount+1);
	}
}

System.out.println(n);

System.out.println(n.keySet()); //will print all keys, only once (even if duplicates exist)
System.out.println(n.size()); //return 8

/*
List keys = new ArrayList(n.keySet());
Object obj = 0;
for (int i =0; i<=n.size()-1; i++) {
	obj = keys.get(i);
} //easier to do for each loop, instead of creating new List
System.out.println(obj);
*/

for(char j: n.keySet()) { //if do int j, will print out associated ascii values
	System.out.println(j);
	System.out.println("n.get:" + n.get(j)); 
	int check = n.getOrDefault(j,0); 
	int val = n.get(j);
}

String note2 = "ransomnote";
Map<Character, Integer> n2 = new HashMap<Character, Integer>();

for (int i=0; i<=note2.length()-1; i++) {
	
	if (n2.containsKey(note.charAt(i)) == false) {
		n2.put(note.charAt(i), 1);
	}
	else {
		int oldCount = n.get(note.charAt(i));
		n2.put(note.charAt(i), oldCount+1);
	}
}

for (char l: n.keySet()) {
	int ab = n2.getOrDefault(l, 0); //for each character that exists in a different keyset, return respective value if exists in the other keyset, otherwise return 0 
	System.out.println(ab);
}

int s = 0;
for(char a: n.keySet()) {
	s = n2.getOrDefault(a,0);
	System.out.println("s:" + s);
}


}
}