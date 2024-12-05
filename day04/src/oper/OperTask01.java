package oper;

import java.util.Scanner;

public class OperTask01 {
	public static void main(String[] args) {
		//1. 사용자로부터 두개의 숫자를 입력받아 두 숫자의 합과 곱을 각각 출력하기
		int num1 = 0, num2 =0, result1 =0, result2 =0; //변수
		Scanner sc= new Scanner(System.in);// 입력 클래스 import생성
		System.out.print(" 정수 두 개 입력하기 : ");// 출력 메시지
		num1 =sc.nextInt();// 입력 메소드
		num2 =sc.nextInt();
		result1 = num1 + num2;
		result2 = num1*num2;
		System.out.println("합은"+ result1);//출력
		System.out.println("곱은"+ result2);//출력
		sc.nextLine();// 버퍼 비우기
		//2. 1번에서 입력받은 두개의 숫자를 사용하여 평균을 계산하고 소수점 두자리수까지 출력하기
		System.out.printf("%.2f",(double)(result1 + result2)/2);
		System.out.println();
		//3. 두자리수 정수를 입력받고 십의자리와 일의자리를 출력하기
		
		//입출력 결과
		//두 자리수 정수를 입력하세요
		//십의자리는_입니다.일의 자리는_입니다
		int num3 = 0;// 변수
		System.out.print("두 자리수 정수를 입력하세요 : ");//출력 메시지
		num3 = sc.nextInt();//입력 메시지
		System.out.printf("십의 자리는 %d , 일의 자리는 %d 입니다", num3/10, num3%10);//출력
		sc.nextLine();
		// 십의자리 변수 /10
		// 일의자리 변수 %10
		
		//4. 코인노래방 프로그램 만들기, 사용자에게 금액을 입력받고 부를 수 있는 곡수와 잔돈 추력하기
		//한 곡의 가격은 400원 
		System.out.println("금액을 입력하세요 : ");//메시지 출력
		int money = sc.nextInt();// 변수 입력메소드
		
		
}
}
