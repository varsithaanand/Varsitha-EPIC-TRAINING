package arrays;
import java.util.Scanner;
public class Array1 {
// Sum
	public static void main(String[] args) {
	 Scanner in=new Scanner(System.in);
	 int size=in.nextInt();
	 int sum=0;
	 int[] arr=new int[size];
	 for( int i=0;i<size;i++)
	 {
		 arr[i]=in.nextInt();
		 sum+=arr[i];
	 }
     System.out.println(sum);
	}

}
/*
 * 2000=arr+0[4*0]
 * 2004=arr+1[4*1]
 * 2008=arr+2[4*2]
 * memory address+index*bytes
 * reason for index is zero
 * printing an empty array we will get 0 in java....why array starts from zero
 * array declaration = int[] arr=new int[size];
 * static array=int[] arr={2,4,6,8};
 */
