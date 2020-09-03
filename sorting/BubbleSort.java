package sorting;

public class BubbleSort {

	public static void main(String[] args) {
		int array[]= {1,6,7,8,4,5,9,10,2,3};
		int n=array.length;
		for(int i=0;i<n-1;i++) {
			boolean sorted=true;
			for(int j=0;j<n-1-i;j++) {
				if (array[j+1]<array[j]) {
					int temp=array[j+1];
					array[j+1]=array[j];
					array[j]=temp;
					
					sorted=false;
				}
			
		}
			if(sorted) break;
		}
		for(int i=0;i<n;i++) {
			System.out.print(array[i]+" ");
		}

	}

}
