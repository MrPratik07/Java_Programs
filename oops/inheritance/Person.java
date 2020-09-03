package oops.inheritance;

public class Person {
	protected String name;

	public void eat() {
		System.out.println(name+" eating");
	}
	public void walk() {
		System.out.println(name+" walking");
	}
	
	public static void laughing() {
		System.out.println("person is laughing");
	}
}
