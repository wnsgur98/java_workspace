package accessModifier;

public class PersonMain {
public static void main(String[] args) {
	   Person p1 = new Person();
	      p1.setName("짱구");
//	      p1.name = "짱구";
	      System.out.println(p1.getName());
	      p1.printInfo();
	      
	   }
}
