package shandling;

import java.util.Arrays;
import java.util.Scanner;

public class String6 {//1011011010101 to 1111111100000

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter String");
		String k=s.nextLine();
		char ch[]=k.toCharArray();
		Arrays.sort(ch);
		String sorted=new String(ch);
		StringBuffer l=new StringBuffer(sorted);
		l.reverse();
	    String r=l.toString();
		System.out.println(r);

	}

}
