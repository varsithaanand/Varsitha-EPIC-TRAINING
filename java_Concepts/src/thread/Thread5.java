package thread;
class Empolyee
{
	
}
class MyData4 extends Empolyee implements Runnable //instead of Thread v can use Runnable interface
{
	public void run()
	{
		System.out.println("Thread is running");
	}
}
public class Thread5 {

	public static void main(String[] args) {
		MyData4 t1=new MyData4();
		Thread th=new Thread(t1);//using this in order to make it asychronized
		th.start();//tiggers the run methods that is in Thread class
		System.out.println("In main");

	}

}
/*
 * 
 * here the output will be
 * In main
Thread is running

because start method before calling the thread class main will get executed
 */
*/