package task;

public class Task03 {
	public static void main(String[] args) {
		int num = 10;
		long num1 = 1234L;
		float num2 = 3.14f;
		double num3 = 3.141592;
		char num4 = 'A';
		boolean num5 = true;
		System.out.println(num);
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);
		System.out.println("\n===================================");
		final String name = "허준혁";
		final int birthdate =980929;
		System.out.printf("제 이름은 " + name + " 이고 생년월일은 " + birthdate +"입니다 ");
		System.out.println("\n===================================");
		int age = 25;
		double height = 160.5;
		boolean isStudent = true;
		System.out.println("나이 :"+ age +",타입은 정수형 ");
		System.out.println("키 : "+ height +",타입은 실수형");
		System.out.println("학생여부 :" + isStudent +",타입은 논리형");
		System.out.println("\n====================================");
		String hobby = "노래듣기";
		System.out.printf("안녕하세요, 제 이름은%s입니다,\n제 취미는%s입니다" , name,hobby);
		System.out.println("\n====================================");
		String strNum = "100";
		int intNum = 200;
		double doubleNum = 300.5;
		char charLetter = 'C';
		boolean boolVal =true;
		String result1 =(strNum + intNum);
		
		
}
}
