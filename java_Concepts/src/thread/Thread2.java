package thread;

public class Thread2 {

	public static void main(String[] args) {
		Thread t1=new Thread(()->{
			System.out.println("hello 1");
		});
		Thread t2=new Thread(()->{
			System.out.println("hello 2");
		});
		System.out.println("one");
		t1.start();
		t2.start();
		System.out.println("two");

	}

}
