package teamtest;

import java.util.Scanner;

public class TeamTest_javtang {
	public static void main(String[] args) {
//		★메소드로 계산기 만들기★
//
//		사칙연산 실행
//		조건
//		1차원 2칸짜리 배열 생성
//		사용자로부터 입력 받고(int형) 배열에 저장(for문으로 저장)
//		메소드4개(더하기, 빼기, 곱하기, 나누기)
//		리턴타입 O, 매개변수 O (매개변수는 배열로 전달)
//		-> 더하기 메소드(for-each문 사용)
//		-> 빼기 메소드(큰값 - 작은값)
//		-> 곱하기 메소드(원하시는 대로)
//		-> 나누기 메소드(실수형으로 형변환. 0번 인덱스/1번 인덱스.
//		0으론 나눌 수 없음.)
		// 1번 문제 로직구성
		// 배열생성
		// 스캐너 클래스 import
		// for 입력받아오기
		// int add(int[] arr){for-each}
		// 사칙연산 메소드 실행 ...

		// if(arr[1]==0){ syso("0으로 나눌 수 없습니다");}
		// else{ 나누기 메소드 실행 }

		// 빼기
		// int subraction(int[] arr){
		// int max = arr[0]>arr[1]?arr[0]:arr[1];
		// int min = arr[0]>arr[1]?arr[1]:arr[0];
		// return max - min;}

		// 곱하기
		// int multiply(int[] arr){ return arr[0]*arr[1];}

		// 나누기
		// double divide(int[] arr){ return (double)arr[0]/arr[1];}
//
		Scanner sc = new Scanner(System.in);

		TeamTest_javtang jt = new TeamTest_javtang();
		int[] ar = new int[2];
		int i = 0;
		System.out.println("정수 2개 입력하기");
		for (i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
		}

		System.out.println(jt.add(ar));
		System.out.println(jt.subraction(ar));
		System.out.println(jt.multiply(ar));

		if (ar[1] == 0) {
			System.out.println("0으로 나눌 수 없습니다");
		} else {
			System.out.println(jt.divide(ar));
		}

		// 메인메소드 끝--------
//		★메소드를 활용한 연령대별 버스카드 프로그램★
//
//		연령대를 입력받고(입력)
//		연령대를 판별한다(어린이, 청소년, 성인)(메소드1)
//		버스카드에 일정 금액 돈을 충전한다(입력)
//		버스카드를 사용(메소드2){  // int요금과 String연령대가 들어간다(매개변수 2개)
//		   연령대별 요금을 설정한다(final 변수)
//		   잔액 소진할 때까지 버스카드 사용(반복문)
//		   버스카드를 사용하는동안 "버스 탑승 완료." 출력
//		   "버스를 탑니다. 잔액 : " 출력
//		   잔액이 부족해지면 "잔액이 부족합니다." 출력하고 프로그램 종료(탈출)
		/*
		 * main method 변수 생성 (int age = 0, money = 0; String ageName ="";)
		 * 
		 * 스캐너 클래스 할당 age = 나이 입력받아오기; money = 돈 입력받아오기; ageName = checkAge(age);
		 * takeBus(money, ageName);
		 * 
		 *
		 * 사용자 지정 method 1. 연령대 판별 String checkAge(int age){ if(age>19){ return "성인";
		 * }else if(age>12){ return "청소년"; }else{ return "어린이"; } }
		 *
		 * 2. 버스카드 사용 메소드 void takeBus(int money, String age){ 상수 생성 (final int CHILD =
		 * 500; ~ STUDENT = 800; ~ ADULT = 1400;) 변수 생성 (int charge = 0;
		 *
		 *
		 * switch(age){ case "어린이": charge = CHILD; break; ... }
		 *
		 * while(true){ if(money - charge > 0 )//돈이 있으면{ syso("버스 탑승 완료."); money -=
		 * charge; syso("잔액 : "+money); }else{ syso("잔액이 부족합니다."); break; }
		 */
//
//		int age = 0, money = 0;
//		age = sc.nextInt();
//		money = sc.nextInt();
//		String ageName = "";
//		ageName =jt.checkAge(age);
//		jt.takeBus(money, ageName);

		//
		// 문제3.
		// ★메소드 회원가입★(메소드로 코드 분리하기)★
		//
		// 회원가입(입력 : 아이디, 닉네임, 비번, 비번확인)
		// → 배열로 임의로 아이디와 닉네임 만들기(배열은 1차원 배열, 값은 각 3개)
		// → 회원가입 시 배열에 있는 아이디를 사용한다고 하면 중복된다고 알려주기
		// → 닉네임도 겹치면 알려주기
		// → 비번은 두번 입력 받아 두개의 비번이 동일해야 하며, 아스키코드로 암호화
		// → 겹치는거 없고, 비번도 다 맞으면 "회원가입 성공" 후 끝
		// → 최종출력 "userName님 환영합니다, 아이디는 userId, 비밀번호는 암호화된 {아스키코드값} 입니다"
		// └ 배열, 메소드, for문, if문, 형변환

//	      main method
//	      scanner class 추가
//	      문자열 변수 아이디, 닉네임, 비번, 비번확인
//	      

//	      사용자 지정 method
//	      boolean idCheck(String id){
//	      
//	      String basicId[3] = {"dlachgus", "answnsgur", "qowltn"}; //기존 아이디   
//	      //아이디 중복검사
//	      for(String data : basicId) {
//	         if(data.equals(id)) {
//	            syso("아이디가 중복됩니다.");
//	            return false; //id 중복
//	         }
//	      }
//	      return true;
		// }

		// 닉네임 중복검사
//	      boolean nameCheck(String name){
//	      String basicName[3] = {"adf", "adf", "dasf"}; //기존 닉네임
		// for(String data : basicName) {
		// if(data.equals(name)) {
		// syso("닉네임이 중복됩니다.");
		// return false; //닉네임 중복
		// }
		// }
//	         return true; 
//	      }

		// 비빌번호 재확인
//	      → 비번은 두번 입력 받아 두개의 비번이 동일해야 하며, 아스키코드로 암호화
//	      String pwCheck(String pw, String pwCheck){
		// 비밀번호 길이
//	         if(pw.length() != pwCheck.length()){return false;}

//	         //문자 단위 체크
//	         for(int i = 0; i<pw.length; i++){
//	            if(pw.charAt(i)!=pwCheck.charAt(i)){
//	               return false;
//	            }
//	         }

//	         //암호화(아스키코드)
//	         String encryptionPw = "";
//	         for(int i=0; i<pw.length; i++){
//	            encryptionPw += ((int)pw.charAt(i))+""; //자동형변환
//	         }
//	         return encryptionPw;
//	      }

//		★메소드 회원가입★(메소드로 코드 분리하기)★
//
//		회원가입(입력 : 아이디, 닉네임, 비번, 비번확인)
//		→ 배열로 임의로 아이디와 닉네임 만들기(배열은 1차원 배열, 값은 각 3개)
//		→ 회원가입 시 배열에 있는 아이디를 사용한다고 하면 중복된다고 알려주기
//		→ 닉네임도 겹치면 알려주기
//		→ 비번은 두번 입력 받아 두개의 비번이 동일해야 하며, 아스키코드로 암호화
//		→ 겹치는거 없고, 비번도 다 맞으면 "회원가입 성공" 후 끝
//		→ 최종출력 "userName님 환영합니다, 아이디는 userId, 비밀번호는 암호화된 {아스키코드값 } 입니다"
//		└ 배열, 메소드, for문, if문, 형변환

		String id = "", name = "", pw = "", pwCheck = "";
		while(true) {
			System.out.println("아이디 입력:");
			id = sc.next();
		if(jt.idCheck(id)==false) {
			System.out.println("아이디 중복");
			break;
		}
		System.out.println("닉네임 입력:");
		name = sc.next();
		if(jt.nameCheck(name)==false) {
			System.out.println("닉네임 중복");
			break;
		}
		System.out.println("비밀번호 입력:");
		pw = sc.next();
		System.out.println("비밀번호 재입력:");
		pwCheck = sc.next();
		if(jt.pwCheck(pw, pwCheck).equals("false")) {
			System.err.println("불일치 종료");
			break;
			}//if문 끝
		System.out.println(name + "님 환영합니다, 아이디는 " + id + ", 암호화된 번호는  " +jt.pwCheck(pw, pwCheck)+ "입니다");
		break;
		
		}//while문 끝
		
	}// 메인 끝

