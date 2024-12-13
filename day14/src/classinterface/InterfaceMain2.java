package classinterface;
//11번 : 인터페이스의 단일 상속

interface ParentInter{
	void method1();
}

interface ChildInter extends ParentInter{//인터페이스 상속 가능
	void method2();
}

class ClassA implements ChildInter{

@Override
	public void method1() {
		System.out.println("ParentInter의 메소드 구현");
		
	}

	@Override
	public void method2() {
		System.out.println("ChildInter의 메소드 구현");
		
	}

public class InterfaceMain2 {
	public static void main(String[] args) {
		ClassA a = new ClassA();
		a.method1();
		a.method2();
		
		ChildInter ci = new ClassA();//상속을 받아서 method1,2 둘 다 있음
		ci.method1();
		ci.method2();
		
		ParentInter pi = new ClassA();
		pi.method1();
		
}
}
}
