package throwsTest;

import java.util.Scanner;

public class ThrowsTest02 {
	static void method1() {
		System.out.println("반드시 양수만 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		int result = sc.nextInt();
		if(result<=0) {
			new NumberFormatException();
		}
		System.out.println("입력한 숫자는 : " + result + "입니다");
	}
	public static void main(String[] args) {
		method1();
	}
}
