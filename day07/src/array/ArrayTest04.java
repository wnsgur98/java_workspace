package array;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class ArrayTest04 {
	public static void main(String[] args) {
		//1부터 10까지의 값을 배열에 넣고 출력하기
		//1)배열 선언 및 생성 => 값을 알 때
//		int[] number1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//		int[] number2 = {1, 2, 3, 4, 5};
//		
//		
//		//2)배열의 출력
//		for(int i = 0; i <number1.length; i++) {
//			System.out.println(number1[i]);			
//		}
//		
//		for(int i = 0; i< number2.length; i++) {
//			System.out.println(number2[i]);
//		}
//		
		//1. 1부터 10까지의 값을 배열에 넣고 출력
		//1) 배열 선언 및 생성(값을 모를 때)
//		int[] number3 = new int[10];//10칸짜리 배열을 생성하면 인덱스번호는 0~9
//		//2)for문(초기식 int i = 0 (인덱스 번호는 0부터 시작);
//		//			조건식 i < 배열명.length;	(배열의 길이보다 작을 동안 반복)
//		//			증감식 i++){
//		//3)	값 대입 배열명[i] = i+1;
//		//4)	출력 배열명[i]}
//		
//		for(int i =0; i< number3.length; i++) {
//			number3[i] = i +1;
//		}
//		for(int i =0; i < number3.length; i++) {
//			number3[i] = i;
//		}
//		
//		
//		System.out.println(number3);//참조값
//		System.out.println(number3[0]);
//		System.out.println(number3[9]);
		
		
		//5부터 1까지의 값을 배열에 담고 출력하기
		// 조건1) 칸수를 알 때로 선언한다
		// 조건2) 값을 대입하는 반복문, 값을 출력하는 반복문을 따로 작성한다
		
		//로지구성
		//1) 배열 선언
		//2) 값을 대입하는 반복문(for문)
		//		초기식 => int i = 0;
		//		조건식 => i < 배열명.length;
		//		증감식 => i++ {
		//3) 값을 출력하는 반복문(for문)
		
		int[] number = new int[5];//배열 선언 및 생성
		for(int i =0; i < number.length; i++){
//			number[4 - i] =i + 1; 이것도 가능
			number[i] = 5-i;
		}
		for(int i = 0; i <number.length; i++) {
			System.out.println(number[i]);
		}
		
		
		
		//2번째 방법)초기식을 5로 시작
		// int i = 5;
		// i > 5- 배열명.length;//5
		// i--
	    for(int i = 5; i > (5 - number.length); i--) {
	         number[5 - i] = i;
	      }
	    
	    //배열의 값 출력(0번째부터 순서대로 출력)
//      System.out.println();
//      for(int i = 0; i < number.length; i++) {
//         System.out.println(number[i]);
//      }
//      
//      //초기식 int = 5
//      //조건식 i > 5 -number.length
//      //증감식 i--
//      //출력 number[5-i]
//      for(int i =5; i>5-number.length;i--) {
//    	  System.out.println(number[5-i]);
//      }

	    //빠른 for문
	    for(int data : number) {
	    	System.out.println("값 : " + data);
	    }

}
}
