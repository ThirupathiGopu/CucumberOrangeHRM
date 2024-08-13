package Strings;

import java.util.Scanner;

public class FindtheletterHowmanytimesreapeted 
{
	public static void main(String[] args) 
	{
	
	Scanner  scan=new Scanner(System.in);
	System.out.println("enter a string");
	String name=scan.nextLine();
	System.out.println("enter a letter");
	String lt=scan.next();
	
	 char ch[]=name.toCharArray();
	 char ch1[]=lt.toCharArray();
	
     for (int i=0;i<ch.length; i++)
     {
    	int  count=1;
    	 for (int j=0;j<ch1.length;j++)
    	 {
    		 count++;
    	 }
     
    	 if (count >1 );
    	 {
    		 System.out.println(count);
    	 }
     }
}
}
