package arrays;

public class Array3 {
//ascending order sorting oly in even index(0,2,4,..)
	public static void main(String[] args) {
		int[] arr= {12,8,7,4,25,18,17};
		int n=arr.length;
		
	    for(int i=0;i<n;i+=2){
	        for(int j=0;j<n;j++){
	            if(i!=j ){
	                if((j<i && j%2!=0) || j>i){
	                     if(arr[j]<arr[i]){
	                         int temp = arr[i];
	                         arr[i] = arr[j];
	                         arr[j] = temp;
	                     }
	                }
	            }
	        }
	    }
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}

	}

}
/*
 * 
 * 7 6 5 4 3 2
 * 3 6 5 4 7 2
 * 7 2 6 3 5 4
 *  
 *  
 *  7 2 6 3 4
 *  2 7 3  6 4 
 *  
 *  j should check all
 *  j should check all odd place behind when i is behind
 *  i should be even
 *  i!=j
 *  
 *  odd descending 
 *  even ascending
 *  
*/