package rahulshettyblog;

import java.util.Scanner;

public class SwapNumbers {
	
	public static void swap2nos(int input1,int input2) {
		input1=input1+input2;
		input2=input1-input2;
		input1=input1-input2;
		
		System.out.println("First number after swappig  is "+input1);
		System.out.println("Second number after swapping is "+input2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first input");
		int input1=sc.nextInt();
		System.out.println("Enter second input");
		int input2=sc.nextInt();
		
		swap2nos(input1, input2);
		
		sc.close();

	}

}
