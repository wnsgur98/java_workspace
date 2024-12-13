package casting3;
//7번 : 캐스팅의 특징
public class Cat extends Animal{

	
	
	
	
	
	public Cat(String name, int age) {
		super(name, age);
	}

	@Override
	void crying() {
		System.out.println("야옹");
	}

}
