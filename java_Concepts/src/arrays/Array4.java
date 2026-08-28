package arrays;

public class Array4 //ascending in even...descending in odd
{

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7};
		int n=arr.length;
		for(int i=0;i<n;i++)
		{  
			       if(i%2==0) {
			    	   for(int j=i+1;j<n;j++)
						{ 
							if(arr[j]<arr[i] )
							{
								int temp=arr[i];
								arr[i]=arr[j];
								arr[j]=temp;
							}
						    
					    }
			       }
			       else
			       {
			    	   for(int j=i+1;j<n;j++)
						{
							if(arr[j]>arr[i])
							{
								int temp=arr[i];
								arr[i]=arr[j];
								arr[j]=temp;
							}
						}
			       }
			    	
			     
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
	}

}
