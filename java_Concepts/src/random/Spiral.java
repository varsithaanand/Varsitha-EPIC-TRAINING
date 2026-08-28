package random;

public class Spiral {

	public static void main(String[] args) {
		int n=7;
		
		for(int i=0;i<=n/2;i++)
		{
			int val=0;
			for(int j=0;j<n;j++)
			{
				
				if(j<=i )
				{
					System.out.print(++val);
				}
				else if(i+j>=n)
				{
					System.out.print(--val);
				}
				else {
					System.out.print(val);
				}
				
			}
			System.out.println();
		}
		for(int i=n/2-1;i>=0;i--)
		{
			int val=0;
			for(int j=0;j<n;j++)
			{
				
				if(j<=i )
				{
					System.out.print(++val);
				}
				else if(i+j>=n)
				{
					System.out.print(--val);
				}
				else {
					System.out.print(val);
				}
				
			}
			System.out.println();
		}

	}

}
/*
1111111
1222221
1233321
1234321
1233321
1222221
1111111
*/