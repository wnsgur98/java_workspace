package setTest;

import java.util.ArrayList;
import java.util.HashSet;

public class HashsetTest03 {
	public static void main(String[] args) {
		ArrayList<Integer> li = new ArrayList<>();
		li.add(10);
		li.add(10);
		li.add(10);
		li.add(10);
		li.add(10);
		li.add(20);
		li.add(20);
		li.add(20);
		li.add(30);
		li.add(30);
		System.out.println(li);
		System.out.println(li.size());
		
		HashSet<Integer> set = new HashSet<>(li);
		System.out.println(set);
		
}
}
