package objectTest;

public class Student {
//필드
	String name;
	int javaScore;
	int dbmsScore;
	int total;
	
	//생성자
	public Student(String name, int javaScore, int dbmsScore, int total) {
		super();
		this.name = name;
		this.javaScore = javaScore;
		this.dbmsScore = dbmsScore;
		this.total = total;
	}
	
	//toString메소드 오버라이딩
	@Override
	public String toString() {
		return "Student [name : " + this.name + ", javaScore : " + this.javaScore];
	}
	
	
	
}
