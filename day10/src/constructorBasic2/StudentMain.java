package constructorBasic2;
//7번 : 기본 생성자
class Student{
	//필드
	String name;
	int age;
	
	//기본생성자
	public Student() {
		System.out.println("기본생성자가 호출되었습니다");
	}
}
public class StudentMain {
	public static void main(String[] args) {
		  Student st = new Student(); //객체 생성시 기본생성자 호출
	      st.name = "짱구";
	      System.out.println(st.name);
}
}
