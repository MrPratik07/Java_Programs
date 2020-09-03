package whileloop;

import java.util.Scanner;

public class Loop2 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n =sc.nextInt();
	int reverse=0,temp=n;
	while(temp>0) {
		int lastdigit=temp%10;
		temp=temp/10;
		reverse=reverse*10+lastdigit;
	}
	if(reverse==n) {
		System.out.println("it is pallindrome");
	}
	else {
		System.out.println("not a pallindrome");
	}

	}

}
