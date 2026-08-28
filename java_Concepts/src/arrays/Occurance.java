package arrays;

import java.util.Scanner;

public class Occurance {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		 int size = in.nextInt();//4
	        int[] arr = new int[size];      
	        for(int i=0;i<size;i++)
	        {
	            arr[i] = in.nextInt();
	        }
	        
	      
	        	
	        	for(int i=0;i<size;i++){
	        	int count=1;
	        	boolean isfound=true;
	        	
	        	for(int j=0;j<size;j++){
	        	if(i!=j){
	        	if(j<i && arr[i]==arr[j]){
	        	isfound=false;
	        	break;
	        	}
	        	else if( arr[i]==arr[j]){
	        	count++;
	        	//found=true;
	        	}
	        	}
	        	}

	        	if(isfound){
	        	System.out.println(arr[i]+" -> "+count);
	        	}
	        	}
	        	}
	        	}