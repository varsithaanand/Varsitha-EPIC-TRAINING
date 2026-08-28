package subarray;

import java.util.Scanner;
public class Subarray3 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
        int n=in.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=in.nextInt();
		}
		
		
		int target=in.nextInt();
		int max=0;
		for(int i=0;i<n;i++)
		{     int sum=0;
		      int count=0;
		    for(int j=i;j<n;j++)
		    {
		        
		            sum+=arr[j];
		            if(sum==target)
		            {
		                for(int z=i;z<=j;z++)
		                {
		                    //System.out.print(arr[z]+" ");
		                    count++;
		                }
		            }
		             
		   }
		   if(max<count)
			{
				
				max=count;
				
			}
		
		  
		       
		    }
		    System.out.print(max);
		    
		}
	


	}


