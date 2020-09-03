package whileloop;

import java.util.Scanner;

public class Loop1 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int temp=n,sum=0;
	while(temp>0) {
		int lastdigit=temp%10;
		temp/=10;
		sum+=lastdigit;
	}
	System.out.print("The Sum is "+sum);
	
	}

}
