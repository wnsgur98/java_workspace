package streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest03 {
	public static void main(String[] args) {
		
		String[] names = {"Abc", "Def", "GhIj", "KLm"};
		
		//스트림을 사용하여 대문자로 변환
//		String[] upperName = Arrays.stream(names).map(String::toUpperCase).toArray(String[]::new);
//		System.out.println(upperName);

//		Arrays.stream(upperName).forEach(System.out::println);//최종연산은 한번만 가능

		//스트림을 사용하여 리스트로 변환
		List<String> upper2 = Arrays.stream(names).map(String::toLowerCase).collect(Collectors.toList());
		System.out.println(upper2);//이건 소문자로 반환됨
		
		
		
		//for문 사용
//		for(int i =0; i< names.length; i++) {
//			names[i]= names[i].toUpperCase();
//		}
//		System.out.println(Arrays.toString(names));
}
}
