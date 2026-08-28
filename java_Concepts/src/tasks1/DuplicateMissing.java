package tasks1;

public class DuplicateMissing {

	public static void main(String[] args) {
		int n=6;
		int[] arr= {1,2,3,4,4,6};
		for(int i=1;i<n;i++)
		{
			if(i!=arr[i-1])
			{
				System.out.println(i+" Missing");
			}
			else if(arr[i-1]==arr[i])
			{
				System.out.println(arr[i] + " Duplicate");
				
			}
		}

	}

}
