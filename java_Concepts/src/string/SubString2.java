package string;

import java.util.Scanner;

public class SubString2 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String str=in.next();
		String substr=in.next();
		boolean ishere=false;
		for(int i=0;i<=(str.length()-substr.length());i++)
		{
			String temp="";
		   for(int j=i;j<substr.length()+i;j++) 
		   {
		       temp+=str.charAt(j);
		       if(temp.equals(substr))
		       {
		    	   ishere=true;
		    	   break;
		       }
		       
		       
		       
		   }
		   
		}
		   if(ishere)
		   {
			   System.out.println("It is a substring");
		   }
		   else
		   {
			   System.out.println("It is not a substring");
		   }

	}

}
