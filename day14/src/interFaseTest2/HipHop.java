package interFaseTest2;

public class HipHop implements Music{

	@Override
	public void mode() {//부모 클래스보다 더 큰 접근제한자로 바꾸는건 가능
		System.out.println("힙합 모드");
		
	}
	void onlyHipHop() {
		System.out.println("onlyHipHop실행");
	}
}