package oper;

import java.util.Scanner;

//11번 : 관계연산자
public class OperTest03 {
	public static void main(String[] args) {
		//입력 클래스
		//변수
		//출력 메시지
		//입력 메시지
//		Scanner sc = new Scanner(System.in);
//		int num1 = 0, num2 =0;
//		System.out.print("두 수를 입력하세요 : ");
//		num1 = sc.nextInt();
//		num2 = sc.nextInt();
//		sc.nextLine();
//		
		
		
		
		
		int num1 = 10;
		int num2 = 15;
	
		System.out.println("num1 > num2 : num1이 num2보다 크니?" + (num1 > num2));
		System.out.println("num1 , num2 : num1이 num2보다 작니?" + (num1 < num2));
		System.out.println("num1 >= num2 : num1이 num2보다 크거나 같니?" + (num1 >= num2));
		System.out.println("num1 <= num2 : num1이 num2보다 작거나 같니?" + (num1 <= num2));
		System.out.println("num1 == num2 : num1과 num2가 같니?" + (num1 == num2));
		System.out.println("num1 != num2 : num1이 num2보다 같지않니?" + (num1 != num2));
		
		System.out.println("======논리연산자=======");
		 System.out.println("===and 둘다 참이면 참(&&)===");
		System.out.println(true && true);//and -> && 표기
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		
		System.out.println("===or 둘 중 하나라도 참이면 참(||)===");

		System.out.println(true || true);// or -> || 표기
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		System.out.println("===not 참이면 거짓, 거짓이면 참(!)===");

		System.out.println(!true);// not -> ! 표기
		System.out.println(!false);
		
		
}
}
