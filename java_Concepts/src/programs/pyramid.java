package programs;

public class pyramid {

	public static void main(String[] args) {
		int n=5;
		for(int i=0;i<n;i++)
		{
			for(int s=n-i-1;s>0;s--)
			{
				System.out.print(" ");
			}
			for(int j=2*i+1;j>0;j--)
			{
				
				System.out.print("*");
			}
		System.out.println();
		}

	}

}
/*
n=5
i=0 s=4 j=1 
i=1 s=3 j=3 
i=2 s=2 j=5
i=3 s=1 j=7
i=4 s=0 j=9
 
s=n-i-1
j=2*i+1



*/
