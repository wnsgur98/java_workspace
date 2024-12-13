package ex04_허준혁;

public class Student extends Person {
//필드
	int javaScore = 0;
	int dbmsScore = 0;
	int htmlScore = 0;
//생성자
	public Student(String name) {
		super(name);
	}
	//메소드
	void getTotalScore( javaScore + dbmsScore + htmlScore);
	
}
