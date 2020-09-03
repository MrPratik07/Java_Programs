package oops;

public class PassByvalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int c=34;
		int d=23;
		
		swap(c,d);

	}
	
	
	static void swap(int a,int b) {
		int temp=a;
		a=b;
		b=temp;
		System.out.println(a+" "+b);
		
	}

}
