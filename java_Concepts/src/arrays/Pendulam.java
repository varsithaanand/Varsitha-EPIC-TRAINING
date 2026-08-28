package arrays;

public class Pendulam {

	public static void main(String[] args) {
		int[] arr= {30,18,12,16,27};
		int n=arr.length;
		int[] result=new int[n];
		
		for(int i=0;i<n;i++)
		{  
			       
			    	   for(int j=i+1;j<n;j++)
						{ 
							if(arr[j]>arr[i] )
							{
								int temp=arr[i];
								arr[i]=arr[j];
								arr[j]=temp;
							}
							
							
						    
					    }
			       
			       
			    	
			     
		}
		int mid=(n-1)/2;
		result[mid]=arr[0];
		int left=mid-1;
		int right=mid+1;
		boolean val=true;
		for(int i=1;i<n;i++)
		{   
			if(val) {
				
				result[right++]=arr[i];
				
			}
			else
			{
				result[left--]=arr[i];
			}
			
			val=!val;
			
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(result[i]);
		}
	}

}

/*
16 27 30 18 12


0    1   2    3   4
30  18  12   16  27

16 27 30 18 12
27 16 30 18 12
27 16 30

30
18
12
16
27

*/