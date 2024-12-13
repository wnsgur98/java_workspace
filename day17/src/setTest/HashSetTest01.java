package setTest;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest01 {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();//업캐스팅 HashSet -> 구현클래스
		System.out.println(set.toString());
		
		//요소 추가 add
		set.add("고양이");
		set.add("강아지");
		set.add("치타");
		set.add("호랑이");
		set.add("코알라");
		set.add("코알라");
		set.add("코알라");
		System.out.println(set);
		
		//요소 포함 contains
		System.out.println(set.contains("고양이"));
		System.out.println(set.contains("사슴"));
		
//		//요소 제거 remove
//		System.out.println(set.remove("코알라"));
//		System.out.println(set);
//		
//		//크기 확인 size
//		System.out.println(set.size());
//		
//		//모든 요소 제거 clear
//		set.clear();
//		System.out.println(set);
}
}
