package scanner;

import java.util.Scanner;

//7.번 : 입력메소드 실습
public class ScannerTask02 {
	public static void main(String[] args) {
		// 1.사용자로부터 세 개의 숫자를 입력받아 합을 출력하느 프로그램
		// 세개의 숫자를 가각 입력받기
		// 세 숫자의 합을 걔산하여 출력
		// 세 숫자의 합은 00입니다. 형식으로 출력하기
		
		// 2.사용자로부터 일어난 시간(정수) 아침, 점심, 저녁에 할 일과 잠들 시간(정수)을 입력받아 출력하기
		//	아침, 점심, 저녁에 할 일과 잠들 시간을 각각 입력받기
		// 순서대로 입력받고 출력할 것
		// 오늘 일어난 시간은 00시이고 잠들 시간은 00시 입니다
		// 아침 : 00하기
		// 점심 : 00하기
		// 저녁 : 00하기
		
		// 3.물건가격이 10000원이다. 사용자로부터 지불금액을 입력받아 거스름돈을 계산하기(뺄셈 - 이용)
		// 물건 가격은 10000원입니다
		// 지불가격을 입력하세요 : 00
		// 거스름돈은 3000원입니다
		
		//입력 클래스 import
		//1. 변수
		// 출력메시지
		//입력 메소드
		//출력 메시지
		//출력
		// 버퍼 비워주기
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;	
		int result = 0;
		Scanner sc= new Scanner(System.in);
		System.out.print("");
		num1 = sc.nextInt();
		System.out.print("");
		num2 = sc.nextInt();
		System.out.print("");
		num3 = sc.nextInt();
		System.out.println("세 숫자의 합은" + (num1 +num2 +num3) + "입니다");
		sc.nextLine();
		
//		int wakeup =0;
//		String morning = "";
//		String lunch = "";
//		String dinner = "";
//		int timetoslep = 0;
//		
}
}
