package listTest;

import java.util.ArrayList;

public class ArrayListTest01 {
	public static void main(String[] args) {
		//ArrayList 객체 생성
		ArrayList al = new ArrayList();
		System.out.println(al);//[]가 나오면 오버라이딩 된 것은 아닌지 확인해보기
		
		//요소 추가 add
		al.add(al);//객체 자기자신을 넣으면 (this Collection)이 나온다 저게 출력되게 삼항연산자를 씀
		al.add(2);
		System.out.println(al);
		al.add(0.5);
		al.add(1);
		al.add(1);
		System.out.println(al);
		
		//ArrayList의 크기를 반복하여 요소 출력
		for(int i = 0; i < al.size(); i++) {
			System.out.println(i + " : " + al.get(i));
		}
		
		//<Element> : 제네릭
		ArrayList<Integer> al2 = new ArrayList<Integer>();
//		ArrayList<Integer> al2 = new ArrayList<>();//제네릭안에 똑같이 들어가면 이런식으로 새략가능
		for(int i = 0; i < 10; i++) {
			al2.add((10-i) *10);
		}
		System.out.println(al2);
		
		for(int data : al2) {
			System.out.println(data);
		}
}
}
