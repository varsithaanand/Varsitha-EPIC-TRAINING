package day1strings;

public class SringOccurance {

	public static void main(String[] args) {
		String str="abac";
		int[] alp=new int[26];
		for(int i=0;i<str.length();i++)
		{
			int ch=str.charAt(i)-'a';
			alp[ch]++;
		}
		for(int i=0;i<str.length();i++)
		{
			int ch=str.charAt(i)-'a';
			if(alp[ch]>0)
			
				System.out.println(str.charAt(i)+" "+alp[ch]);
			
			
			if(alp[ch]>1)
			{
				alp[ch]=0;
			}
			
		}

	}

}
