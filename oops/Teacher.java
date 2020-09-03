package oops;

public class Teacher {
	
	public Teacher(){
		System.out.println("i am a teacher");
		
		
	}
	public static void main(String args[]) {
	
		Teacher t=new Teacher();
		Student s=new Student("Pratik");
		System.out.println(s.getpassword());
	}
	
}
