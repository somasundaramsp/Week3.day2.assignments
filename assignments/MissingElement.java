package week3.day2.assignments;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MissingElement {
public static void main(String[] args) {
	Set<Integer> s1 = new LinkedHashSet<>();
	Set<Integer> s2 = new TreeSet<>(s1);
	List<Integer> s3 = new ArrayList<>(s2);
	s1.add(1);
	s1.add(2);
	s1.add(4);
	s1.add(3);
	s1.add(6);
	s1.add(8);
	s1.add(7);
	int n= s3.size()+1;
	int s= (n*(n+1))/2;
	for(int i =0;i<s1.size();i++) {
		s = s - s3.get(i);
	}
	System.out.println(s);
}
}
