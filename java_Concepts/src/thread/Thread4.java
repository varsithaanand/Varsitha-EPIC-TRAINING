package thread;
class Counter{
	int count=0;
	
	synchronized public void incrementCount() {
		count++;
	}
}


class MyThread extends Thread{
	Counter count;//obj
	 MyThread(Counter c){
		this.count = c;
	 }
	public void run() {
	for(int i=0;i<10;i++) {
		//System.out.println("sleeping");
		try
		{
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
			
		}
		count.incrementCount();
	}}
}





public class Thread4{

	public static void main(String[] args) throws InterruptedException {
		Counter c = new Counter();
		MyThread t1 = new MyThread(c); 
		MyThread t2 = new MyThread(c);
		System.out.println(t1.getState());
		t1.start();
		System.out.println(t1.getState());
		t2.start();
		t1.join();//use to inorder to execute thread1 separartely v use it
		t2.join();
		System.out.println(c.count);

	}

}
/*
 * 
 * We use join() in order execute inorder after each thread complete other get executed
 * when v use join() it is imp to [throws InterruptedException]
 * v get output not correctly because two threads share obj in order to rectify v use synchronized
*/