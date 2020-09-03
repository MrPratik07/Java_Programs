package sorting;

public class SelectionSort {

	public static void main(String[] args) {
		int myarray[]= {1,3,2,4,6,5,8,7,9,10};
		int n=myarray.length;
		for(int i=0;i<n-1;i++) {
			int minindex=i;
			for(int j=i;j<n;j++) {
				if(myarray[j]<myarray[minindex]) {
					minindex=j;
				}
			}
			int temp=myarray[i];
			myarray[i]=myarray[minindex];
			myarray[minindex]=temp;
		}
		for(int i:myarray) {
			System.out.println(i+" ");
		}

	}

}
