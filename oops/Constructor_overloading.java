package oops;

public class Constructor_overloading {
	Constructor_overloading(){
		System.out.println("Hello");
	}
	
	Constructor_overloading(int a,int b){
		System.out.println(a+b);
	}
	
	Constructor_overloading(int n){
		System.out.println(n+" hello");
	}

	public static void main(String[] args) {
	Constructor_overloading c=new Constructor_overloading(4,5);
	Constructor_overloading c1=new Constructor_overloading(5);
	Constructor_overloading c3=new Constructor_overloading();
	

	}

}
