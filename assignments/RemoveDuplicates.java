package week3.day2.assignments;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {
public static void main(String[] args) {
	List <String> sp = new ArrayList<>();
	sp.add("We");
	sp.add("learn");
	sp.add("java");
	sp.add("basics");
	sp.add("as");
	sp.add("part");
	sp.add("of");
	sp.add("java");
	sp.add("session");
	sp.add("in");
	sp.add("java");
	sp.add("week1");
	Set<String> sm =new LinkedHashSet<>(sp);
	System.out.println(sm);
}
}
