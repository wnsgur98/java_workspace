package ex03_허준혁;

import java.util.Scanner;

public class Stars2 {
	public static void main(String[] args) {
//		사용자로부터 행을 입력받아 입력받은 숫자만큼 행으로 직각삼각형 출력
//		출력하고 싶은 행 입력 : 4
//		[입출력결과]
//		*
//		**
//		***
//		****
		//로직구성
		//스캐너 클래스 4를 입력받아 저장
		//for문으로 i와 j를 사용하여 j가 하나씩 줄어들게 짜서 출력
		Scanner sc = new Scanner(System.in);
		System.out.println("출력하고 싶은 행 입력: ");
		int heiger =sc.nextInt();

		for(int i =0; i<heiger; i++) {
			for(int j=1; j<heiger-1; j++) {
				System.out.print(" ");
			}
				System.out.print("*");
			}
			System.out.println();
		}
		
}

