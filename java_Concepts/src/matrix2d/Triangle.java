package matrix2d;
import java.util.Scanner;
public class Triangle {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	    int n = in.nextInt();
	    int[][] arr = new int[n][n];
	    
	    
	    for(int i=0;i<n;i++){
		    for(int j=0;j<n;j++){
		        arr[i][j] = in.nextInt();
		    }
		}
		
		boolean rt = true;
		boolean lt = true;
		
		for(int i=0;i<n;i++){
		    for(int j=0;j<n;j++){
		        if(j<=i && arr[i][j]!=0){
		            rt=false;
		        }
		        else if((i+j)>=n-1 && arr[i][j]!=0){
		            lt  = false;
		        }
		    }
		}
		
		if(rt){
		    System.out.println("Its a right Tri");
		}
		else if(lt){
		    System.out.println("Its a Left Tri");
		}
		else{
		    System.out.println("Its a not a Tri");
		}
		
	}
}
