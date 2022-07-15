package shandling;

import java.util.Scanner;

public class String2 {//my name is ashmit..ashmit is name my

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter String");
		String k=s.nextLine();
		String[] s1=k.split(" ");
		int L=s1.length;
		
		for( int i=L-1;i>=0;i--) {
			System.out.print(s1[i]+" ");
			
		} 
	}

}
