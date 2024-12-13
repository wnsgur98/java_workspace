package innerTest;
//1번 : 내부클래스
public class Outer {
	//Outer 클래스의필드
	int var1;
	String data1 = "Outer";
	
	//Outer 클래스의 기본 생성자
	public Outer() {
		System.out.println("외부 클래스 생성자");
	}
	
	//내부클래스 Inner 정의
	class Inner{
		//필드 ,생성자, 메소드
		//Inner 클래스의 필드
		int var2 = 10;
		String data2 = "Inner";
		public Inner() {
			super();
			System.out.println("내부 클래스 생성자");
		}
		
		//Inner 클래스 메소드
		void innerMethod() {
			System.out.println("내부클래스의 메소드 호출");
			var1 = 10;//외부클래스의 참조값과 다름
			//this.var1 = 10;//var1이 내부 클래스에 없기때문
			outerMethod();
	}
	}
	//메소드
	void outerMethod() {
		System.out.println("외부클래스의 메소드 호출");
}

	}
