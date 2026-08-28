package arrays;

import java.util.Scanner;

public class DuplicateNumber {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		 int size = in.nextInt();//4
	        int[] arr = new int[size];      //arr[4]; 1 4 7 34
	        //int[] res = new int[size];
	        for(int i=0;i<size;i++)
	        {
	            arr[i] = in.nextInt();
	        }
	        
	        for(int i=0;i<size;i++)
	        {
	        	
	        		for(int j=0;j<size;j++)
		        	{
	        			if(i!=j) 
	        			{
		        		if(arr[i]==arr[j] && j<i)
		        		{
		        			
		        			break;
		        			
		        		}
		        		else if(arr[i]==arr[j] && j>i)
		        		{
		        			System.out.println(arr[i]);
		        			break;
		        		}
		        		
		        		
	        			}
		        	}
	        	
	        	
	        }
	        
	            
	}

}
/*
 * 8
 * 12 4 6 6 7 6 12 4 
*/