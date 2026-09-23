package arrays;
import java.util.Scanner;
public class LeftRotation {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int rot=in.nextInt();
		int[] arr=new int[n];
		
		for(int i=0;i<n;i++)
		{
			arr[(i+n-rot)%n]=in.nextInt(); // Left Rotation
			//arr[(i+rot+1)] Right Rotation
		}
		
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i] +" ");
		}
	}

}
/*
 * 
 *
 * public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=in.nextInt();
		}
		int rot=in.nextInt();
		int k=0;
		while(k<rot)
		{
			int temp=arr[0];
			for(int i=0;i<n;i++)
			{
				arr[i]=arr[i+1];
			}
			arr[n-1]=temp;
			k++;
		}
		
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
	}
 *
*/