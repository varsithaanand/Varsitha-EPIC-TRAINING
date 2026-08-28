package programs;
import java.util.Scanner;
public class Forloop {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String str=in.next();
		int asc=0;
		for(int i=0;i<str.length();i++) {
			
		asc=str.charAt(i)+1;
		if(asc>=65 && asc <=91) {			
		
		if(asc>90) {
			asc=65;
			System.out.println((char)asc);
		}
		else {
			System.out.println((char)asc);
		}
		
		}
		else {
			
			if(asc>122) {
				asc=97;
				System.out.println((char)asc);
			}
			else {
				System.out.println((char)asc);
			}
			
		}
		
		}
		}

	}
   /*
    * separate the operators and numbers
    * numbers-str[0],str[1]
    * operator-opr[0]
    */


