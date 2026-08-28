package random;
import java.util.Scanner;
public class Multiplication {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int num=in.nextInt();
		for(int i=1;i<=10;i++) // otherway  i=num;i<=num*10;i+=num
		{
			System.out.print(num*i + " ");
		}
	}

}
