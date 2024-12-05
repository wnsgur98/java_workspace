package twofortest;

import java.util.Scanner;

public class TwoForTest03 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("출력할 행의 수를 입력하세요 : ");
		int choice = 0;
		choice = sc.nextInt();
		sc.nextLine();
		for(int i = 1; i <=choice; i++) {
//			System.out.println("*");//행
			for(int j = 1; j <=i; j++) {
				System.out.print("*");//열
			}
			System.out.println();
		}
	}

}
