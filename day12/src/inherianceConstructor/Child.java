package inherianceConstructor;

public class Child extends Parents {
	//필드
	int num;

	//생성자
	public Child( ) {
		System.out.println("Child 생성자 호출");
	}	
	
	//메소드
	void printlnt(int num) {
		System.out.println(num);
	}
}
