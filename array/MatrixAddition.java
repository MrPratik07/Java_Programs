package array;

import java.util.Scanner;

public class MatrixAddition {

	public static void main(String[] args) {
	//input
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the rows and colums:");
	int rows=sc.nextInt();
	int cols=sc.nextInt();
	
	//declare 2D array
	int a[][]=new int[rows][cols];
	int b[][]=new int[rows][cols];
	//input matrix a
	System.out.println("Enter the values of Matrix a:");
	for(int i=0;i<rows;i++) {
		for(int j=0;j<cols;j++) {
			a[i][j]=sc.nextInt();
		}
	}
	
	//input matrix b
	System.out.println("Enter the values of Matrix b:");
	for(int i=0;i<rows;i++) {
		for(int j=0;j<cols;j++) {
			b[i][j]=sc.nextInt();
		}
	}
	
	//add matrix a & b
	int c[][]=new int[rows][cols];
	for(int i=0;i<rows;i++) {
		for(int j=0;j<cols;j++) {
			c[i][j]=a[i][j]+b[i][j];
		}
	}
	
	//Print matrix c
	System.out.println("The Addition of Matix:");
	for(int i=0;i<rows;i++) {
		for(int j=0;j<cols;j++) {
			System.out.print(c[i][j]+" ");
		}
		System.out.println();
	
	}
	
	
	
	

}

}
