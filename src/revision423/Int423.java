package revision423;

import java.util.Scanner;

public class Int423 {
	
	public static void checkPalindrome(int input) {
		int last, temp, rev=0;
		temp=input;
		while(input>0) {
			last=input%10;
			rev=rev*10+last;
			input=input/10;
		}
		if(temp==rev) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not a palindrome");
		}
	}
	
	public static void checkArmstrong(int input) {
		int last,sum=0,temp=input;
		while(input>0) {
			last=input%10;
			sum=sum+last*last*last;
			input=input/10;
		}
		if(temp==sum) {
			System.out.println("Armstrong");
		}else {
			System.out.println("Not an Armstrong");
		}
	}
	
	public static void generateFibonacci(int input) {
		int first=0,second=1,series;
		for(int i=0;i<input;i++) {
			System.out.println(first);
			series=first+second;
			first=second;
			second=series;
		}
	}
	
	public static void checkPrime(int input) {
		boolean result=false;
		if(input<=1) {
			System.out.println("Prime");
//			result=false;
		}
		for(int i=2;i<=input;i++) {
			if(input%i==0) {
				System.out.println("Not a prime");
//				result=true;
				break;
			}else {
				System.out.println("Prime");
//				result=false;
				break;
			}
		}
//		if(result==true) {
//			System.out.println("Prime");
//		}else {
//			System.out.println("Not a prime");
//		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter input");
		int input=sc.nextInt();
		
//		checkPalindrome(input);
//		checkArmstrong(input);
//		generateFibonacci(input);
		checkPrime(input);
		
		sc.close();

	}

}
