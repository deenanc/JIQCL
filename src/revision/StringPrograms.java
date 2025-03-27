package revision;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class StringPrograms {
	
	public static String strWord(String input) {
		String rev="";		
		for(int i=input.length()-1;i>=0;i--) {
			rev=rev+input.charAt(i);
		}		
//		System.out.println(rev);
		return rev;
	}
	
	public static void palindromeOrNot(String input) {
		if (strWord(input).equals(input)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not palindrome");
		}
	}
	
	public static void charOccurrence(String input) {
		HashMap<Character,Integer> map1=new HashMap<>();
		char inputArray[]=input.toCharArray();
		for(char c:inputArray) {
			if(map1.containsKey(c)) {
				map1.put(c, map1.get(c)+1);
			}else {
				map1.put(c, 1);
			}
		}
		System.out.println(map1);
	}
	
	public static void wordOccurrence(String input) {
		HashMap<String,Integer> map2=new HashMap<>();
		String inputArray[]=input.split(" ");
		for(String s:inputArray) {
			if(map2.containsKey(s)) {
				map2.put(s, map2.get(s)+1);
			}else {
				map2.put(s, 1);
			}
		}
		System.out.println(map2);
	}
	
	public static void reverseEachWord(String sentence) {
		StringBuffer sb=new StringBuffer();
		String words[]=sentence.split(" ");
		for(String word:words) {
			String revWord="";
			for(int i=word.length()-1;i>=0;i--) {
				revWord=revWord+word.charAt(i);
			}
			sb.append(revWord).append(" ");
		}
		String revSentence=sb.toString();
		System.out.println(revSentence);
	}
	
	public static void noOfChar(String input) {
		int count=0;
		char inputArray[]=input.toCharArray();
		for(int i=0;i<inputArray.length;i++) {
			count++;
		}
		System.out.println(count);
	}
	
	public static void removeDuplicateChar(String input) {
		LinkedHashSet<Character> set1=new LinkedHashSet<Character>();
		char inputArray[]=input.toCharArray();
		for(char c:inputArray) {
			set1.add(c);
		}
		StringBuffer sb=new StringBuffer();
		for(char c:set1) {
			sb.append(c);
		}
		String inputWithoutDuplicate=sb.toString();
		System.out.println(inputWithoutDuplicate);
	}
	
	public static void removeDuplicateWords(String input) {
		LinkedHashSet<String> set2=new LinkedHashSet<String>();
		String inputArray[]=input.split(" ");
		for(String s:inputArray) {
			set2.add(s);
		}
		StringBuffer sb=new StringBuffer();
		for(String s:set2) {
			sb.append(s).append(" ");
		}
		String output=sb.toString();
		System.out.println(output);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter input");
		String input=sc.nextLine();
		
//		System.out.println(strWord(input));
//		palindromeOrNot(input);
//		charOccurrence(input);
//		wordOccurrence(input);
//		reverseEachWord(input);
//		noOfChar(input);
//		removeDuplicateChar(input);
		removeDuplicateWords(input);
		
		sc.close();

	}

}
