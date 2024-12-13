package mathodOverride;

public class Cat extends Animal {

	public Cat(String name) {
		super(name);
	}
	
	@Override
	void sound() {
		System.out.println("고양이가 야옹하고 웁니다");
	}

	
}