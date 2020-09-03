package oops.inheritance;

public class Singer extends Person {

	void sing() {
		System.out.println(name+" is singing");
	}
	
	public void eat() {
		System.out.println("Singer "+name+" is eating");
	}
	public static void laughing() {
		System.out.println("singer is laughing");
	}

}
