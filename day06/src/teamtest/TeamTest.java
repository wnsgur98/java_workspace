package teamtest;

import java.util.Scanner;

public class TeamTest {
	public static void main(String[] args) {
		//1.
	    //문자 추출 사각형 생성 -> 사용된 주제 : 반복문, 입출력메소드, 형변환 
	      Scanner sc = new Scanner(System.in);
	      String msg = "";
	      char point = ' ';
//	      
//	      //문자열 받아오기
//	      System.out.print("문자열을 입력해 주세요 : ");
	      msg = sc.next(); //문자 입력 받아오기
	      sc.nextLine(); //void buffer
//	      
//	      //문자열 중 3번째 문자를 가져오기
	      point = msg.charAt(2); //hello
//	      
//	      //해당 문자로 사각형 만들기
	      for(int i=0; i<5; i++) {
	         for(int j=0; j<5; j++) {
	            System.out.print(point);
	         }
	         System.out.println();
	      	 }     
	      //2.
	    //100만점인 4과목의 점수를 입력해서 평균 학점과 각과목의 성적(A+)을 출력
	      //95-100 = A+(4.5)
	      //90-94 = A(4.0)
	      //85-89 = b+(3.5)
	      //80-84 = b(3.0)
	      //75-79 = c+(2.5)
//	
//		int num1 = 0, num2 =0, num3 =0, num4 =0, num5 =0;
//		double total = 0.0 , unit1 = 0.0, unit2 = 0.0, unit3 = 0.0, unit4 = 0.0, unit5 =0.0;
//		String grades = "";
//		
//		
//		System.out.println("과목1 점수 입력 : ");
//		num1 =sc.nextInt();
//		System.out.println("과목2 점수 입력 : ");
//		num2 =sc.nextInt();
//		System.out.println("과목3 점수 입력 : ");
//		num3 =sc.nextInt();
//		System.out.println("과목4 점수 입력 : ");
//		num4 =sc.nextInt();
//		if(num1 >=95 && num1 <=100){
//			grades ="A+";
//			unit1 = 4.5; 
//		}else if(num2 >=90 && num2 <=94) {
//			grades = "A";
//			unit2 = 4.0;
//		}else if(num3 >=85 && num3 <=89) {
//			grades = "B+";
//			unit3 = 3.5;
//		}else if(num4 >=80 && num4 <=84) {
//			grades = "B";
//			unit4 = 3.0;
//		}else if(num5 >=75 && num5 <=79) {
//			grades = "C";
//			unit5 = 2.5;
//		}
//		System.out.printf("평균 %.1f", (num1+num2+num3+num4+num5)/4.0);
//		System.out.printf("평균 %.1f", (unit1+unit2+unit3+unit4+unit5)/0.4);
//		sc.nextLine();
//		

		
		
	      
	      //문자 추출 사각형 생성 -> 사용된 주제 : 반복문, 입출력메소드, 형변환 
//	      Scanner sc = new Scanner(System.in);
//	      String msg = "";
//	      char point = ' ';
//	      
//	      //문자열 받아오기
//	      System.out.print("문자열을 입력해 주세요 : ");
//	      msg = sc.next(); //문자 입력 받아오기
//	      sc.nextLine(); //void buffer
//	      
//	      //문자열 중 3번째 문자를 가져오기
//	      point = msg.charAt(2);
//	      
//	      //해당 문자로 사각형 만들기
////	      for(int i=0; i<5; i++) {
////	         for(int j=0; j<5; j++) {
////	            System.out.print(point);
////	         }
////	         System.out.println();
////	      }
//	      
//	      //해당 문자로 속이 빈 사각형 만들기
//	      for(int i=0; i<5; i++) {
//	         for(int j=0; j<5; j++) {
//	            if(i==0 || i==4) {
//	               System.out.print(point);
//	            }else if(j==0 || j==4) {
//	               System.out.print(point);
//	            }else {
//	               System.out.print(" ");
//	            }
//	         }
//	         System.out.println();
//	      }

	
}
}
