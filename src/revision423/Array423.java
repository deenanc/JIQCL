package revision423;

import java.util.Scanner;

public class Array423 {
	
	public static void arraySum(int input[]) {
		int sum=0;
		for(int i=0;i<input.length;i++) {
			sum=sum+input[i];
		}
		System.out.println("The sum is "+sum);
	}
	
	public static void findMax(int input[]) {
		int max=0;
		for(int i=0;i<input.length;i++) {
			if(input[i]>max) {
				max=input[i];
			}
		}
		System.out.println("The max is "+max);
	}
	
	public static void findMin(int input[]) {
		int min=input[0];
		for(int i=0;i<input.length;i++) {
			if(min>input[i]) {
				min=input[i];
			}
		}
		System.out.println("The min is "+min);
	}
	
	public static void ascendingOrder(int input[]) {
		int temp;
		for(int i=0;i<input.length;i++) {
			for(int j=i+1;j<input.length;j++) {
				if(input[i]>input[j]) {
					temp=input[i];
					input[i]=input[j];
					input[j]=temp;
				}
			}
		}
		System.out.println("Ascending order");
		for(int i=0;i<input.length;i++) {
			System.out.println(input[i]);
		}
	}
	
	public static void descendingOrder(int input[]) {
		int temp;
		for(int i=0;i<input.length;i++) {
			for(int j=i+1;j<input.length;j++) {
				if(input[i]<input[j]) {
					temp=input[i];
					input[i]=input[j];
					input[j]=temp;
				}
			}
		}
		System.out.println("Descending order");
		for(int i=0;i<input.length;i++) {
			System.out.println(input[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size=sc.nextInt();
		int input[]=new int[size];
		System.out.println("Enter elements");
		for(int i=0;i<size;i++) {
			input[i]=sc.nextInt();
		}
		
		arraySum(input);
		findMax(input);
		findMin(input);
		ascendingOrder(input);
		descendingOrder(input);
		
		sc.close();

	}

}
