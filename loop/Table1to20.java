package loop;

public class Table1to20 {

	public static void main(String[] args) {
		for (int i =1;i<=20;i++) {
			int table=i;
			for(int j=1;j<=10;j++) {
				System.out.print(table*j+" ");
			}
			System.out.println();
		}

	}

}
