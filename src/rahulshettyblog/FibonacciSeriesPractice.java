package rahulshettyblog;

import java.util.Scanner;

public class FibonacciSeriesPractice {
	
	public static void generateFibonacci(int input) {
		int first=0,second=1,series;
		
		for(int i=1;i<=input;i++) {
			System.out.println(first+"");
			series=first+second;
			first=second;
			second=series;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter input");
		int input=sc.nextInt();
		
		generateFibonacci(input);
		
		sc.close();

	}

}
