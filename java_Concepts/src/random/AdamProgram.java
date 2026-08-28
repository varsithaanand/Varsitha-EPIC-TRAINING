package random;
import java.util.Scanner;
public class AdamProgram {
	
	int reverse(int value) {
		int rev=0;
		while(value!=0)	
	    {
	    	rev=rev*10+value%10;
	    	value=value/10;
	    }
		return rev;
	}

	public static void main(String[] args) {
    AdamProgram in=new AdamProgram();
	int value=12;
	int square=value*value;
	int rev=in.reverse(value);
	int sqrev=rev*rev;
	int temp=in.reverse(sqrev);
	System.out.println(square);
	System.out.println(rev);
	System.out.println(sqrev);
	System.out.println(temp);
	}

}
