package arrays;

public class CopyArray {

	public static void main(String[] args) {
		int arr[]= {2,3,4,5};
		int n=arr.length;
		int[] res=new int[n];
		for(int i=0;i<n;i++)
		{
			res[i]=arr[i];
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(res[i]+" ");
		}

	}

}
