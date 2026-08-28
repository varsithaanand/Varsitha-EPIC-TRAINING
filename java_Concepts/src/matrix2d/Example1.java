package matrix2d;
import java.util.Scanner;
public class Example1 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();;
		int[][] arr1=new  int[n][n];
		//int[][]  arr= { {1,2,3} , {5,6,7} , {2,3,4} };
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				arr1[i][j]=in.nextInt();
			}
		}
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}

	}

}
