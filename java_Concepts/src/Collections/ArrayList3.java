package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayList3 {
//check commands
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String val=in.next();
		ArrayList<Character> num=new ArrayList<>();
		ArrayList<Character> alp=new ArrayList<>();
		for(int i=0;i<val.length();i++)
		{
			if(val.charAt(i)>='0' && val.charAt(i)<='9') // Character.isDigit(val.charAt(i))
			{
				num.add(val.charAt(i));
				
			}
			else if(val.charAt(i)>='a' && val.charAt(i)<='z') //Character.isLetter(val.charAt(i))
			{
				alp.add(val.charAt(i));
				
			}
		}
		Collections.sort(num);
		Collections.reverse(alp);
		String emp="";
		int alpindex=0,numindex=0;
		for(int i=0;i<val.length();i++)
		{
			
			if(Character.isDigit(val.charAt(i))) 
			{
				emp+=num.get(numindex);
				numindex++;
				
			}
			else if(Character.isLetter(val.charAt(i))) 
			{
				emp+=alp.get(alpindex);
				alpindex++;
				
			}
			else
			{
				emp+=val.charAt(i);
			}
		}
		System.out.println(emp);
		

	}

}
/*
 * input : a$87k
 * output : k$78a
*/