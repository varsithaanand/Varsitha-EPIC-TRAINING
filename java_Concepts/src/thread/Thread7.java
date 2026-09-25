class MyData{
    void display(){
        try{
            Thread.sleep(2000);
        }
        catch(InterruptedException e){
            
        }
        System.out.println("THREAD");
    }
}
public class Main
{
	public static void main(String[] args) throws InterruptedException {
		MyData th = new MyData();
		Thread t1 = new Thread(()->{
		    th.display();
		});
		Thread t2 = new Thread(()->{
		    try{
		        t1.join();
		    }
		    catch(InterruptedException e){
		        
		    }
		});
		t1.start();
		t2.start();
		Thread.sleep(5000);
		System.out.println(t2.getState());
	}
}
