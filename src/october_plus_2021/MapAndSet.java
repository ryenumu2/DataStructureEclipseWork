package october_plus_2021;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapAndSet {
	
	Map<Integer, Integer> comboMapper = new HashMap<>(); //remember that it's Map, not Mapper.
	//also remember Map is a new instance of HashMap
	//also make sure parameterized with TWO argument types
	
	Map<Character, Integer> aMapper;
	
	
	Set<Integer> comboSet = new HashSet<>(); //note, HashSet instead of HashMap
	
	public void MapArr(int[] combos) {
		
		for (int i=0; i<combos.length; i++) {
			if (comboMapper.containsKey(combos[i])) {
				int oldValue = comboMapper.get(combos[i]);
				comboMapper.put(combos[i], oldValue+1);
			}
			else {
				comboMapper.put(combos[i], 1);
			}
		}
	}
	
	public void SetArr(int[] secondCombos) {
		
		for (int i=0; i<secondCombos.length; i++) {
			if (comboSet.contains(secondCombos[i])) {
			//do nothing
			//comboSet.add(secondCombos[i]);
			//^ won't allow us to add the same element to it: can test this out by uncommenting this

			}
			else {
				comboSet.add(secondCombos[i]);
			}
		}
	}
	
	public void MapWork_10_24(Character[] a) {
		
		aMapper = new HashMap<>();
		
		for (int i=0; i< a.length; i++) {
			if (aMapper.get(a[i]) == null) {
				aMapper.put(a[i],1);
			}
			else {
				int oldValue = aMapper.get(a[i]);
				aMapper.put(a[i], oldValue + 1);
			}
		}
		
	}
	
	
	
	public static void main(String[] args) {
		
		int[] arr = {3,5,5,3,2,1};
		Character[] astring = {'a', 't', 'b', 'j', 'k', 'k', 'j'}; //single quotes: character, double quotes: string
		
		MapAndSet test10_21 = new MapAndSet();
		test10_21.MapArr(arr);
		
		System.out.println(test10_21.comboMapper); //make sure that comboMapper is instantiated in class scope so you can see it
		//{1=1, 2=1, 3=2, 5=2}
		
		test10_21.SetArr(arr);
		System.out.println(test10_21.comboSet); 
		//[1, 2, 3, 5]
		
		//test MapWork_10_24
		MapAndSet test10_24 = new MapAndSet();
		test10_24.MapWork_10_24(astring);
		System.out.println(test10_24.aMapper);
	}
}