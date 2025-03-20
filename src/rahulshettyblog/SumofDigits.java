package rahulshettyblog;

import java.util.Scanner;

public class SumofDigits {
	
	public static int digitsSum(int input) {
		int sum=0, last;
		
		while(input>0) {
			last=input%10;
			sum=sum+last;
			input=input/10;
		}
		
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter input");
		int input=sc.nextInt();
		
		System.out.println(digitsSum(input));
		
		sc.close();

	}

}
