package string;
import java.util.Scanner;
public class String2 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String str1=in.next();
		String str2="";
		for(int i=0;i<str1.length();i++)
		{
			str2+=str1.charAt(i)+" ";
			//str2+=" ";
		}
       System.out.println(str2);
	}

}
