package day1strings;

import java.util.Scanner;

public class StringUnique {

	public static void main(String[] args) 
	{
		String str="Abac";
		int[] alp=new int[26];
		for(int i=0;i<str.length();i++)
		{
			int x=str.charAt(i);
			
			if(x>='a')
			{
				int ch=x-'a';
				alp[ch]++;
			}
			else
			{
				int ch=x-'A';
				alp[ch]++;
			}
		}
		for(int i=0;i<str.length();i++){
			
			if(str.charAt(i)>='a')
			{
				int val = str.charAt(i) - 'a';
			    if(alp[val]==1){
			        System.out.println(str.charAt(i)+" "+alp[val]);
			        alp[val]=0;
			    }
			}
			else
			{
				int val = str.charAt(i) - 'A';
			    if(alp[val]==1){
			        System.out.println(str.charAt(i)+" "+alp[val]);
			        alp[val]=0;
			    }
			}
		    
		    
		}
		

	}

}
