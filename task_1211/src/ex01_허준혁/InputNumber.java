package ex01_허준혁;

import java.util.Scanner;

public class InputNumber {
	public static void main(String[] args) {
//		사용자로부터 3개의 정수를 입력받아 아래 요구사항대로 구현하라
//
//		- 클래스명 : InputNumber
//		- 배열은 사용하면 안된다
//		1) 최소값과 최대값 출력
//		2) 3개 숫자의 평균을 소수점 2자리까지 출력
		//로직
		//입력받을 메소드 스캐너 클래스 만들기
		//정수 3개를 입력받을 메소드 만들고 변수에 저장
		//삼항 연산자를 사용해서 최소값과 최대값 출력
		//double을 사용해서 3숫자의 평균 구하기
//		int num1=0,num2=0,num3=0;
//		double taotal =0.0;
		double total =0.0;
//		total =(num1 + num2 + num3);

		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 한개 입력: ");
		int num1 = sc.nextInt();
		System.out.println("두번째 정수 입력: ");
		int num2 = sc.nextInt();
		System.out.println("세번째 정수 입력: ");
		int num3 = sc.nextInt();
		int max =(num1>num2 ? num1 : num2);
		
}
}
