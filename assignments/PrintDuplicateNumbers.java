package week3.day2.assignments;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class PrintDuplicateNumbers {
public static void main(String[] args) {
	List <Integer> s1 = new ArrayList<>();
	s1.add(14);
	s1.add(12);
	s1.add(13);
	s1.add(11);
	s1.add(15); 
	s1.add(14);
	s1.add(18);
	s1.add(16);
	s1.add(17);
	s1.add(19);
	s1.add(18);
	s1.add(17);
	s1.add(20);
	Set <Integer> s2 = new LinkedHashSet<>(s1);
	for(int i=0 ; i<s2.size(); i++) {
		int count = 0;
		for(int j = i+1; j<s1.size();j++) {
			if(s1.get(i)==s1.get(j)) {
				count= count +1;
			}
			if(count>0) {
				System.out.println(s1.get(j));
				break;
			}
		}
		
	}
}
}
