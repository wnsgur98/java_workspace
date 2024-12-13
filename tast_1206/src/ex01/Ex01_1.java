package ex01;



public class Ex01_1 {

	 //필드
	   String name;
	   int javaScore;
	   int dbmsScore;
	   int totalScore; //java + dbms
	   String grade; //학점(java+dbams)/2
	   
	   //생성자
	   public Ex01_1(String name, int javaScore, int dbmsScore) {
	      super();
	      this.name = name;
	      this.javaScore = javaScore;
	      this.dbmsScore = dbmsScore;
	      this.totalScore = javaScore + dbmsScore;
	      this.grade = calculateGrade((javaScore + dbmsScore)/2);
	   }
	   
	   //메소드
	   //calculateGrade(int ) : 두과목의 평균점수(int) 학점 반환하는 메소드(매개변수1개 정수형)
	   String calculateGrade(int avgScore) {
	      if(avgScore >= 90) {
	         return "A";
	      }else if(avgScore >= 80) {
	         return "B";
	      }else if(avgScore >= 70) {
	         return "C";
	      }else {
	         return "F";
	      }
	   }
	   
	   //isPass(int)   : 두과목의 평균 점수(int)가 70점이상이면 true, 아니면 false반환하는 메소드
	   boolean isPass(int avgScore) {
	      return avgScore >= 70;
	   }

	}
	

