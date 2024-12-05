package scanner;
// 2번 : 입력메소드(로직구성)

import java.util.Scanner;

public class ScannerTest02 {
	public static void main(String[] args) {
//		
//		//1. 입력 클래스 변수 만들기
//		Scanner sc = new Scanner(System.in);
//		//2. 출력 메시지(입력받을 것이 어던것인지)
//		System.out.println("지금 배우고있는 프로그래밍 언어는?");
//		//3. String 변수명 = 입력메소드
//		 String subject =sc.next();
//		 //4. 변수 출력
//		 System.out.println(subject);

		//실습
		//이름을 입력하세요 :
		//000님 안녕하세요
		//printf 사용하기
		
		// 변수만들기
		Scanner sc = new Scanner(System.in);
		// 출력 메시지 
		System.out.print("이름을 입력하세요 : ");
		// 변수명 = 입력메소드
		String name =sc.next();
		// 변수 출력
		System.out.printf("%s님 안녕하세요", name);
}
}
