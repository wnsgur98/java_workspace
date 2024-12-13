package casting3;
//7번 : 캐스팅의 특징
public class Dog extends Animal{

	
	
	public Dog(String name, int age) {
		super(name, age);
	}

	@Override
	void crying() {
		System.out.println("멍멍");
	}
	
	void walk() {
		System.out.println("산책가기");
	}

	
}
