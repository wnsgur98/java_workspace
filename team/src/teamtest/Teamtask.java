package teamtest;

import java.util.Scanner;

public class Teamtask {
   public static void main(String[] args) {
      System.out.println("========task01 사칙연산=======");
      Scanner sc = new Scanner(System.in);
      Teamtask tt = new Teamtask();
      
      final int SIZE = 2;
      int[] arr = new int[SIZE];
      
      // 입력받기
      for (int i = 0; i < SIZE; i++) {
         System.out.print((i + 1) + "번째 숫자를 입력해주세요(정수형태) : ");
         arr[i] = sc.nextInt();
         sc.nextLine(); // void buffer
      }
      
      // 더하기
      System.out.println("더하기 : " + tt.add(arr));
      // 빼기
      System.out.println("빼기 : " + tt.subraction(arr));
      // 곱하기
      System.out.println("곱하기 : " + tt.multiply(arr));
      // 나누기
      if (arr[1] == 0) {
         System.out.println("0으로 나눌 수 없습니다");
      } else {
         System.out.println("나누기 : " + tt.divide(arr));
      }
   }
   // add method
   int add(int[] arr) {
      int result = 0;
      for (int data : arr) {
         result += data;
      }
      return result;
   }

   // subraction method
   int subraction(int[] arr) {
      int max = arr[0] > arr[1] ? arr[0] : arr[1];
      int min = arr[0] > arr[1] ? arr[1] : arr[0];
      return max - min;
   }

   // multiply method
   int multiply(int[] arr) {
      return arr[0] * arr[1];
   }

   // divide method
   double divide(int[] arr) {
      return (double) arr[0] / arr[1];
   }
}












