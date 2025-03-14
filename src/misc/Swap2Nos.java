package misc;

import java.util.Scanner;

public class Swap2Nos {
	
	public static void swapMethod1(int input1,int input2) {
		int sum;
		sum=input1+input2;
		input1=sum-input1;
		input2=sum-input2;
		
		System.out.println("First number after swapping: "+input1);
		System.out.println("Second number after swapping: "+input2);
	}
	
	public static void swapMethod2(int input1,int input2) {
		int temp;
		temp=input1;
		input1=input2;
		input2=temp;
		
		System.out.println("First number after swapping: "+input1);
		System.out.println("Second number after swapping: "+input2);
	}
	
	public static void swapMethod3(int input1,int input2) {
		input1=input1+input2;   ////4+6
		
		input2=input1-input2;  ////10-6
		input1=input1-input2;
		
		System.out.println("First number after swapping: "+input1);
		System.out.println("Second number after swapping: "+input2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number:");
		int input1=sc.nextInt();
		System.out.println("Enter second number:");
		int input2=sc.nextInt();
		
//		swapMethod1(input1, input2);
		
//		swapMethod2(input1, input2);
		
		swapMethod3(input1, input2);
		
		sc.close();

	}

}
