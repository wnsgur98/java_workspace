package inheritanceTest2;

public class Dog extends Animal{
	//강아지 클래스의 고유 메소드
	void bark() {
		System.out.println(this.name + "이가 멍멍 짖습니다");
	}
}
