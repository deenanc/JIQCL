package rahulshettyblog;

import java.util.Scanner;

public class NoofChar {
	
	public static int countChar(String input) {
		int count=0;
		
		char inputArray[]=input.toCharArray();
		
		for(char x:inputArray) {
			count=count+1;
		}
		
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter input");
		
		String input=sc.next();
		
		System.out.println(countChar(input));
		
		sc.close();

	}

}
