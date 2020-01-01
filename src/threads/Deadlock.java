package threads;

public class Deadlock {
	private Object resource1 = new String("Hey");
	private Object resource2 = new String("fff");

	Runnable thread1 = () -> {
		System.out.println("Thread1.....");
		synchronized (resource1) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			synchronized (resource2) {
				
			}

		}

	};
	Runnable thread2 = () -> {

		System.out.println("Thread2.....");
		synchronized (resource2) {

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			synchronized (resource1) {
				
			}

		}

	};
	
	public static void main(String[] args)
	{
		Deadlock dl =  new Deadlock();
		Thread t1 =  new Thread(dl.thread1);
		Thread t2 = new Thread(dl.thread2);
		t1.start();
		t2.start();
	}

}
