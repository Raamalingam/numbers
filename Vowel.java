import java.io.*;
import java.util.*;

class Vowel {
	public static void main (String[] args) {
		Scanner s=new Scanner(System.in);
		String s1=s.nextLine();
		char a[]=s1.toCharArray();
		char abc[]={'a','e','i','o','u'};
    if(a[0]==abc[0]||a[0]==abc[1]||a[0]==abc[2]||a[0]==abc[3]||a[0]==abc[4])
		   {
		       System.out.println("vowel");
		   }
		   else
		   {
		       System.out.println("consonent");
		   }
	
	}
}
