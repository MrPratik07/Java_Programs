package sorting;
import java.util.Arrays;

public class InsertionSort {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int arr[]= {1,3,2,4,6,5,8,7,9,10};
//		int n=arr.length;
//		insert(arr,n);
//	
	public static void main(String args[]) {
	    int[] data = { 9, 5, 1, 4, 3 };
	    InsertionSort is = new InsertionSort();
	    is.insert(data,data.length);
	    System.out.println("Sorted Array in Ascending Order: ");
	    System.out.println(Arrays.toString(data));
	  }	
	
	
	
	static int[] insert(int arr[],int n) {
		
		for(int i=1;i<n;i++) 
		{
			int key=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>key) 
			{
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
		}
		
		return arr;
		

	}

}
