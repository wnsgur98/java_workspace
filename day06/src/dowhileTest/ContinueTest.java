package dowhileTest;
//7번 : continue문
public class ContinueTest {
	public static void main(String[] args) {
		//1~10까지 중 7을 제외하고 출력(for문)
		for(int i = 1;i <=10; i++) {
			if(i==7) {
				continue;
			}
			System.out.println(i);
		}
		//1~10까지 중 5을 제외하고 출력(while문)
		int num =1;
		while(num <= 10) {
			if(num ==5) {
				num++;
				continue;
			}
			System.out.println(num);
			num++;
		}
}
}
