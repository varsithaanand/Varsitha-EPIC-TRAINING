package thread;

class Order1
{
    synchronized void display(String status)
    {
        System.out.println(status);
    }
}
class Payment implements Runnable {

    Order1 order;

    Payment(Order1 o) {
        this.order = o;
    }

    public void run() {
        order.display("PAYMENT PROCESSING");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        order.display("PAYMENT COMPLETED");
    }
}
class Deliever extends Thread{

    Order1 order;

   Deliever(Order1 order) {
        this.order = order;
    }

    public void run() {
        order.display("ORDER IS BEING SHIPPED");

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        order.display("ORDER DELIVERED");
    }
}
public class ThreadConsole2
{
	public static void main(String[] args) throws InterruptedException {
	 Order1 o=new Order1();
	 System.out.println("ORDER PLACED");
	 Payment p=new Payment(o);
	 Deliever d=new Deliever(o);
	 Thread t1=new Thread(p);
	 t1.start();
	 t1.join();
	 d.start();
	}
}
