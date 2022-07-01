package week3.day2.assignments;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class NumbersOccurances {
public static void main(String[] args) {
	int arr[]= {2,3,5,6,3,2,1,4,2,1,6,1};
	Map<Integer,Integer> sp = new TreeMap<>();
	for(int i =0;i<arr.length;i++) {
		if(sp.containsKey(arr[i])) {
			sp.put(arr[i], sp.get(arr[i])+1);
		}
		else {
			sp.put(arr[i], 1);
		}
	}
	Set<Entry<Integer,Integer>> entrySets = sp.entrySet();
	for (Entry<Integer,Integer> entry : entrySets) {
		System.out.println(entry.getKey()+" -> "+entry.getValue());
	}
}
}