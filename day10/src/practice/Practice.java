package practice;

public class Practice {
//	1. 동물 클래스를 작성하세요
//	 필드(속성) : '이름', '나이', '종류'라는 필드
//	    - 이름 : 동물의 이름을 저장하는 곳
//	    - 나이 : 동물의 나이를 저장하는 곳
//	    - 종류 : 동물의 종류(개, 고양이, 새 등)를 저장하는 곳
//	 메서드(행동)
//	    - 밥먹기() : 동물이 밥을 먹는 행동을 하는 메서드
//	    - 놀기() : 동물이 노는 행동을 하는 메서드
//	    - 자다() : 동물이 자는 행동을 하는 메서드
//	    - 생일축하() : 동물의 생일을 축하하는 메서드
	//필드
	String name;
	int age;
	String type;
	public Practice(String name, int age, String type) {
		this.name = name;
		this.age = age;
		this.type = type;
	}
	void printInfo() {
		System.out.println("이름: "+this.name + "입니다");
		System.out.println("나이: "+this.age + "살입니다");
		System.out.println("종류: "+this.type + "입니다");
	}
	void Action() {
		System.out.println(this.name + "밥을 먹고 있습니다");
		System.out.println(this.name + "놀고 있습니다");
		System.out.println(this.name + "자고 있습니다");
		System.out.println(this.name + "의 생일을 축하합니다");
	}

//	2. BasicTv 클래스를 작성하세요
//	필드 :
//	boolean power : TV 전원 상태 (기본값: false)
//	int channel : TV 채널 (기본값: 1)
//	String color : TV의 색상
//	int size : TV의 크기
//	int price : TV의 가격
//
//	메서드:
//	void powerOnOff() : TV 전원을 켜거나 끄는 메서드
//	      전원이 켜져 있으면 끄고, 꺼져 있으면 켜야 다른 동작이 가능하다
//	void channelUp() : 채널을 1씩 증가시키는 메서드
//	      채널 최대값 999
//	void channelDown() : 채널을 1씩 감소시키는 메서드
//	      채널 최소값 1

	boolean power;
	int channel;
	String color;
	int size;
	int price;
	public Practice(boolean power, int channel, String color, int size, int price) {
		super();
		this.power = power;
		this.channel = channel;
		this.color = color;
		this.size = size;
		this.price = price;
	}
	void power(){
		power = !power;
		System.out.println("현재 TV 상태 : " +(power  ? "켜짐" : "꺼짐"));
		if(power) {
			
		}
			
	}
	void channel() {
		channel = 1;
		if(power) {
			System.out.println("현재채널 :" + channel);
			if(channel>999) {
				channel++;
				System.out.println("마지막 채널입니다");
			if(channel<1) {
				channel--;
				System.out.println("마지막 채널입니다");
			}
			}

		}
	}
//	3. BasicTv 클래스와 함께 동작하는 TvController 프로그램을 작성하세요
//	   프로그램은 사용자로부터 명령을 입력받아 TV를 제어한다
//
//	   BasicTv 객체를 생성하고, 초기값으로 색상 "Black", 크기 32인치, 가격 500000원을 설정
//	   프로그램은 무한 반복(while)하며 사용자에게 다음 메뉴를 출력한다
//
//	=== TV 컨트롤 메뉴 ===
//	1. 전원 On/Off
//	2. 채널 올리기
//	3. 채널 내리기
//	4. 종료
//	메뉴 번호 입력 : 
//
//	사용자가 메뉴 번호를 입력하면, 입력된 번호에 따라 다음 동작을 수행한다
//	1 : powerOnOff() 메서드 호출
//	   전원이 켜지면 "TV 전원이 켜졌습니다." 출력, 꺼지면 "TV 전원이 꺼졌습니다." 출력
//	2 : TV 전원이 켜져 있으면 channelUp() 메서드 호출하고, "현재 채널: [채널 번호]"를 출력
//	   꺼져 있으면 "TV 전원을 먼저 켜주세요." 메시지 출력
//	3 : TV 전원이 켜져 있으면 channelDown() 메서드를 호출하고, "현재 채널: [채널 번호]"를 출력합니다. 꺼져 있으면 "TV 전원을 먼저 켜주세요." 메시지 출력
//	그 외 : 프로그램을 종료하고 "프로그램을 종료합니다." 메시지 출력
	//3번 문제 로직
	//스케너 클래스
	//
	
}
