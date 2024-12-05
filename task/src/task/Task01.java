package task;

import java.util.Scanner;

public class Task01 {
	public static void main(String[] args) {
		//1. 100000원이 넘는 금액을 입력받아 5만원, 1만원, 5천원, 1천원 단위로 나누어 출력하기
		// 입력 클래스
		// 변수선언
		// 출력메시지
		// 입력메소드
		Scanner sc= new Scanner(System.in);
		
		int money = 0, result1 =50000, result2 =10000, result3 =5000, result4 =1000;
		System.out.print("100000원이 넘는 금액 입력하기 : ");
		money = sc.nextInt();
		
	
		System.out.printf("5만원 %d장\n1만원 %d장\n5천원 %d장\n1천원 %d장", money/result1,(money%result1)%result2,(money%result1%result2)%result3,(money%result1%result2%result3)%result4 );  
		
		
		//2. 키와 몸무게를 입력받아 BMI를 계산하기
		//공식 : 몸무게 / (키*키)
		
		//3. 밑변과 높이를 입력받아 삼각형의 높이 계산하기
		// 공식 : 0.5 * 밑변 * 높이
		
		//4. 두 정수를 입력받아 0보다 큰지 출력하기(true or false로 출력할 것)
		
		//5. 사용자에게 물건의 개수와 가격을 입력받아 총액 계산하기
		// 물건의 개수 : 3
		// 물건의 개당 가격 : 15000
		// 총액 : 금액원
		
		//6. 두 자리수 정수를 한 개 입력받아 각 자리의 숫자를 더하여 출력하기(각 자리수의 합)
		
		//7. 정수를 입력받아 양수이면서 짝수인지 확인하여 결과 출력하기
		// true or false
		//8. 두 숫자를 입력받아 첫번째 입력받은 숫자가 두번째 숫자보다 크거나 같은지 여부를 출력하기
		// true or false
		
		//9. 두 숫자를 입력받아 한 숫자만 양수인지 여부 출력하기
		// true or false
		
		//10. 연도를 입력받아 윤년인지 아닌지 출력하기
		// true or false => true이면 0000년은 윤년입니다로 출력할 것, false면 윤년이 아닙니다 출력
		//윤년 계산 : 연도가 4로 나눈어떨어지고 100으로 나누어 떨어지지 않거나 400으로  나누어 떨어져야한다
}
}
