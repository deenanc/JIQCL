package revision415;

import java.util.Scanner;

public class Array415 {
	
	public static void arraySun(int input[]) {
		int sum=0;
		for(int i=0;i<input.length;i++) {
			sum=sum+input[i];
		}
		System.out.println("The sum is "+sum);
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
		System.out.println("Ascending Order");
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
		System.out.println("Descending Order");
		for(int i=0;i<input.length;i++) {
			System.out.println(input[i]);
		}
	}
	
	public static void findMax(int input[]) {
		int max=0;
		for(int i=0;i<input.length;i++) {
			if(input[i]>max) {
				max=input[i];
			}
		}
		System.out.println("The maximum elemment "+max);
	}
	
	public static void findMin(int input[]) {
		int min=input[0];
		for(int i=0;i<input.length;i++) {
			if(input[i]<min) {
				min=input[i];
			}
		}
		System.out.println("The minimum element "+min);
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
		
		arraySun(input);
		ascendingOrder(input);
		descendingOrder(input);
		findMax(input);
		findMin(input);

		sc.close();
	}

}
