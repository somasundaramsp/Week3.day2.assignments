package week3.day2;

import java.util.Set;
import java.util.TreeSet;

public class LearnSet {
	public static void main(String[] args) {
		Set<String> set = new TreeSet<String>();
		set.add("RED");
		set.add("GREEN");
		set.add("BLUE");
		set.add("YELLOW");
		set.add("BROWN");
		System.out.println(set);
		for(int i = set.size()-1;i>=0;i--) {
			set.addAll((set));
		}
		System.out.println(set);
	}

}
