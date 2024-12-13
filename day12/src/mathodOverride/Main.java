package mathodOverride;

public class Main {
	public static void main(String[] args) {
		Animal animal = new Animal("ehdanf");
		System.out.println(animal);
		animal.sound();
		
		Dog dog = new Dog("바둑이");
		dog.sound();
		
		Cat cat = new Cat("별이");
		cat.sound();
		
}
	
}
