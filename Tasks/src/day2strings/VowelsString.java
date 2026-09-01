package day2strings;

import java.util.Scanner;

public class VowelsString {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String str=in.next();
		String temp="";
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='a'||str.charAt(i)=='A'||str.charAt(i)=='e'||str.charAt(i)=='E'||str.charAt(i)=='i'||str.charAt(i)=='I'||str.charAt(i)=='o'||str.charAt(i)=='O'||str.charAt(i)=='u'||str.charAt(i)=='U')
			{
				temp+='$';
			}
			else
			{
				temp+=str.charAt(i);
			}
		}
		System.out.println(temp);

	}

}
