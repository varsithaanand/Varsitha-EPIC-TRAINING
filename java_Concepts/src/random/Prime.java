package random;

public class Prime {

	public static void main(String[] args) {
		int num=4867;
		int val=0;
		int primeCount=0;
		while(num!=0)
		{
			val=num%10;
			for(int i=2;i<=val/2;i++)
			{
				if(val%i==0)
				{
					primeCount+=1;
					break;
				}
			}
			num=num/10;
		}
		System.out.println(primeCount);

	}

}