	String checkAge(int age) {
		if (age > 19) {
			return "성인";
		} else if (age > 12) {
			return "청소년";
		} else {
			return "어린이";
		}
	}

	void takeBus(int money, String age) {
		final int CHILD = 500, STUDENT = 800, ADULT = 1400;
		int charge = 0;
		switch (age) {
		case "어린이":
			charge = CHILD;
			break;
		case "청소년":
			charge = STUDENT;
			break;
		case "성인":
			charge = ADULT;
			break;
		}
		while (true) {
			if (money - charge > 0) {
				System.out.println("버스탑승 완");
				money -= charge;
				System.out.println("잔액 : " + money);
			} else {
				System.out.println("잔액이 부족합니다");
				break;
			}
		}
	}

	int add(int[] ar) {// 더하기
		int result = 0;
		for (int data : ar) {
			result += data;
		}
		return result;
	}

	int subraction(int[] ar) {// 빼기
		int max = ar[0] > ar[1] ? ar[0] : ar[1];
		int min = ar[0] > ar[1] ? ar[1] : ar[0];
		return max - min;
	}

	int multiply(int[] ar) {// 곱하기
		return ar[0] * ar[1];
	}

	double divide(int[] ar) {// 나누기
		return (double) ar[0] / ar[1];
	}

	boolean idCheck(String id) {
		String basicid[] = { "asdmc", "dsflakhj", "xzmbc" };
		for (String data : basicid) {
			if (data.equals(id)) {
				System.out.println("아이디가 중복됩니다");
				return false;
			}
		}
		return true;
	}

	boolean nameCheck(String name) {
		String basicName[] = { "cwnm", "oiopwm", "bmeiuwn" };
		for (String data : basicName) {
			if (data.equals(name)) {
				System.out.println("닉네임이 중복됩니다");
				return false;
			}
		}
		return true;
	}

	String pwCheck(String pw, String pwCheck) {
		if(pw.length() != pwCheck.length()) {
			return "false";
		}
	
	
	for(int i = 0;i<pw.length();i++)
	{
		if (pw.charAt(i) != pwCheck.charAt(i)) {
			return "false";
		}
	}
	String encryptionpw = "";
	for(int i = 0;i<pw.length();i++)
	{
		encryptionpw += ((int) pw.charAt(i)) + "";
	}return encryptionpw;
	}
}// 클래스 끝
