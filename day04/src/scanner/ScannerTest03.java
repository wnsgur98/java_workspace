package scanner;

import java.util.Scanner;

//3번 : next()와 nextline()
public class ScannerTest03 {
	public static void main(String[] args) {
	
			//1. 입력클래스 import
			Scanner sc = new Scanner(System.in);
			
			System.out.println("입력 : ");
			
			//3-1. sc.next() : 엔터를 임시저장공간에서 소모하지 않는다
//			System.out.println(sc.next());
//			System.out.println(sc.next());
//			System.out.println(sc.next());
			
			//3-2. sc.nextLine() : 엔터를 임시저장공간에서 소모한다
			System.out.println(sc.nextLine());
			System.out.println(sc.nextLine());
			System.out.println(sc.nextLine());
}
}
