package shandling;

import java.util.Scanner;

public class Pallindrome {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter string");
		String a= s.next();
		a=a.toLowerCase();
		StringBuffer b=new StringBuffer(a);
		b.reverse();
		
		String d=b.toString();
		if(a.equals(d)) {
			System.out.println("It is palindrome");
		}
		else {
			System.out.println("It is not palindrome");
		}
}
	}

