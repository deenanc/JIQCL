package rahulshettyblog;

import java.util.Scanner;

public class Swap2String {
	
	public static void swapMethod(String input1, String input2) {
		
		input1=input1+input2;
		
		input2=input1.substring(0, input1.length()-input2.length());
		input1=input1.substring(input2.length());
		
		System.out.println("Second string now is "+input2);
		System.out.println("First string now is "+input1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first string: ");
		String input1=sc.next();
		
		System.out.println("Enter second string: ");
		String input2=sc.next();
		
		swapMethod(input1, input2);
		
		sc.close();

	}

}
