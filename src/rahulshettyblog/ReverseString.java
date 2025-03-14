package rahulshettyblog;

import java.util.Scanner;

public class ReverseString {
	
	public static String revStr(String input) {
		String rev="";
		for(int i=input.length()-1;i>=0;i--) {
			rev=rev+input.charAt(i);
		}
		return rev;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter input: ");
		String input=sc.nextLine();
		System.out.println("Reversed string is: ");
		System.out.println(revStr(input));
		sc.close();

	}

}
