package arrays;

import java.util.Scanner;

public class Distinct {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		 int size = in.nextInt();
	        int[] arr = new int[size];      
	        for(int i=0;i<size;i++)
	        {
	            arr[i] = in.nextInt();
	        }
	        
	        for(int i=0;i<size;i++)
	        {
	        	    int count=1;
	        		for(int j=i+1;j<size;j++)
		        	{
	        			
		        		
		        		 if(arr[i]==arr[j])
		        		{
		        			count++;
		        			
		        		}
		        		 		        		 
		        		
	        		}
	        		if(count==1)
	        		{
	        			System.out.println(arr[i]);
	        			
		        	}
	        	
	        	
	        }

	}

}
