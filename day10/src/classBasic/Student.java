package classBasic;
//1-1 : 클래스 - 사용자 정의 타입이다(자료형)
public class Student {
	//필드
	int math;
	int eng;
	int kor;
	double avg;
	String name;
	
	//메소드(기능)
	//1-3번 : 연관성잇는 저장공간과 기능을 한 곳에 모아 관리할 수 있는것
	int getTotal() {
		return math + eng + kor;
	}
	
}
