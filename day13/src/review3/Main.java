package review3;

public class Main {
	  public static void main(String[] args) {
//	      3) 잔액확인 프로그램
	//   SavingsAccount와 CheckingAccount 클래스는 Account 클래스 상속
	//   Account 클래스
	//   필드
//	      balance
	//   메소드
//	      deposit(double amount) : 금액을 추가
//	      withdraw(double amount) : 금액을 차감
	//
	//   SavingsAccount 클래스
	//   메소드 
//	      withdraw()를 오버라이딩하여 출금 시 잔액이 부족하면 "출금 실패!" 출력
	//
	//   CheckingAccount 클래스
	//   메소드
//	      withdraw()를 오버라이딩하여 추가로 1000원을 수수료로 부과
	//
	//   메인 메소드에서 두 클래스의 객체를 생성하고 입출금을 수행결과 출력

	      SavingsAccount sv = new SavingsAccount(5000);
	      CheckingAccount ca = new CheckingAccount(10000);

	      sv.deposit(3000);
	      sv.withdraw(7000);

	      ca.deposit(1000);
	      ca.withdraw(9000);
	   }

}
