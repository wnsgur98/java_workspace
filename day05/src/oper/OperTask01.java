package oper;

import java.util.Scanner;

// 1번 : 삼항연산자
public class OperTask01 {
	public static void main(String[] args) {
		// 정수 2개를 입력받아 큰 수 출력하기
		
		Scanner sc = new Scanner(System.in);// 입력 클래스
		int num1 = 0, num2 = 0; 
		String result = "";// 변수
		System.out.println("정수 한 개 입력하기 : ");// 입력 메시지
		num1 =sc.nextInt();//변수 nextInt()
		System.out.println("정수 한 개 입력하기 : ");
		num2 =sc.nextInt();//변수 nextInt()
		//resutlt = 조건식 ? 참일 때의 값 : 거짓일 때의 값
		result = (num1>num2 ? "큰 수 : " + num1 : num1 == num2? "두 수는 같습니다" : "큰 수 : " + num2);
		System.out.println("큰 수는" +result + "입니다");
}
}
