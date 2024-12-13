package abstractTest1;

public class AbstractTest {
	public static void main(String[] args) {
		//일반 클래스는 ClassA 객체화 바로 가능
		ClassA a = new ClassA();
		System.out.println(a);
		
		//추상 클래스 ClassB 객체화 불가능
//		ClassB b = new ClassB();
		
		//추상클래스 ClassB를 상속받은 일반클래스 ClassC는 객체화 가능
		ClassC c = new ClassC();//ClassB 추상 클래스를 상속받은 자식클래스
		System.out.println(c);
		ClassB b = new ClassC();//업캐스팅
		System.out.println(b);
		b.method1();//오버라이딩된 메소드 호출
		//다운캐스팅
		((ClassC)b).printNumber();
}
}
