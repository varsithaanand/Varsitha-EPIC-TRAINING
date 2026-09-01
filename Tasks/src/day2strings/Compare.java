package day2strings;
import java.util.Scanner;
public class Compare {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String str1=in.next();
		String str2=in.next();
		if(str1.charAt(0)>str2.charAt(0))
		{
			System.out.println("string 1 is greater");
		}
		else if (str1.charAt(0)<str2.charAt(0))
		{
			System.out.println("string 1 is smaller");
		}
		else
		{
			if(str1.length()==str2.length())
			{
				boolean isthere=false;
				for(int i=0;i<str1.length();i++)
				{
					
					if(str1.charAt(i)==str2.charAt(i))
					{
						isthere=true;
					}
					
				}
				if(isthere)
				{
					System.out.println("equal");
				}
			}
			
		}

	}

}
