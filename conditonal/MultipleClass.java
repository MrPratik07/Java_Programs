package conditonal;
import java.util.Scanner;

public class MultipleClass {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int review=sc.nextInt();
		switch(review) {
		case 1:
		case 2:
			System.out.print("The review is bad");
			break;
		case 3:
			System.out.println("The review is average");
			break;
		case 4:
		case 5:	
			System.out.println("The review is good");
			break;
		default:
			System.out.println("entered wrong");
			break;
		}

	}

}
