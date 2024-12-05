package scanner;

import java.util.Scanner;

//6번 : nextInt()
public class ScannerTest05 {
	public static void main(String[] args) {

		//나이(nextInt), 이름(nextLine)을 입력받기
		
		// 변수 선언(int, String)
		// 입력 클래스 import
		// 출력 메시지(나이 입력 :)
		// 변수 = nextInt()
		// 출력 메시지(이름 입력 :)
		// 변수 = nextLine()
		// 출력(이름은 000이고 나이는 0살입니다)
		
		int age = 0;
		String name = "";
		Scanner sc = new Scanner(System.in);
		System.out.print("나이 입력 : ");
		age = sc.nextInt();
		sc.nextLine();//next(), nextInt(), nextDouble()을 사용할 때는 반드시 nextLine()으로 임시저장공간 소모
		//nextLine()을 아래에서 사용할 수도 있기 때문에 미리 임시저장공간을 비우는 습관을 들인다
		System.out.print("이름 입력 : ");
		name = sc.nextLine();
		System.out.println("이름은" + name + "이고 나이는" + age + "살 입니다.");
		sc.close();
}
}
