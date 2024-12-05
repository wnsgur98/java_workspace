package twofortest;

public class TwoForTask01 {
	public static void main(String[] args) {
//		1번
//		*****
//		****
//		***
//		**
//		*
//		for(int i =5; i >= 1; i--) {
//			for(int j =1; j <= i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		
//		2번	: 피라미드와 유사하지만 좌측 정렬
//		*
//		* * *
//		* * * * *
//		* * * * * * *
		for(int i =1; i <=7 ; i+=2) {
			for(int j =1; j <= i; j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
		
//		3. : 피라미드 (for문이 총 3개 -> 어떻게 사용될지 먼저 생각하기)
//      *
//     * *
//     * * *
}
}
