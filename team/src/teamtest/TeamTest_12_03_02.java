package teamtest;

import java.util.Scanner;

public class TeamTest_12_03_02 {
	public static void main(String[] args) {
//		0~15범위 밖의 숫자를 입력받을 시 “잘못된 입력입니다 다시 입력해주세요 : “를 출력하고 제대로 받을 때까지 반복
//		0은 0으로 만든 5*5크기의 0으로 만들 것
//		1은 1으로 만든 5*5크기의 1로 만들 것 (1은 중간에 있어야함 왼쪽 또는 오른쪽으로 치우치면 안됨)
//		10진수를 2진수로 변환하는 “toBinaryString()” 사용금지
//		0또는 1을 출력한 뒤 줄바꿈을 할 것
//		메소드로 만들어서 사용할 것 : 2진수로 변환하는 코드, 0을 출력하는 코드, 1을 출력하는 코드 (총 3가지)
//		(전부 매개변수 자유, 리턴값 자유, static 사용 불가)
		
		// 0~15까지의 숫자를 입력받은 뒤 이를 이진수로 출력
		TeamTest_12_03_02 tt = new TeamTest_12_03_02();
				Scanner sc = new Scanner(System.in);
				int num = 0;
				int[] binaryArray = new int[4];

				// 입력 메시지 출력
				System.out.print("0부터 15까지의 숫자를 입력해주세요 : ");
				num = sc.nextInt();
				sc.nextLine(); // void buffer

				while (num > 15 || num < 0) {
					System.out.print("잘못된 입력입니다 다시 입력해주세요 : ");
					num = sc.nextInt();
					sc.nextLine(); // void buffer
				}
				
				//10to2
				tt.decimalToBinary(binaryArray, num);

				// 출력
				for (int data : binaryArray) {
					if (data == 0) {
						tt.print0();
						System.out.println();
					} else {
						tt.print1();
						System.out.println();
					}
				}
				
				sc.close();

			}
			//print 0
			void print0() {
				for (int i = 0; i < 5; i++) {
					for (int j = 0; j < 5; j++) {
						if (i == 0 || i == 4 || j == 0 || j == 4) {
							System.out.print("0");
						} else {
							System.out.print(" ");
						}
					}
					System.out.println();
				}
			}
			//print 1
			void print1() {
				for (int i = 0; i < 5; i++) {
					for (int j = 0; j < 5; j++) {
						if (j == 2) {
							System.out.print("1");
						} else {
							System.out.print(" ");
						}
					}
					System.out.println();
				}
			}

			void decimalToBinary(int[] array, int num) {
				// 이진수로 변환 8421
				for (int i = array.length - 1; i >= 0; i--) {
					if (num / 2 >= 1) {
						array[i] = num % 2;
						num /= 2;
					} else if (num == 1) {
						array[i] = 1;
						break;
					} else {
						break;
					}
				}
}
}
