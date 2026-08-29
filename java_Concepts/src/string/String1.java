package string;

public class String1 {

	public static void main(String[] args) {
		String str1="hello";//stores in string constant pool
		String str2="hello";
		String s1=new String("hello");// object stores in heap
		String s2=new String("hello");
		System.out.println(str1==str2);//so same address for scp
		System.out.println(s1==s2);// diff address

	}

}
