package variable;
//2번 : 변수명 선언시 주의사항
public class Variable02 {
	public static void main(String[] args) {
		// 문자부터 시작한다
		// int 1num = 10; 숫자부터 시작시 오류발생
		int nu1m = 10;
		int num1 = 10;
		
		// 특수문자를 쓸 수 없다(단, _와 $는 가능)
		// int @#$% = 10;
		int a$b_ = 10;
		System.out.println(a$b_);

		// 공백을 사용할 수 없다(카멜 표기법, 스네이크 표기법 등을 활용한다)
		// int num ber = 10;
		int myAge = 10; // 첫단어 소문자로 시작, 단어가 바꿀 때 첫문자 대문자로 카멜 표기법
		int my_age = 10; //첫단어 소문자로 시작, 단어가 바뀔 때 언더바로 연결 스네이크 표기법
		int MyAge = 10;	//첫단어 대문자로 시작, 단어가 바뀔 때 첫 문자 대문자로 파스칼 표기법(클래스명 작성시)
		
		//키워드(예약어)를 사용할 수없다
		//int int = 10;
		//int for = 10;
		
		//되도록 소문자로 시작한다(대소문자를 구분한다)
		int Abc = 100;
		int abc = 200;
		System.out.println(Abc);
		System.out.println(abc);
		

	}
}

