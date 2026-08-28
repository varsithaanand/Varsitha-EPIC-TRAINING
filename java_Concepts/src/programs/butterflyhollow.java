package programs;

public class butterflyhollow {

	public static void main(String[] args) {
		int n=5;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n*2;j++)
			{
				//if(j<=i || (i+j)>=(n*2)-1)
				if(j==0 || j==n*2-1 || i+j==n*2-1 ||i==j)
				{
					System.out.print("*");
					//System.out.print(i+""+j);
				}
				else {
					System.out.print(" ");
				}
			}
		 System.out.println();	
		}
		for(int i=n-1;i>-1;i--)
		{
			for(int j=0;j<n*2;j++)
			{
				//if(j<=i || (i+j)>=(n*2)-1)
				if(j==0 || j==n*2-1 || i+j==n*2-1 ||i==j)
				{
					System.out.print("*");
					//System.out.print(i+""+j);
				}
				else {
					System.out.print(" ");
				}
			}
		 System.out.println();	
		}
	}

}
/*
 * 
00        09                j==0 j==9 i+j==9 i==j
1011      1819
202122    272829            21      28
30313233  36373839          3132   3738
40414243444546474849        414243 454647
*/
