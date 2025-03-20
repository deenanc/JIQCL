package rahulshettyblog;

import java.util.HashMap;
import java.util.Scanner;

public class CharOccurrence {
	
	public static void charOcc(String input) {
		char inputArray[]=input.toCharArray();
		
		HashMap<Character, Integer> map=new HashMap<>();
		
		for(Character c:inputArray) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}else {
				map.put(c, 1);
			}
		}
		
		System.out.println(map);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Input");
		
		String input=sc.next();
		
		charOcc(input);
		
		sc.close();

	}

}
