package exceptionTest;
//4번 : 예외처리
public class ExceptionTest04 {

	public static void main(String[] args) {
		String[] ar = {"a", "b", "100", "0.5"};
		System.out.println(ar);
//		System.out.println(ar[0]);
//		System.out.println(ar[1]);
//		System.out.println(ar[2]);
//		System.out.println(ar[3]);
//		System.out.println(ar[4]);
		
	    for (String i : ar) {
	         try {
	            System.out.println(Integer.parseInt(i));
//	          java.lang.NumberFormatException: For input string: "a"
	         } catch (NumberFormatException e) {
	            System.out.println("숫자로 변환 불가 : " + e.getMessage());
	         }
	      }

}
}
