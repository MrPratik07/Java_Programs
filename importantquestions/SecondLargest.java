package importantquestions;
import java.util.Scanner;
public class SecondLargest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt();
		while(t-->0){
		    int n=sc.nextInt();
		    int[] a=new int[n];
		    int max=0,smax=0;
		    for(int j=0;j<n;j++){
		        a[j]=sc.nextInt();
		        if(a[j]>max){
		           smax=max;
		           max=a[j];
		            
		        }
		        if(a[j]!=max&&a[j]>smax){
			            smax=a[j];
		        }
		        
		    }
		    System.out.print(smax);
		}


	}

}
