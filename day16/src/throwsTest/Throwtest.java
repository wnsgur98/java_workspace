package throwsTest;
//6번 : throw new 예외명();예외 발생시키기
public class Throwtest {
	public static void main(String[] args) {
		
		System.out.println("예외를 발생시킬거다");
		
		throw new NumberFormatException();
//		System.out.println("출력 끝");
}
}
