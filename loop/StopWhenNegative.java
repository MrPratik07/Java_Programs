package loop;
import java.util.Scanner;

public class StopWhenNegative {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int sum=0;
	for (; ;) {
		int n=sc.nextInt();
		if(n<0) {
			break;
		}
		sum+=n;
		
		
	}
	System.out.print(sum);

	}

}
