package programs;

public class hollowbutterfly {

	public static void main(String[] args) {
		
		int n = 4;

		// Upper half
		for (int i = 0; i <n; i++) {

		    // Left wing
		    for (int j = 1; j <= i; j++) {
		        if (j == 1 || j == i)
		            System.out.print("*");
		        else
		            System.out.print(" ");
		    }

		    // Middle spaces
		    for (int j = 1; j <= 2 * (n - i); j++) {
		        System.out.print(" ");
		    }

		    // Right wing
		    for (int j = 1; j <= i; j++) {
		        if (j == 1 || j == i)
		            System.out.print("*");
		        else
		            System.out.print(" ");
		    }

		    System.out.println();
		}

		// Lower half
		for (int i = n; i > 0
				; i--) {

		    // Left wing
		    for (int j = 1; j <= i; j++) {
		        if (j == 1 || j == i)
		            System.out.print("*");
		        else
		            System.out.print(" ");
		    }

		    // Middle spaces
		    for (int j = 1; j <= 2 * (n - i); j++) {
		        System.out.print(" ");
		    }

		    // Right wing
		    for (int j = 1; j <= i; j++) {
		        if (j == 1 || j == i)
		            System.out.print("*");
		        else
		            System.out.print(" ");
		    }

		    System.out.println();
		}
 }
 }


/*
*   * 
** **   i=0 j=2 s=
*****
*****
** **
*   *
*butterfuly pattern
* int n=5;
     
    	 
     for (int i = 1; i <= n; i++) {
         for (int j = 1; j <= 2 * n; j++) {
           
             // To print spaces
             if (j > i && j <= 2 * n - i) {
                 System.out.print(" ");
             }
             
             // To print stars
             else{
                 System.out.print("*");
             }
         }
         System.out.println();
     }

     // Outer loop to handle the lower part
     for (int i = n; i >= 1; i--) {
         for (int j = 1; j <= 2 * n; j++) {
           
             // To print spaces
             if (j > i && j <= 2 * n - i) {
                 System.out.print(" ");
             }
             
             // To print stars
             else {
                 System.out.print("*");
             }
         }
         System.out.println();
     }
     
  j<=2*n-1   
 j<=i
 i=0 j=9        9
 i=1 j=8,9       8
 i=2 j=7,8,9    7
 i=3 
*/