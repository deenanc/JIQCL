package array;

import java.util.Scanner;

public class ArraySum {
	
	public static void arraySum(int input[]) {
		int sum=0;
		for(int i=0;i<input.length;i++) {
			sum=sum+input[i];
		}
		System.out.println("The array sum "+sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size");
		int size=sc.nextInt();
		int input[]=new int[size];
		System.out.println("Enter elements");
		for(int i=0;i<size;i++) {
			input[i]=sc.nextInt();
		}
		
		arraySum(input);
		
		sc.close();
	}

}
