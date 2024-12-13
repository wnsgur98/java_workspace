package exceptionTest;
//3번 : Exception Basic 예외처리
public class ExceptionTest03 {
   public static void main(String[] args) {
      ExceptionTest03 et = new ExceptionTest03();
      System.out.println("프로그램 시작");
      et.printLength("java");
      et.printLength(null);
      System.out.println("프로그램 종료");
   }

   public void printLength(String data) {
	   try {
		   int result = data.length();
		   //data의 값이 null이 들어오면 NullpointerException 발생
		   System.out.println("글자 수 : " + result);
	   }catch(NullPointerException e) {
		   System.out.println("null값은 입력 불가능합니다");
		   //예외정보를 언든 방법 3가지
		   //1. e.toString(), e => 예외 종류(클래스)와 발생한 이유 반환
//		   System.out.println(e);
//		   System.out.println(e.toString());
		   //2. e.getMessage() => 예외가 발생한 이유만 반환
		   System.out.println(e.getMessage());
		   //3. e.printStackTrace() => 예외가 어디서 발생햇는지 추적한 내용까지 출력
		   e.printStackTrace();
	   }catch(Exception e) {
		   //우리가 try에서 어떤 오류가 발생할 지 전부 예상하기 힘들다
		   //예상치 못한 오류를 잡기 위해 Exception타입의 참조변수에 저장가능하다(업캐스팅)
		   System.out.println("예상치 못한 오류");
	   }
}
}