package review;

public class CastingTask {
	public static void main(String[] args) {
		 //매개변수의 다형성을 활용하여 모든 클래스타입의 메소드를 호출하기 => 업캐스팅
//	Ballad ballad = new Ballad();
//	ballad = null;//참조제거
		
		check(new Ballad());
		check(new HipHop());
		check(new Rock());
	}
	//부모 클래스 타입의 매개변수
	static void check(Music music) {
		music.mode();
		if(music instanceof Ballad) {
			((Ballad)music).onlyBallad();
		}if(music instanceof HipHop) {
			((HipHop)music).onlyHipHop();
		}if(music instanceof Rock) {
			((Rock)music).onlyRock();
		}
	
}
}
