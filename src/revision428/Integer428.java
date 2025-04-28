package revision428;

import java.util.Scanner;

public class Integer428 {
	
	public static void checkPalindrome(int input) {
		int temp,last,rev=0;
		temp=input;
		while(input>0) {
			last=input%10;
			rev=rev*10+last;
			input=input/10;
		}
		if(temp==rev) {
			System.out.println("Palindrome");
		}
		else {
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
		if(sum==temp) {
			System.out.println("Armstrong");
		}else {
			System.out.println("Not Armstrong");
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
		if(input<=1) {
			System.out.println("Prime");
		}
		for(int i=2;i<=input;i++) {
			if(input%i==0) {
				System.out.println("Not Prime");
				break;
			}else {
				System.out.println("Prime");
				break;
			}
		}
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
