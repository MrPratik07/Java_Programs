package operators;
import java.util.Scanner;

public class LogicalOperator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		if(a>1 && a<100) {
			System.out.print("lies between 1 and 100");
		}
		else {
			System.out.print("greater than 100");
		}
		

	}

}
