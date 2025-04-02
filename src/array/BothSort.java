package array;

import java.util.Scanner;

public class BothSort {
	
	public static void ascendingSort(int inputArray[]) {
		int temp=0;
//		int size=inputArray.length;
		
		for(int i=0;i<inputArray.length;i++) {
			for(int j=i+1;j<inputArray.length;j++) {
				if(inputArray[i]>inputArray[j]) {
					temp=inputArray[i];
					inputArray[i]=inputArray[j];
					inputArray[j]=temp;
				}
			}
		}
		
		System.out.println("Ascending order ");
		for(int i=0;i<inputArray.length;i++) {
			System.out.println(inputArray[i]);
		}
	}
	
	public static void descendingOrder(int inputArray[]) {
		int temp=0;
		
		for(int i=0;i<inputArray.length;i++) {
			for(int j=i+1;j<inputArray.length;j++) {
				if(inputArray[i]<inputArray[j]) {
					temp=inputArray[i];
					inputArray[i]=inputArray[j];
					inputArray[j]=temp;
				}
			}
		}
		
		System.out.println("Descending order ");
		for(int i=0;i<inputArray.length;i++) {
			System.out.println(inputArray[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements in an array");
		int size=sc.nextInt();
		
		int inputArray[]=new int[size];
		
		for(int i=0;i<size;i++) {
			inputArray[i]=sc.nextInt();
		}
		
		ascendingSort(inputArray);
		
		descendingOrder(inputArray);
		
		sc.close();

	}

}
