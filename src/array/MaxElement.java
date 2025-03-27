package array;

import java.util.Scanner;

public class MaxElement {
	
	public static void findMax(int input[]) {
		int max=0;
		for(int i=0;i<input.length;i++) {
			if(input[i]>max) {
				max=input[i];
			}
		}
		System.out.println("The maximum element in the array "+max);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of the array");
		int size=sc.nextInt();
		int input[]=new int[size];
		System.out.println("Enter elements");
		for(int i=0;i<size;i++) {
			input[i]=sc.nextInt();
		}
		
		findMax(input);
		
		sc.close();

	}

}
