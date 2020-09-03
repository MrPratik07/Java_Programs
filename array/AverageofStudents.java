package array;

import java.util.Scanner;

public class AverageofStudents {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int[] marks=new int[n];
	for(int i=0;i<n;i++) {
		marks[i]=sc.nextInt();
	}
	int average=0;
	for(int i=0;i<n;i++) {
		average+=marks[i];
	}
	average=average/n;
	System.out.println(average);

	}

}
