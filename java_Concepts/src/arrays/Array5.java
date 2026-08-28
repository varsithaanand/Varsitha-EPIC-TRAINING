package arrays;
import java.util.Scanner;
public class Array5 { //searching an element

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		 int size = in.nextInt();//4
	        int[] arr = new int[size];      //arr[4]; 1 4 7 34
	        for(int i=0;i<size;i++){
	            arr[i] = in.nextInt();
	            
	            
	        }
	        int search = in.nextInt();//34
	        boolean value=true;
	        
	        for(int i=0;i<size;i++){
	            if(arr[i]==search){
	                System.out.print("Present");
	                value=false;
	                break;
	            }
	        }
	        if(value) {
	        	System.out.print("Not found");
	        }
	        
	}

}
