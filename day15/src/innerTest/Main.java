package innerTest;
//1번 : 내부클래스와 외부클래스 객체화
public class Main {
	public static void main(String[] args) {
		//외부클래스의 객체 생성
		Outer outer = new Outer();
		System.out.println("외부 클래스의 참조값 : " + outer);
		System.out.println("외부 클래스의 데이터 : " + outer.var1);
		
		//내부클래스의 객체 생성
		//내부클래스는 외부 클래스의 인스턴스를 통해 생성해야함
		Outer.Inner inner = outer.new Inner();
		System.out.println("내부클래스의 참조값 : " + inner);//$가 있으면 내부클래스
		System.out.println("내부클래스의 데이터 : " + inner.var2);
		inner.innerMethod();
		
		//생성자2개를 이용해서 객체 생성하는 방법
		Outer.Inner inner2 = new Outer().new Inner();
		
	}
}
