package oops;

public class StaticKeyword {
	static {
		System.out.println("helloooo2");
	}
	
	static {
		System.out.println("helloooo3");
	}
	
	public static void main(String[] args) {
	
		System.out.println( "hellooo1");
		StaticKeyword s=new StaticKeyword();
	}

}
