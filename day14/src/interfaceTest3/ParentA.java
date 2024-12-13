package interfaceTest3;

public interface ParentA {
	default void greet() {
		System.out.println("ParentA의 greet메소드 호출");
	}
}
