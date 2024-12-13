package interfaceTest3;

public class Child implements ParentA, ParentB{

	@Override
	public void greet() {
		// TODO Auto-generated method stub
		ParentA.super.greet();
	}

	//다중 구현 충돌 문제
	//Child 클래스가 두 인터페이스를 모두 사용할 때 어던 인터페이스에 있는
	//greet()를 사용할 지 모호성이 발생한다
	// => Child 클래스에서 greet()메소드를 반드시 재정의해줘야한다
	//ParentA.super.greet()는 ParentA인터페이스의 defaul greet메소드 호출
}
