package forTest;
//12번 : for문 연습
public class ForTest03 {
	public static void main(String[] args) {
		//이름 5번을 출력
		//로직
		//1) for(초기식 int i = 1; 조건식 i <=5; i++)
		//2){출력(i + "번 이름");}
		
		for(int i = 0; i <5; i++) {
			System.out.println((i+1) +"번 허준혁");
		}
		
		for(int i =5; i >0; i--) {
			System.out.println((6-i) + "번 허준혁");
		}
		
		//1번부터 100까지의 합
		//1) 총합 저장할 변수
		//2) for문(초기식 int i =1; 조건식 i < 101; i++){
		//3) 총합 저장할변수 += i; }
		//4) 합 출력
		
//		int total = 0;
//		for(int i =1; i <=100; i++) {
//			total += i;
//			System.out.println("i의값 : " + i + ", 1부터 100까지의  총 합 : " + total);
//		}
		
		//1 부터 100까지의 짝수의 합
		//1) 총 합 저장할 변수
		//2) for문(초기식 int i =0; i <=100; i+=2){
		//3)
		
		int total = 0;
		for(int i =2; i <=100; i+=2) {//for문에서 짝수만 반복
			total += i;
		} 
		System.out.println("총 합 : " + total);
		
		int total1 = 0;
		for(int i=0; i <=100; i++) {//if문으로 짝수만 확인
			if(i %2 ==0) {//짝수
			total1 += i;
			}
		}
		System.out.println("총 합 : " +total1);
		
		//i를 1부터 50까지, 짝수 생성하는 방법
		//1) 총합 변수
		//2) for(i = 1; i <= 50; i++{//1부터 50까지 생성
		//3) 총합 += i*2;
}
}
