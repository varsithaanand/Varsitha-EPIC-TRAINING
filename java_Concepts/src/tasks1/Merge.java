package tasks1;

public class Merge {

	public static void main(String[] args) {
		int[] arr1= {1,3,5,7,9};
		int[] arr2= {2,3,4,5,6,7,9};
		int n=arr1.length+arr2.length;
		int[] temp=new int[n];
		for(int i=0;i<arr1.length;i++)
		{
			    temp[i]=arr1[i];
				
		}
		for(int i=0;i<arr2.length;i++)
		{
			    temp[arr1.length-1+i]=arr2[i];
				
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(temp[i]<=temp[j])
				{
					int a=temp[i];
					temp[i]=temp[j];
					temp[j]=a;
				}
			}
		}
		for(int i=1;i<n;i++)
		{
			if(temp[i-1]!=temp[i])
			{
				System.out.print(temp[i] + " ");
			}
			    
				
		}
	}

}
