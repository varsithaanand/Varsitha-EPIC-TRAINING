package tasks1;

public class ReverseOdd 
{
	public static void main(String[] args) 
	{
		int[] arr= {2,4,6,8,10,12};
		for(int i=0;i<arr.length;i++)
		{
		    if(i%2!=0)
		    {
		       int n=arr.length-i;
		       System.out.print(arr[n]+ " "); 
		    }
		    else
		    {
		       System.out.print(arr[i]+ " ");  
		    }
		}
		

	}
}
