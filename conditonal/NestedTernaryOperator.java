package conditonal;

public class NestedTernaryOperator {

	public static void main(String[] args) {
		int a=5,b=2,c=10;
		int result=0;
		result=a>b ? a>c ? a:c :  b>c ? b:c;
		
		System.out.print(result);
		

	}

}
