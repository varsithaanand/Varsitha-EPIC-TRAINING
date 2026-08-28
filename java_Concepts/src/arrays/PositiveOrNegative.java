package arrays;
import java.util.Scanner;
public class PositiveOrNegative {

	public static void main(String[] args) {
	 Scanner in=new Scanner(System.in);
	 int n=in.nextInt();
	 int[] arr=new int[n];
	 
	 for(int i=0,j=n-1;i!=j+1;)
	 {
		 int val=in.nextInt();
		 if(val>=0)
		 {   
			 arr[i]=val;
			 i++;
			 
		 }
		 else {
			 arr[j]=val;
			 j--;
		 }
		 
	 }
	 for(int i=0;i<n;i++)
	 {
		 System.out.println(arr[i]);
	 }
	 
	 }

}
