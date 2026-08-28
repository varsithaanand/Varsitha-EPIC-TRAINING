package tasks1;

public class ReverseEven {
	public static void main(String[] args) 
	{
		int[] arr= {2,4,6,8,10,12};
		for(int i=0;i<=arr.length-1;i++)
		{
		    if(i%2==0)
		    {
		       int n=arr.length-i-2;
		       System.out.print(arr[n]+ " "); 
		    }
		    else
		    {
		       System.out.print(arr[i]+ " ");  
		    }
		}
		

	}

}
