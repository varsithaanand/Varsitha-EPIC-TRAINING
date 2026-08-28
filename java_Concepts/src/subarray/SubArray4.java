package subarray;

public class SubArray4 {
//sliding window tech
	public static void main(String[] args) {
		int[]  arr= {2,1,2,-1,2,3};
		int k=3;
		int num=0;
		int n=arr.length;

		while((n-2)!=0) //instead use for loop int j=0;j<=(n-k);j++
		{
			
			for(int i=num;i<k;i++)// int i=j;i<(j+k);i++
			{
				System.out.print(arr[i]);
				
				
			}
			n--;
			num++;
			k++;
			System.out.println();
		}
		

	}

}
