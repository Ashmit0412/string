package shandling;

import java.util.Scanner;

public class String1 {//my name is ashmit .....timhsa si eman ym

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter String");
		String k=s.nextLine();
		StringBuffer s1=new StringBuffer(k);
		s1.reverse();
		String d=s1.toString();
		System.out.println(d);
	}

}
