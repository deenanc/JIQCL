package revision428;

import java.util.Scanner;

public class Array428 {
	
	public static void arraySum(int input[]) {
		int sum=0;
		for(int i=0;i<input.length;i++) {
			sum=sum+input[i];
		}
		System.out.println("The array sum is "+sum);
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
		System.out.println("Ascending Order");
		for(int i=0;i<input.length;i++) {
			System.out.println(input[i]);
		}
	}
	
	public static void decsendingrder(int input[]) {
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of the array");
		int size=sc.nextInt();
		int input[]=new int[size];
		System.out.println("Enter the elements");
		for(int i=0;i<size;i++) {
			input[i]=sc.nextInt();
		}
		
		arraySum(input);
		findMax(input);
		findMin(input);
		ascendingOrder(input);
		decsendingrder(input);
		
		sc.close();

	}

}
