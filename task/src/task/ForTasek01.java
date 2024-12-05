package task;
//허준혁
public class ForTasek01 {
	public static void main(String[] args) {
		//1. 1~100까지 출력 tab키만큼 간격 띄우고 10마다 줄바꿈
		//로직구성
		//1~100까지 출력할 수 있는 (int i = 0; i<=100; i++) for문 만들기
		//.printf()로 간격 띄우고 10마다 줄바꿀 수 있는 명령어 만들기
		
		int save = 0;
		for(int i = 1; i<=100; i++) {
			System.out.printf("%d \t ",i,save);
		}for( int i =0; save==10 ; i++) {
		}	System.out.println();
		System.out.println();
		
		//2. A~F출력
		//로직구성
		//A~F 까지 변수 담기
		int a = 'A';
		int b = 'B';
		int c = 'C';
		int d = 'D';
		int e = 'E';
		int f = 'F';
		
		
		
		
		//3.aBcDeFgHiJkLmNoPqRsTuNwXyZ 출력
//		int i = 0;
		
		//4. 1부터 100까지 숫자 중 3의 배수 또는 5의 배수만 한 줄에 5개씩 띄어쓰기로 구분되도록 출력
		//4-2)5의 배수 또는 5의 배수 숫자들의 합을 구하기
		
}
}
