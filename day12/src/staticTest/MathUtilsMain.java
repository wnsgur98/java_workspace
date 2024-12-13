package staticTest;
//2번 
import javax.annotation.processing.SupportedSourceVersion;

public class MathUtilsMain {
	public static void main(String[] args) {
		//getMax()호출 => 매개변수o, 리턴값o
		System.out.println(MathUtils.getMax(10,20));
		
		
		
		//round()호출
		System.out.println(MathUtils.round(5.50));
}
	
	
}
