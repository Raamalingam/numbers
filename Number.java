import java.io.*;
import java.util.*;

class Number {
	public static void main (String[] args) {
		Scanner s=new Scanner(System.in);
		int i=s.nextInt();
		if(i>0)
		{
		    System.out.println("positive");
		}
		else if(i<0)
		{
		    System.out.println("negative");
		}
		else
		{
		    System.out.println("zero");
		}
	}
}
