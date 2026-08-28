package subarray;
import java.util.Scanner;
public class Subarray1 {
//important
	
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			int n = in.nextInt();
			int[] arr = new int[n];
			for(int i= 0;i<n;i++){
			    arr[i] = in.nextInt();
			}
			int target = in.nextInt();
			
			int prev = 0,next = 0;
			while(prev<n){
			    int sum = 0;
			    for(int i=prev;i<=next;i++){
			        sum+=arr[i];
			    }
			    
			    if(sum>=target){
			        prev++;
			        next=prev;
			        continue;
			    }
			    for(int j=next+1;j<n;j++)
			    {
			    	if(sum+arr[j]==target)
			    	{
			    		for(int k=prev;k<=next;k++)
			    		{
			    			System.out.print(arr[k]+" ");
			    		}
			    		System.out.print(arr[j]);
			    	}
			    }
			    System.out.println();
			    next++;
			}
			
		}

}
