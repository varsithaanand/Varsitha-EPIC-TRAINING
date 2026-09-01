package string;

import java.util.Arrays;
import java.util.Scanner;
public class Anagram 
{
	public static void main(String[] args) 
	{
	        Scanner in = new Scanner(System.in);
	        String str1 = in.nextLine();
	        String str2=in.nextLine();
	        char[] strArr1 = str1.toCharArray();
	        char[] strArr2 = str2.toCharArray();
	        Arrays.sort(strArr1);
	        Arrays.sort(strArr2);
	        String con1=Arrays.toString(strArr1);
	        String con2=Arrays.toString(strArr2);
	        if(con1.equals(con2)) //strArr1.equals(strArr2)
	        {
	          System.out.print("it is a anagram");  
	        }
	        else{
	            System.out.print("it is not a anagram"); 
	        }
	        
	  }
}