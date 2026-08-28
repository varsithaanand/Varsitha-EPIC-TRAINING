package random;
import java.util.Scanner;
public class OddRange {
public static void main(String[] args)
{
	Scanner in=new Scanner(System.in);
	int s=in.nextInt();
	int e=in.nextInt();
	for(int i=s;i<e;i++)
	{
		if(i%2==1) {
			
			System.out.print(i+",");
			
		}
		
	}
}
}
