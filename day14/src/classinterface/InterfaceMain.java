package classinterface;
//10번 인터페이스 다중구현

interface InterfaceA{
	void methodA();
}

interface InterfaceB{
	void methodB();
}

class ClassC implements InterfaceA, InterfaceB{//다중구현 가능

	@Override
	public void methodA() {
		System.out.println("InterfaceA의 메소드 구현");
		
	}

	@Override
	public void methodB() {
		System.out.println("InterfaceB의 메소드 구현");
		
	}
	
}


public class InterfaceMain {
	public static void main(String[] args) {
	
}
}
