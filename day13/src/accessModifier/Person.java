package accessModifier;

public class Person {
	 //필드
	   private String name;
	   private int age;

	   //setter 메소드 : name 필드의 값을 설정
	   public void setName(String name) {
	      this.name = name;
	   }
	   
	   //getter : 필드의 값ㅇ르 반환, get+필드명
	   public String getName() {
	      return name;
	   }

	   //메소드
	   void printInfo() {
	      System.out.println(this.name + "님 환영합니다!");
	   }
}
