package anonymousTest2;

public class AnimalMain {
	public static void main(String[] args) {
		
		Animal cat = new Animal() {

			@Override
			public void speak() {
			System.out.println("야옹");
			
			}
						
		};
		
		Animal dog = new Animal() {

			@Override
			public void speak() {
				System.out.println("멍멍");
				
			}
			
		};
		System.out.println(cat);
		System.out.println(dog);
	}
}
