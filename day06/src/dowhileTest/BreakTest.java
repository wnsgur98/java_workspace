package dowhileTest;
//6번 : 기타 제어문- break문
public class BreakTest {
	public static void main(String[] args) {
		//1~10까지 중 5까지만 출력하기
		for(int i =0; i<10; i++) {
			System.out.println((i + 1));
			if(i ==4) {// i는 0부터 시작흐므로 i==4일때 5까지 나옴
				break;
			}
		}
		System.out.println("출력 끝");
		
		//1~10까지 중 7까짐나 출력(while문)
		int num = 1;
		while(num<=10) {
			if(num>7) {
				break;
			}
			System.out.println(num);
			num++;
		}
}
}
