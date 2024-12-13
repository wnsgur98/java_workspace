package ex03_허준혁;

public class Stars1 {
	public static void main(String[] args) {
//	  *
//	  * *
//	 * * *

	for(int i =0; i<3; i++) {
		for(int j=3; j>(i*2)+1; j--) {//빈 공간
			System.out.print(" ");
		}
		for(int k=0;k<i+1;k++) {
			System.out.print("*");//점찍기
		}
		System.out.println();
	}
}
}
//j를 건드리면 1칸 역으로 321을 만들려면 
//for(int j=1; j<i-1; j++) {//빈 공간 좌측정렬 개꿀