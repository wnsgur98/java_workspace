package ifTest;

import java.util.Scanner;

public class IfTest04 {
	public static void main(String[] args) {
		//삼항연산자로 작성했던 두 수를 입력받아 큰 수 출력하기
		// => if ~else if ~else문으로 바꾸기
		
		//입력클래스
		//변수
		//입력 메시지
		//조건문(if~else if~else)
		// if(변수1 > 변수2){
		//	변수1이 변수2보다 큽니다
		//	}else if(변수1==변수2){
		//	변수1과 변수2가 같습니다
		//	}else{
		// 변수2가 변수1보다 큽니다
		//	}
		
		Scanner sc = new Scanner(System.in);
		int num1 =0, num2 =0;
		System.out.println("정수를 입력하기 : ");
		num1= sc.nextInt();
		num2 =sc.nextInt();
		if (num1 > num2){
			System.out.printf("%d가 %d보다 %d 더 큽니다", num1, num2, (num1 - num2));
		} else if(num1 == num2) {
			System.out.printf("%d와 %d가 같습니다", num1, num2);
		} else {
			System.out.printf("%d가 %d보다 %d 더 큽니다", num1, num2, (num2 - num1));
		}
}
}
