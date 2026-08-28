package random;
public class Factorial {
	int  fact(int n)
	{
		if(n==1 || n==0) {
			  return 1;
		}
		else
		{
			return n*fact(n-1);
		}
	}
	public static void main(String[] args) {
		int n=143;
		int result=0;
		Factorial in=new Factorial();
		while(n!=0) {
			
			result+=in.fact(n%10);
			n=n/10;
		}
		System.out.println(result);
		

	}

}
