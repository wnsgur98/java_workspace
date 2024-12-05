package section08;

public class Ex08_01 {
	public static void main(String[] args) {
		// 08-1 예제
		printHello();// main 메서드 안에서 printHello()메서드 호출
		// 08-4예제
		Ex08_01 ex = new Ex08_01();//
		ex.name = "김나비";
		ex.sayName();// sayName()메서드 출력

		// 08-3 예제
		Ex08_01 jogger = new Ex08_01();// 객체 생성
		jogger.run();// run 메서드 호출

		// 08-7 예제
		Ex08_01 myBook = new Ex08_01();// 객체 생성
		myBook.count(3);// count 메서드 호출
		
		// 08-9 예제
		Ex08_01 calc = new Ex08_01();// 객체 생성
		calc.sum(5, 3);// sum 메서드 호출
		calc.sum(10, 7);// sum 메서드 호출

		// 08-11 예제
		Ex08_01 hong = new Ex08_01();// 객체 생성
		hong.introduce("홍길동", 20);//introduce 메서드 호출
		hong.hello();
		
		// 08-13 예제
		int nums[]= {100, 200};//배열 생성
		Ex08_01 Calc = new Ex08_01();//Calc 객체 생성
		Calc.sum(nums);//sum 메서드 호출
		
		// 08-15 예제
		int[] nums1 = {500, 200};//배열 생성
		Ex08_01 calc1 = new Ex08_01();// calc1 객체 생성 
		System.out.println("숫자들의 합은 " + calc1.sum1(nums1) + "입니다");//sum 메서드를 호출해서 return된 값을 출력
		

	}

	// 08-1예제
	static void printHello() {// static 키워드를 통해서 바로 호출
		System.out.println("안녕하세요");
		System.out.println("만나서 반갑습니다");
	}

	// 08-2 예제
	void run() {// 리턴 값 없는 메서드
		System.out.println("run run run!");
	}

	// 08-4 예제
	String name;// 조거 이름

	void sayName() {// 리턴 값 없는 sayName 메서드 필드에서 출력
		System.out.println("제 이름은 " + name + "입니다");
	}

	// 08-6 예제
	void count(int bookNum) {// 리턴 값 없느 count 메서드
		System.out.println("책은 " + bookNum + "권 입니다");
	}

	// 08-8 예제
	void sum(int num1, int num2) {// 리턴 값 없는 sum 메서드
		System.out.println("두 수의 합은 " + (num1 + num2) + "입니다");
	}

	// 08-10 예제
	void introduce(String name, int age) {// 리턴 값 없는 introduce 메서드
		System.out.println("제 이름은 " + name + "이고, 나이는" + age + "세입니다.");
	}

	void hello() {
		System.out.println("안녕하세요");
	}
	
	// 08-12 예제
	void sum(int[] nums) {
		int result = 0;
		for(int i = 0; i<nums.length; i++) {
			result += nums[i];//매개 변수로 받은 배열의 요소 값을 하난씩 result 갑에 더함
		}
		System.out.println("숫자들의 합은 " + result + "입니다");
	}

	// 08-14 예제
	int sum1(int [] nums1) {
		int result = 0;
		for(int i = 0; i< nums1.length; i++) {
			result += nums1[i];
		}
		return result;// 매개변수로 받은 값을 무도 던한 result 값을 다시 반환함
		
	}
}
