package arrays;
import java.util.Scanner;
public class Sortunsort {

	public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();//5
        int[] arr = new int[n];//1 2 3 5
        for (int i = 0; i < n - 1; i++) {
            arr[i] = in.nextInt();
        }
        int val = in.nextInt();//24
        int index = in.nextInt();//1
        int temp;
        for (int i = index; i < n; i++) {
            temp = arr[i];//3  temp is used for changing elements
            arr[i] = val;
            val = temp;//3
        }
        for (int i = 0; i < n - 1; i++) {
           System.out.println(arr[i]);
        }
	}
}


//input 1235=4
//724 =3
//output 1223457


/*
 * 1 2 3
 * 7 2
 * 
 * 
*/
