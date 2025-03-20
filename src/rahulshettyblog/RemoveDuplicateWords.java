package rahulshettyblog;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class RemoveDuplicateWords {
	
	public static void removeDuplicate(String input) {
		
		LinkedHashSet<String> set1=new LinkedHashSet<>();
		
		String inputArray[]=input.split(" ");
		
		for(String s:inputArray) {
			set1.add(s);
		}
		
		StringBuffer sb=new StringBuffer();
		
		for(String r:set1) {
			sb.append(r).append(" ");
		}
		
		String result=sb.toString();
		
		System.out.println(result);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter input");
		String input=sc.nextLine();
		
		removeDuplicate(input);
		
		sc.close();

	}

}
