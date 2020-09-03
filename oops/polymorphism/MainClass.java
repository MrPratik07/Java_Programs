package oops.polymorphism;

public class MainClass {

	public static void main(String[] args) {

// RUN TIME POLYMORPHISM OR DYNAMIC BINDING OR LATE BINDING	(method overriding)	
		
//	Dog d=new Dog();
//	Pet p=d;
//	Animal a=d;
//	
//	p.walk();
//	d.walk();
//	System.out.println(p.name);
//	System.out.println(d.name);

		// COMPILE TIME POLYMORPHISM OR STATIC BINDING OR EARLY BINDING (method overloading)		
//	greetings("hello");	
//	greetings();
//	greetings("hiii",5);
		

	}
	
	
	// COMPILE TIME POLYMORPHISM OR STATIC BINDING OR EARLY BINDING (method overloading)
	public static void greetings() {
		System.out.println("hi there");
	}
	public static void greetings(String s) {
		System.out.println(s);
	}
	public static void greetings(String s,int count) {
		for(int i=0;i<count;i++) {
		System.out.print(s+" ");
		}
	}

}
