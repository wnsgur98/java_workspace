package exceptionTask;

public class AccountMain {
	  // 은행계좌 클래스(Account)

    // 필드 : 잔고 balance private
    // 생성자 : 기본생서자 추가
    // 출금메소드 : withdraw 매개변수 1개
    //   잔액보다 출금금액이 크다면 출금불가 예외처리/현재 잔고는 _원입니다. 
    //    출금금액의 _원이 부족하여 출금이 불가능합니다 출력

    // 입금메소드 : deposit 매개변수 1개
    //   잔액에 입금된 금액 추가후 입금된 금액은 _원입니다. 현재 잔고는 _원입니다. 출력
    //   모든 예외처리는 메소드를 사용하는 쪽으로 던지기

    // AccountMain클래스
    //   메인메소드
    //   입금메소드 호출
    //   출금메소드 호출

    //   사용자 예외 정의 클래스
    //AccountException extends Exception
	
//	Account a = new Account(5000);
//	  try {
//	         a.withdraw(15000);
//	      } catch (AccountException e) {
////	         System.out.println(e.getMessage());
////	         System.out.println(e);
//	         e.printStackTrace();
//	      }
//
//	      a.deposit(1000);
//	   }
//
}


