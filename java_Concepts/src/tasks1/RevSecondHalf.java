package tasks1;

public class RevSecondHalf {

	public static void main(String[] args) {
		int[] arr= {2,4,6,8,10,12};
		for(int i=0;i<arr.length;i++)
		{
			
			
			if(i>=(arr.length/2))
			{
				int n=(arr.length/2)+(arr.length-i)-1;
				System.out.print(arr[n]+" ");
				n--;
				
				
			}
			else {
				System.out.print(arr[i]+" ");
			}
			
		}

	}

}
