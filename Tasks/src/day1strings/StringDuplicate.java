package day1strings;

import java.util.Scanner;

public class StringDuplicate {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String str=in.next();
		for(int i=0;i<str.length();i++)
		{
			for(int j=0;j<str.length();j++)
			{
				if(i!=j)
				{
					if(j>i && (str.charAt(i)==str.charAt(j)))
					{
						
						System.out.println(str.charAt(j));
						break;
					}
					else if(j<i && (str.charAt(i)==str.charAt(j)))
					{
						break;
					}
				}
				
			}
			
			
		}
		

	}

}
