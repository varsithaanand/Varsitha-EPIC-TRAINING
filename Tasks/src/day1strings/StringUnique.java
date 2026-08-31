package day1strings;

import java.util.Scanner;

public class StringUnique {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String str=in.next();
		for(int i=0;i<str.length();i++)
		{
			int count=1;
			for(int j=0;j<=i;j++)
			{
				if(str.charAt(i)==str.charAt(j) && j<i)
				{
					count++;
				}
				
			}
			if(count==1)
			{
				System.out.println(str.charAt(i));
			}
			
			
		}

	}

}
