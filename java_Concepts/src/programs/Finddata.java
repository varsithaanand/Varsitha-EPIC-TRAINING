package programs;
import java.util.Scanner;
public class Finddata {
  public static void main(String[] args)
  {
	  Scanner in=new Scanner(System.in);
	  char ch=in.next().charAt(0); //charAt(0):in order to to take the first value of the ch
	  if(ch>='A' &&  ch<='Z' || ch>='a' && ch<='z')
	  {
		  System.out.println("alphabet");
	  }
	  else if(ch>='0' && ch<='9')
	  {
		  System.out.println("Number");
	  }
	  else
	  {
		  System.out.println("special character");
	  }
  }
}

//Ascii values a=97,A=65,0=48 ((int)char_value)
/*
 * String 
switch(val<x>){
  case val1:
       statements
       break;
  case val2:
       statements
       break;
  case val3:
       statements
       break;
  default:
       statements
*/





