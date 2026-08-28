package random;
import java.util.Scanner;
public class Program2 {
//take the number from beginning
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int num=in.nextInt();
		int div=1;
		
		while(num/div !=0)
		{  
		  div*=10;
		  
		}
		div/=10;
		while(num>0)
		{
			
			System.out.println(num/div);
			num=num%div;
			div/=10;
		}

	}

}
