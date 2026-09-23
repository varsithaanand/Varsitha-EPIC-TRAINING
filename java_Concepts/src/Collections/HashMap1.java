package Collections;

import java.util.HashMap;

public class HashMap1 {

	public static void main(String[] args) {
		String val="Hhello";
		val=val.toLowerCase();
		HashMap<Character,Integer> map=new HashMap<>();
		
		for(int i=0;i<val.length();i++)
		{  
			if(map.containsKey(val.charAt(i)))
			{
				int value=map.get(val.charAt(i))+1;
				map.put(val.charAt(i),value);
			}
			else
			{
				map.put(val.charAt(i),1);
			}
			
		}
		for(int i=0;i<val.length();i++)
		{
			System.out.println(val.charAt(i)+" "+map.get(val.charAt(i)));
		}
		System.out.println(map);
		
		

	}

}
