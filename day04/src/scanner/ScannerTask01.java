package scanner;

import java.util.Scanner;

// 5번 : 입력한 메소드 실습

public class ScannerTask01 {
	public static void main(String[] args) {

		// 두 정수를 입력받고 합을 출력하기
		// next 메소드를 사용한다
		// [입출력 결과]
		// 정수1 입력 : 10
		// 정수2 입력 : 20
		// 두 정수의 합은 30입니다.

		// 로직구성 먼저 진행!
		// 변수 2개 선언(String)
		// 입력클래스
		// 출력메시지
		// 입력메소드(.next()) 변수1에 대입
		// 출력메시지
		// 입력메소드
		// 출력(형변환)
		String num1 = "", num2 = "";
		Scanner sc = new Scanner(System.in);
		System.out.print("정수1 입력 : ");
		num1 = sc.next();
		System.out.print("정수2 입력 : ");
		num2 = sc.next();
		System.out.println("두 정수의 합은" + (Integer.parseInt(num1) +Integer.parseInt(num2)) + "입니다");
		//System.out.println("두 정수의 합은" + Integer.parseInt(num1) +Integer.parseInt(num2));
		
	}
}
