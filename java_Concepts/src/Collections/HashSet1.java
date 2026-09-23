package Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class HashSet1 {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		ArrayList<Integer> li=new ArrayList<>();
		HashSet<Integer> set1=new HashSet<>();
		HashSet<Integer> set2=new HashSet<>();
		int n=in.nextInt();
		for(int i=0;i<n;i++)
		{
			li.add(in.nextInt());
		}
		for(int val:li)
		{
			
				if(!set1.add(val))
				{
					set2.add(val);
					
				}
		}
		set1.removeAll(set2);
		System.out.println(set1);
		//System.out.println(set2);
		//System.out.println(li);
	}

}
