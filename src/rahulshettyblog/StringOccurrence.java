package rahulshettyblog;

import java.util.HashMap;
import java.util.Scanner;

public class StringOccurrence {
	
	public static void strOcc(String input) {
		HashMap<String, Integer> map=new HashMap<>();
		
		String inputArray[]=input.split(" ");
		
		for(String s:inputArray) {
			if(map.containsKey(s)){
				map.put(s, map.get(s)+1);
			}else {
				map.put(s, 1);
			}
		}
		System.out.println(map);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		String input=sc.nextLine();
		
		strOcc(input);
		
		sc.close();

	}

}
