package Collections;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList2 {
//second largest
	public static void main(String[] args) {
		ArrayList<Integer> li=new ArrayList<>();
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int max=Integer.MIN_VALUE; //because of negative value
		int sl=0;
		for(int i=0;i<n;i++)
		{
			li.add(in.nextInt());
		}
		for(int i=0;i<n;i++)
		{
			if(max<(li.get(i)))
			{
				sl=max;
				max=li.get(i);
			}
			else if((li.get(i))>sl && (li.get(i))<max)
			{
				sl=li.get(i);
			}
		}
		System.out.println(sl);

	}

}
