package revision428;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class String429 {
	
	public static void reverseWord(String input) {
		String rev="";
		for(int i=input.length()-1;i>=0;i--) {
			rev=rev+input.charAt(i);
		}
		System.out.println("The reversed word is "+rev);
	}
	
	public static void reverseEachWord(String input) {
		String revSentence="";
		String words[]=input.split(" ");
		for(String word:words) {
			String revWord="";
			for(int i=word.length()-1;i>=0;i--) {
				revWord=revWord+word.charAt(i);
			}
			revSentence=revSentence+revWord+" ";
		}
		System.out.println("The reversed word in a sentence :"+revSentence);
	}
	
	public static void charPccurrence(String input) {
		HashMap<Character,Integer> map1=new HashMap<>();
		char inputChar[]=input.toCharArray();
		for(char c:inputChar) {
			if(map1.containsKey(c)) {
				map1.put(c, map1.get(c)+1);
			}else {
				map1.put(c, 1);
			}
		}
		System.out.println(map1);
	}
	
	public static void stringOccurrence(String input) {
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
	
	public static void removeDuplicateChar(String input) {
		LinkedHashSet<Character> set1=new LinkedHashSet<>();
		char inputArray[]=input.toCharArray();
		for(char c:inputArray) {
			set1.add(c);
		}
		StringBuffer sb=new StringBuffer();
		for(char c:set1) {
			sb.append(c);
		}
		String output=sb.toString();
		System.out.println(output);
	}
	
	public static void removeDuplicateWord(String input) {
		LinkedHashSet<String> set2=new LinkedHashSet<>();
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
		
//		reverseWord(input);
//		reverseEachWord(input);
//		charPccurrence(input);
//		stringOccurrence(input);
//		removeDuplicateChar(input);
		removeDuplicateWord(input);
		
		sc.close();

	}

}
