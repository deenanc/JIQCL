package misc;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapExample {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Scanner sc=new Scanner(System.in);
		
		HashMap<String, Integer> hm=new HashMap<>();
		
		hm.put("TCS", 12);
		hm.put("Infy", 11);
		hm.put("TechM", 10);
		hm.put("Wipro", 11);
		hm.put("Acc", 11);
		hm.put("hcl", 9);
		
		int d=hm.get("TCS");
		
		System.out.println(d);
		

	}

}
