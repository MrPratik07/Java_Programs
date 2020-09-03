package oops.inheritance;

public class MainClass {

	public static void main(String[] args) {
		Teacher t1=new Teacher();
		
//		t1.name="mr Bunny";
//		t1.eat();
//		t1.walk();
//		t1.teach();
//		
//		Singer s1=new Singer();
//		s1.name="mr funny";
//		s1.eat();
//		s1.walk();
//		s1.sing();
		Person p=t1;
		
		Teacher t2= (Teacher) p;

	}

}
