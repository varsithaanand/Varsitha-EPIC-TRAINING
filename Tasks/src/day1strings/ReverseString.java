package day1strings;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String str=in.next();
		for(int i=str.length()-1;i>=0;i--)
		{
			System.out.print(str.charAt(i)+" ");
		}

	}

}
