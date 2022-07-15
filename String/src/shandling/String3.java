package shandling;

import java.util.Scanner;

public class String3 {//my name is ashmit .....ym eman si timhsa   

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter String");
		String k=s.nextLine();
		StringBuffer s1=new StringBuffer(k);
		s1.reverse();
		String d=s1.toString();
		String []s2=d.split(" ");
		int L=s2.length;
		for(int i=L-1;i>=0;i--) {
			System.out.print(s2[i]+" ");
		}
		}

}
