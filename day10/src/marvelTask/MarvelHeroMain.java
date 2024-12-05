package marvelTask;

public class MarvelHeroMain {
	public static void main(String[] args) {
		
		//아이언맨과 헐크 객체를 만들고 정보출력
		MarvelHero ironMan = new MarvelHero("아이언맨", "로봇", 50 );
		System.out.println(ironMan);
//		ironMan.name = "아이언맨";
//		ironMan.age = 50;
//		ironMan.superpower = "로봇"
		ironMan.printInfo();
		ironMan.performAction();
		
}
}
