package shandling;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class String7 {
	
	public static void countword(String sr) {
	 Map<String,Integer> obj=new HashMap<String,Integer>();
	String ch[]=sr.split(" ");
	 for (String c:ch) {
		 if(!String.valueOf(c).isEmpty()){ 
		 if(obj.containsKey(c))
		 {obj.put(c,obj.get(c)+1);}
		 else {
			 obj.put(c, 1);
		 }
	     }}
	  System.out.println(sr+ ":"+obj);
	 
	     }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner s=new Scanner(System.in);
       System.out.println("Enter string");
       String k=s.nextLine();
       countword(k);
}

}
