package oops.exceptionhandling;

public class MainClass {

	public static void main(String[] args) {
	try {	
	int a=5;
	int b=0;
	int c=a/b;
	System.out.println(c);
	}catch(ArithmeticException e) {
		System.out.println(e.getMessage()+" ,check the error");
	}catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("you are trying to access the element more than size of array");
	}finally {
		System.out.println("run the code");
	}
	
	
	System.out.println("rest all is running");
	
	}

}
