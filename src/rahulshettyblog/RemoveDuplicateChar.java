package rahulshettyblog;


import java.util.LinkedHashSet;
import java.util.Scanner;

public class RemoveDuplicateChar {
	
	public static void removeDuplicate(String input) {
		
		LinkedHashSet<Character> set=new LinkedHashSet<>();
		
		char inputArray[]=input.toCharArray();
		
		for(char c:inputArray) {
			set.add(c);
		}
		
		StringBuffer sb=new StringBuffer();
		
		for(char d:set) {
			sb.append(d);
		}
		
		String result=sb.toString();
		
		System.out.println(result);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter input");
		
		String input=sc.next();
		
		removeDuplicate(input);
		
		sc.close();

	}

}
