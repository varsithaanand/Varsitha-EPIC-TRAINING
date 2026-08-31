package string;
import java.util.Scanner;
public class StackString {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String str=in.next();
		int output=str.charAt(0)-'0';
		for(int i=((str.length()/2)+1);i<str.length();i++)
		{
			int x=i-(str.length()/2);
			switch(str.charAt(i))
			{
			  case '+':{
				  output+=str.charAt(x)-'0';
				  break;}
			  case '-':{
				  output-=str.charAt(x)-'0';
				  break;}
			  case '*':{
				  output*=str.charAt(x)-'0';
				  break;}
			  case '/':{
				  output/=str.charAt(x)-'0';
				  break;}
			  case '%':{
				  output%=str.charAt(x)-'0';
				  break;}
				  
			}
		}
		System.out.println("output " + output);

	}

}
