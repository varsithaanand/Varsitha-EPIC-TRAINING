package thread;
class MyData extends Thread{
	public void run()
	{
		System.out.println("Print data");
	}
}
public class Threads1 {

	public static void main(String[] args) {
		
		MyData t1=new MyData();
		
		t1.start();
		
		System.out.println("Hii");
		

	}

}
