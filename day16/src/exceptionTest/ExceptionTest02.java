package exceptionTest;

public class ExceptionTest02 {
	public static void main(String[] args) {
		ExceptionTest02 et = new ExceptionTest02();
		et.printLength("java");
//		et.printLength(0.5);
//		java.lang.Error
//		et.printLength(null);
//		 java.lang.NullPointerException
}


	public void printLength(String data) {
		int result = data.length();
		System.out.println("글자 수 : " + result);
	}



}