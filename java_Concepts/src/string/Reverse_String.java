package string;

import java.util.Scanner;

public class Reverse_String {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String str1=in.next();
		String str2="";
		for(int i=str1.length();i>0;i--)
		{
			str2+=str1.charAt(i-1);
			
		}
       System.out.println(str2);

	}

}
