package string;

public class AlphabetOccurance {

	public static void main(String[] args) 
	{
		String name="saravanan";
		int[] alp=new int[26];
		
		for(int i=0;i<name.length();i++)
		{
			int ch=name.charAt(i)-'a';
			alp[ch]+=1;
					  
		}
		//for loop for alphabetical occurance
		for(int i=0;i<alp.length;i++)
		{
			if(alp[i]!=0)
			{
				
				System.out.println((char)(i+'a')+" "+alp[i]);
			}
			
		}
		System.out.println("************************************");
		// for loop for orderly occurance
		for(int i=0;i<name.length();i++){
		    int val = name.charAt(i) - 'a';
		    if(alp[val]>0){
		        System.out.println(name.charAt(i)+" "+alp[val]);
		    }
		    if(alp[val]>1){
		        alp[val]=0;
		    }
		}
		

	}

}
