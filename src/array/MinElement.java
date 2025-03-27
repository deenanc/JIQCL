package array;

import java.util.Scanner;

public class MinElement {
	
	public static void findMin(int input[]) {
		int min=input[0];
		for(int i=0;i<input.length;i++) {
			if(min>input[i]) {
				min=input[i];
			}
		}
		System.out.println("The minimum element is "+min);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of the array");
		int size=sc.nextInt();
		int input[]=new int[size];
		for(int i=0;i<size;i++) {
			input[i]=sc.nextInt();
		}
		
		findMin(input);
		
		sc.close();

	}

}
