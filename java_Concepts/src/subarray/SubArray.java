package subarray;

public class SubArray {

	public static void main(String[] args) {
		int[] arr= {1,2,1,1,2,2,3,1};
		
		int n=arr.length;
		int target=4;
		int k=3;
		for(int i=0;i<=n-2*k;i++)
		{     int sum=0;
		      
		    for(int j=i;j<i+k;j++)
		    {
		            
		            sum+=arr[j];
		            
		            	if(sum==target)
			            {
			                for(int z=i;z<=j;z++)
			                {
			                    System.out.print(arr[z]+" ");
			                    
			                }
			            }
		            
		            
		            
		            
		           
		   }
		   
		    System.out.println();  
		  
		       
		    }
		}

	}


