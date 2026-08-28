package random;
import java.util.Scanner;
public class Program1 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int num=in.nextInt();
		int count=0;
		int rev=0;
		int value=0;
		
		while(num!=0)
		{  
		  value=num%10;
		  rev=rev*10+value;
		  count+=1;
		  num=num/10;
		}
		
       for(int i=0;i<count;i++)
       {
    	   for(int j=0;j<count;j++)
    	   {
    		   if(i==j )//i+j==count-1
    		   {
    			  value=rev%10;
    			  System.out.print(value); 
    			  rev=rev/10;
    		   }
    		   
    		   else {
    			   System.out.print(" "); 
    		   }
    	   }
    	   System.out.println(); 
       }
	}

}
