package interfaceTest3;

public interface ParentB {
	default void greet(){
		System.out.println("ParentsB의 메소드 호출");
	}
}
