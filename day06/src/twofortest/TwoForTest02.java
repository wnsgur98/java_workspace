package twofortest;
//3번 : 2중 for문 별찍기(i와 j의 규칙성 확인
public class TwoForTest02 {
	public static void main(String[] args) {
//		*
//		* *
//		* * *
//		* * * *
		
		for(int i = 1; i <=3; i++) {
//			System.out.println("*");//행
			for(int j = 1; j <=i; j++) {
				System.out.print("*");//열
			}
			System.out.println();
		}
		
		 // 첫번째 바깥쪽 반복 i = 1
	      // j = 1 -> .print("*") -> 출력 : *
	      // j = 2 -> .print("*") -> 출력 : **
	      // j = 3 -> .print("*") -> 출력 : ***
	      // 안쪽 반복문 종료 => .println() -> 줄바꿈

	      // 두번째 바깥쪽 반복 i = 2
	      // j = 1 -> .print("*") -> 출력 : *
	      // j = 2 -> .print("*") -> 출력 : **
	      // j = 3 -> .print("*") -> 출력 : ***
	      // 안쪽 반복문 종료 => .println() -> 줄바꿈

	      // 세번째 바깥쪽 반복 i = 3
	      // j = 1 -> .print("*") -> 출력 : *
	      // j = 2 -> .print("*") -> 출력 : **
	      // j = 3 -> .print("*") -> 출력 : ***
	      // 안쪽 반복문 종료 => .println() -> 줄바꿈

	      // j가 1부터 i까지 증가하면서 별의 개수가 행 번호에 따라 달라진다
		
		
}
}
