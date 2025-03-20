package rahulshettyblog;

import java.util.Scanner;

public class CheckPrime {
	
	public static boolean primeCheck(int input) {
		boolean result=false;
		
		if(input<=2) {
			result=false;
		}
		
		for(int i=2;i<input;i++) {
			if(input%i==0) {
				result=true;
				break;
			}
			else {
				result=false;
			}
		}
		
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter input");
		int input=sc.nextInt();
		if(primeCheck(input)==true) {
			System.out.println("The number is not prime");
		}else {
			System.out.println("The number is prime");
		}
		
		sc.close();

	}

}
