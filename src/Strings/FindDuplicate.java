package Strings;

import java.util.Scanner;

public class FindDuplicate 
{
	public static void main(String[] args) {
		 Scanner scan=new Scanner(System.in);
		 System.out.println("Enter a string ");;
		 String name=scan.nextLine();
		 int count;
		 char ch[]=name.toCharArray();
		 
		  for(int i=0; i <ch.length;i++)
		  {
			  count=1;
			  for(int j=i+1; j<ch.length; j++ )
				  if (ch[i] == ch[j] && ch[i] != ' ') 
			  {
				  count++;
			  }
			  if (count > 1 && ch[i] != '0')
					System.out.println(ch[i]);
			  System.out.println("vhvk");
		  } 
				 	
	}

}
