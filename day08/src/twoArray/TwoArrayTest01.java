package twoArray;

public class TwoArrayTest01 {
	public static void main(String[] args) {
		int[][] ar1;	//2차원 배열 선언
		ar1 = new int[3][2];	//3행 2열 크기의 배열 생성
		
		System.out.println(ar1); //2차원 배열의 전체 참조값 출력
//		[[I@65ae6ba4 : 2차원 배열 전체의 참조값(JVM에 의해 제공)
//		[[0, 0], [0, 0], [0, 0]]
		System.out.println(ar1[0]); //0행의 참조값 출력
//		[I@7960847b : 0행의 참조값(1차원 배열)
		System.out.println(ar1[0][0]); //0행 0열의 값 출력
//		0 : 0행 0열의 값(초기화 된 기본값)
		
		int[] ar2 = new int[3];
		System.out.println(ar2);
//		[I@6a6824be : 1차원 배열의 참조값
//		[0, 0, 0]
		System.out.println(ar2[0]);
//		1차원 배열의 첫번째 값(초기화 된 기본값)
		
		
	}
}
