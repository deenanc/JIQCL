package rahulshettyblog;

import java.util.Scanner;

public class CheckArmstrong {
	
	public static boolean checkArmstrong(int input) {
		int sum=0, last, temp;
		
		temp=input;
		
		while(input>0) {
			last=input%10;
			sum=sum+last*last*last;
			input=input/10;
		}
		
		if(sum==temp) {
			return true;
		}
		else {
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the input");
		int input=sc.nextInt();
		
		if(checkArmstrong(input)==true) {
			System.out.println("Armstromg");
		}
		else {
			System.out.println("Not Armstrong");
		}
		
		sc.close();

	}

}
