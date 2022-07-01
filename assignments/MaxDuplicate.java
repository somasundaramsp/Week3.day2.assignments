package week3.day2.assignments;

import java.util.HashMap;
import java.util.Map;

public class MaxDuplicate {
public static void main(String[] args) {
	String a = "somasundaram";
	Map<Character,Integer> sp= new HashMap<>();
	char[] chArray = a.toCharArray();
	int maxCounts = 1;
	char maxElements = chArray[0];
	for(int i = 0;i<chArray.length;i++) {
		if(sp.containsKey(chArray[i])) {
			sp.put(chArray[i], sp.get(chArray[i])+1);
		}
		else {
			sp.put(chArray[i], 1);
		}		
	
	int counts = sp.get(chArray[i]);
	if(counts>maxCounts) {
		maxCounts = counts;
		maxElements = chArray[i];
		}
	}
	System.out.println(maxElements);
}
}
