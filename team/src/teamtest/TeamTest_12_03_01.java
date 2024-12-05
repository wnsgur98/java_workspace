package teamtest;

import java.util.Scanner;

public class TeamTest_12_03_01 {
	public static void main(String[] args) {
//		충전한 교통금액을 입력하고 한달간 택시, 버스, 지하철 이용횟수를 입력하여 잔액표시하기
//		잔액을 초과한 경우 다음달 청구금액으로 표시
//		택시 5000원
//		버스 1500원
//		지하철 1200원
//		각 요금은 변하지 않는다

		
 Scanner sc = new Scanner(System.in);
System.out.println("충전한 금액을 입력하세요");
int charge = sc.nextInt();
System.out.println("한달간 택시, 버스, 지하철 이용횟수를 각각 입력하세요");
int taxiCharge = 5000, busCharge = 1500, subwayCharge = 1200;
int taxi =0, bus=0, subway = 0;
taxi = sc.nextInt();
bus = sc.nextInt();
subway = sc.nextInt();
int total = (taxiCharge*taxi) + (busCharge*bus) + (subwayCharge*subway); 
if(total > charge) {
   int overcharge = (total - charge);
   System.out.println("충전금액을 초과했습니다. 다음달 청구 금액은" + overcharge+ "원 입니다.") ;
}else { 
   System.out.println("택시 : " + taxi + "번, 버스 : "+ bus +"번, 지하철 : " + subway + "번");
	System.out.println("이번 달 교통대금은 " + total + "원 입니다. 잔액은" + (charge - total)+"입니다");
  
}
}
}

