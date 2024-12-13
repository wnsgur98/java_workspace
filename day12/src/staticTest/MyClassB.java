package staticTest;

public class MyClassB {
	public static void main(String[] args) {
		//1.인스턴스 변수 출력 => 객체 생성 필수
		MyClassA a = new MyClassA();
		System.out.println(a.instanceVar);//0
		
		//2.정적 변수 출력 => 객체 생성으로 접근 가능하나 권장하지 않음
		//클래스명.정적변수명으로  접근한다!! => 공통된 저장공간을 사용
		System.out.println(a.instanceVar);
		System.out.println(MyClassA.staticVar);
		
		//3. 다른 클래스에서 인스턴스 메소드 호출
		a.instanceMethod1();
		
		//4. 다른 클래스에서 스태틱 메소드 호출
		MyClassA.staticMethod1();
}
}
