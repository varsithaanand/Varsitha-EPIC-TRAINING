package programs;
import java.util.Scanner;
public class Maximumoffour {
     public static void main(String args[]) {
    	 Scanner in=new Scanner(System.in);
    	 int a=in.nextInt();
    	 int b=in.nextInt();
    	 int c=in.nextInt();
    	 int d=in.nextInt();
    	 if(a>=b && a>=c && a>=d)
    	 {
    		 System.out.println("A is greatest");
    	 }
    	 else if(b>=a && b>=c && b>=d)
    	 {
    		 System.out.println("B is greatest");
    	 }
    	 else if(c>=a && c>=b && c>=d)
    	 {
    		 System.out.println("C is greatest");
    	 }
    	 else if(d>=a && d>=b && d>=c)
    	 {
    		 System.out.println("d is greatest");
    	 }
    	 else
    	 {
    		 System.out.println("invalid");//if equal find hw
    	 }
     }
}
