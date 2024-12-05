package print;
//10번 실습
public class printTask {
	public static void main(String[] args) {
		
		//1. printf를 사용해 형식에 맞게 출력하기
		//이름
		//나이
		//취미
		//키 : 실수형 2자리까지
		//몸무게 : 실수형 3자리까지
		
		//2. 10진수의 값 255를 8진수, 16진수, 10진수로 각각 출력하기
		
		//3. 상품정보를 println과 printf를 사용하여 아래 형식으로 출력하기
		// 각 자리수는 5자리로 정렬, tab키 2번 사용
//		=========================		
//		상품명		  가격
//		==========================
//		메로나		 1500원		
//		누네띠네  		 1200원
//		꼬북칩 		 2000원
//		초코파이		 3000원
		
		
		String name = "허준혁";
		int age = 27;
		String hobby = "listen to song";
		double height = 170.0;
		double weight = 65.0;
		
		System.out.printf("\n이름 : %s, \n나이 : %d, \n취미 : %S, \n키 : %2f, \n몸무게 : %3f", name, age, hobby, height, weight);
		System.out.println("\n========================================================================================");
		int number = 255;
		System.out.printf("\n8진수 : %o", 255);
		System.out.printf("\n10진수 : %d", 255);
		System.out.printf("\n16진수 : %x", 255);
		
		System.out.println("\n==============================================================================================");
		System.out.printf("\n%-5s\t\t", "상품명"); // printf("\n%-5s\t\t%5s\n", "상품명", "가격")
		System.out.printf("%-5s\t\t", "가격");
		System.out.println("\n==============================================================================================");
		System.out.printf("\n%-5s\t\t%5d원", "메로나", 1500);
		System.out.printf("\n%-5s\t\t%5d원", "누네띠네", 1200);
		System.out.printf("\n%-5s\t\t%5d원", "꼬북칩", 2000);
		System.out.printf("\n%-5s\t\t%5d원", "초코파이", 3000);
		
		//4. 봄여름가을겨울을 아래와 같이 출력하기
		//출력문1번으로 아래와 같이 출력하기
		System.out.println("\n봄\n\t\t여름\n\t가을\n\t\t겨울");
		
	}

}
