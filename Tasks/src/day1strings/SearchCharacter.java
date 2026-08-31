package day1strings;

import java.util.Scanner;

public class SearchCharacter {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String str=in.next();
	    char ch = in.next().charAt(0);
		for(int i=0;i<str.length();i++)
		{
			if(ch==str.charAt(i))
			{
				System.out.println("found");
				break;
			}
			//System.out.println("not found");
		}

	}

}
