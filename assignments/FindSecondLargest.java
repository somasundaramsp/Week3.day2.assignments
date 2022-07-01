package week3.day2.assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest {
	public static void main(String[] args) {
		List <Integer> s1 = new ArrayList<>();
		s1.add(3);
		s1.add(2);
		s1.add(11);
		s1.add(4);
		s1.add(6);
		s1.add(7);
		Set<Integer> s2 = new TreeSet<>(s1);
		List<Integer> s3 = new ArrayList<>(s2);
		int i = s1.size()-2;
		System.out.println(s3.get(i));	
	}

}
