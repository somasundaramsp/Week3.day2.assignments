package week3.day2.assignments;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindIntersections {
	public static void main(String[] args) {
		List<Integer> s1 = new ArrayList<>();
		Set<Integer> s2 = new HashSet<>();
		List<Integer> s3 = new ArrayList<>(s2);
		s1.add(3);
		s1.add(2);
		s1.add(11);
		s1.add(4);
		s1.add(6);
		s1.add(7);
		s2.add(1);
		s2.add(8);
		s2.add(2);
		s2.add(4);
		s2.add(9);
		s2.add(7);
		for(int i = 0;i<s1.size();i++) {
			for(int j =0;j<s3.size();j++) {
				if(s1.get(i)==s3.get(j)) {
					System.out.println(s1.get(i));
				}
			}
		}
	}
}
