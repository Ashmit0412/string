package shandling;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class String5 {//counting number of each characters in a String
      
	public static void getcharcount(String name) {
		
		Map<Character,Integer> obj=new HashMap<Character,Integer>();
		char strArray[] =name.toCharArray();		
		for (char c:strArray) {			
			if (obj.containsKey(c)) {
				obj.put(c, obj.get(c)+1);
			}
			else {
				obj.put(c,1);
			}}
		System.out.println(name + " : "+ obj);
						}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter string");
		String k=s.nextLine();
		getcharcount(k);
	}
}
	
		
		
	

