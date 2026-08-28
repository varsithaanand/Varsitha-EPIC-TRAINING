package subarray;

public class Subarray2 {

	public static void main(String[] args) {
		int[] arr= {15,20,25,30,35};
		int n=arr.length;
		
		for(int k=0;k<n;k++) {
			for(int i=k;i<n;i++)
			{   
				for(int j=k;j<=i;j++)
				{
					System.out.print(arr[j]+" ");
				}
				System.out.println();
			}
			System.out.println();
		}
			
		
		

	}

}
