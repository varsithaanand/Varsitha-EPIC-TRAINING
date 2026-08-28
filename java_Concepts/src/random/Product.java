package random;

public class Product {

	public static void main(String[] args) {
		int num=1234;
		int pro=1;
		while(num!=0)
		{
			pro*=num%10;
			num=num/10;
		}
        System.out.println(pro);
	}

}
