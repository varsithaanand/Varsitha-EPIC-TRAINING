package arrays;
import java.util.Scanner;
public class ImmediateSmallest {

	public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	int n=in.nextInt();
	int[] arr=new int[n];
    
    for(int i=0;i<n;i++)//for inputing the array
    {
        arr[i] = in.nextInt();
    }
    
    for(int i=0;i<n-1;i++){ // Ex: 16 8 14 17 11 ....no 9 becoz n-1
        int out=-1; // initialize out 
        for(int j=i+1;j<n;j++){// Ex: 8 14 17 11 9
            
            if(arr[j]<arr[i]){// 8<16 T,14<16 T,17<16 F,11<16 T,9<16 T
                out = arr[j]; //Set as 8 or 14 or 11 or 9
                for(int k=j+1;k<n;k++){ // 14 17 11 9
                    if(arr[i]>arr[k] && arr[k]>out){
                        out= arr[k];
                        
                    }
                    
                } 
                break;// to stop next j iteration
                
            }
            
              
        }
        System.out.println(out);
        
        
    }
    System.out.println(-1);
	}
}
/*
input:- 16  8 14 17 11 9
output:-14 -1 11 11 9 -1
check through oly right side immediate smallest

*/