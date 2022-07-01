package week3.day2;


import java.util.ArrayList;
import java.util.List;

public class LearnList {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("RED");
		list.add("BLUE");
		list.add("GREEN");
		list.add("YELLOW");
		list.add("ORANGE");
		System.out.println("Original List :" +list);
		for(int i = list.size() -1;i>=0;i--) {
			String cat = list.get(i);
			System.out.println(cat);
		}
	}

}
	
