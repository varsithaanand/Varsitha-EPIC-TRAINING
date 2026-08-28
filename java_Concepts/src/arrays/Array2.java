package arrays;
//import java.util.Scanner;
public class Array2 {
//sorting in descending order
	public static void main(String[] args) {
		int[] arr= {2,3,4,5,7,7};
		int n=arr.length;
		
		for(int i=0;i<n;i++)
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
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
		
		
	}

}
/*
 *sorting
 *
 *
*/