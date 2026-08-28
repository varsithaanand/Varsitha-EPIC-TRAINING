package programs;

public class hollowpyramid {

	public static void main(String[] args) {
		int n = 5;

		for (int i = 1; i <= n; i++) {

		    // Print spaces
		    for (int j = 1; j <= n - i; j++) {
		        System.out.print(" ");
		    }

		    // Print stars and spaces
		    for (int j = 1; j <= 2 * i - 1; j++) {
		        if (j == 1 || j == 2 * i - 1 || i == n)
		            System.out.print("*");
		        else
		            System.out.print(" ");
		    }

		    System.out.println();
		}
	}
}
/*

hollow
n=5
i=0 s=4 j=1              1
i=1 s=3 j=2           1  x  1
i=2 s=2 j=2         1  x  x  x   1
i=3 s=1 j=2       1 x  x  x   x    1
i=4 s=0 j=9

s=n-i-1
j= 

*/

	
