package oops;


class Cat{
	String color="black",breed="indian";
	int legs=4;
	public void walk() {
		System.out.println("the cat is walking");
	}
	public void describe(){
		System.out.println(legs);
		System.out.println(color+" "+breed);
	}
	
}

class Dog{
	String name;
	public void jumped() {
		System.out.println(name+" jumped");
	}
	
}

public class MainClass {

	public static void main(String[] args) {
	Cat kitty=new Cat();
	Cat kitty1=new Cat();
	Dog jacky=new Dog();
	kitty.legs=3;
	kitty1.legs=4;
	kitty.walk();
	kitty.describe();
	kitty1.describe();
	jacky.name="Jacky";
	jacky.jumped();
	}

}
