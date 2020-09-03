package conditonal;
import java.util.Scanner;

public class IfClass {

	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	int age=sc.nextInt();
		if(age>18) {
			System.out.print("you can vote now");
		}
		else if(age <5) {
			System.out.print("You are Child now");
		}
		else {
			System.out.print("you have to wait");
		}

	}

}
