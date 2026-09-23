package Collections;
import java.util.Scanner;
import java.util.ArrayList;
public class ArrayList1 {
//remove duplicates
	public static void main(String[] args) {
		ArrayList<Integer> li=new ArrayList<>();
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		for(int i=0;i<n;i++)
		{
			li.add(in.nextInt());
		}
		for(int i=0;i<n;)
		{
			if(li.contains(li.get(i)) && li.indexOf(li.get(i))!=i)
			{
				li.remove(i);
				n--;
			}
			else
			{
				i++;
			}
		}
		System.out.println(li);
		
		

	}

}
