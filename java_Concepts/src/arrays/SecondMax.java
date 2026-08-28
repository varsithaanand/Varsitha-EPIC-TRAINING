package arrays;
//import java.util.Scanner;
public class SecondMax {
	public static void main(String[] args) {
		int[] arr= {5,3,6,7,7,7,7};
		int n=arr.length;
	    int count=1;
	    int pos=4;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[j]>arr[i])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i = 0; i < n; i++) {
            if(arr[i] != arr[i + 1]) {
                count++;
                if(count == pos) {
                    System.out.println(arr[i + 1]);
                    break;
                }
            }
        }
		
		}
		
	}


/*
 *sorting
 *
 *
*/