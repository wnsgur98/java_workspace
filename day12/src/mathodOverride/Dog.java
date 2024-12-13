package mathodOverride;

public class Dog extends Animal {
	//메소드 오버라이딩 : 부모 클래스의 메소드를 자식클래스에서 재정의

	public Dog(String name) {
		super(name);
	}
	
	@Override
	void sound() {
	System.out.println("강아지가 멍멍 짖습니다");
	}
	
}
