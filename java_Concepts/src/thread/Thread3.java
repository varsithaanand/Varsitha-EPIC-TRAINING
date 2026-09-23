package thread;
class MyData1 extends Thread
{
	public void run()
	{
		for(int i=1;i<=2;i++)
		{
			System.out.println("Run1 "+i);
			try
			{
				Thread.sleep(1000);//when u work with sleep imp to apply try catch logic
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			
		}
	}
}
class MyData2 extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Run2 "+i);
			try
			{
				Thread.sleep(500);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			
		}
	}
}
public class Thread3 {

	public static void main(String[] args) throws InterruptedException {
	    MyData1  t1=new MyData1();
	    MyData2  t2=new MyData2();
	    
		t1.start();
		t2.start();
		t1.join();
		for(int i=1;i<=5;i++)
		{
			System.out.println("Main "+i);
			
		}

	}

}
