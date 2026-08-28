package arrays;
import java.util.*;
public class DivisibleCount {

		public static void main(String[] args) {
		    Scanner in  = new Scanner(System.in);
		    int n = in.nextInt();//6
		    int[] arr1 = new int[n];// 12 24 16 8 10 9
		    int[] arr2 = new int[n];
		    
		    for(int i=0;i<n;i++){
		        int count = 0;
		        arr1[i] = in.nextInt();
		        for(int j=2;j<=(arr1[i])/2;j++){
		            if(arr1[i]%j==0){
		                count++;
		            }
		        }
		        arr2[i] = count;
		        
		    }
		    for(int j=1,i=0;j<n;j++,i++)
			{
				if(arr2[j]>arr2[i])
				{
					int temp=arr2[i];
					int temp1=arr1[i];
					arr2[i]=arr2[j];
					arr1[i]=arr1[j];
					arr2[j]=temp;
					arr1[j]=temp1;
				}
			}
		    for(int i=0;i<n;i++){
		        System.out.println(arr2[i]);
		        //System.out.println(arr1[i]);
		    }
		   
		}
	}


