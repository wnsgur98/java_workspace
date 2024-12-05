package oper;
// 3번: 비트연산자
public class BitOper {
	public static void main(String[] args) {
//		System.out.println(10 & 11);//1010 & 1011 => 1010
//		System.out.println(10 | 11);//1010 | 1011 => 1011
//		System.out.println(10 ^ 11);//1010 ^ 1011 => 0001
//		System.out.println(~10);//~1010 => 
//		System.out.println(~5);
//		
		System.out.println("십진수 : " + 10 + " => 이진수 : " + Integer.toBinaryString(10));
		System.out.println("십진수 : " + 11 + " => 이진수 : " + Integer.toBinaryString(11));
		
		// & and 두 비트가 모두 1이면 1
		System.out.println("10 & 11의십진수 : " + (10 & 11));
		System.out.println("10 & 11이진수 : " + Integer.toBinaryString(10 & 11));
		
		// | or 두 비트중 하나라도 1이면 1
		System.out.println("10 | 11의십진수 : " + (10 | 11));
		System.out.println("10 | 11이진수 : " + Integer.toBinaryString(10 | 11));
		
		// ^ XOR 두 비트가 서로 다르면 1
		System.out.println("10 ^ 11의십진수 : " + (10 ^ 11));
		System.out.println("10 ^ 11이진수 : " + Integer.toBinaryString(10 ^ 11));
		
		// ~ NOT 0을 1로, 1을 0으로
		// ~X = -(X + 1)
		System.out.println("~10의십진수 : " + ~10);
		System.out.println("~10이진수 : " + Integer.toBinaryString(~10));
		
		//쉬프트연산자
				// <<, <<
				System.out.println(10 << 1);//00010100 << 1
				System.out.println("이진수 : " + Integer.toBinaryString(10 << 1));
				System.out.println(10 >> 1);//00010100 >> 1
				System.out.println("이진수 : " + Integer.toBinaryString(10 >> 1));
		
		
		
}
}
