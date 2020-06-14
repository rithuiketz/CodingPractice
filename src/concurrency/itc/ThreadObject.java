package concurrency.itc;

import java.util.Arrays;
import java.util.List;

public class ThreadObject implements Runnable {
	List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9,10,11,23);

	private Object monitor = new Object();
	
	private boolean toogle =true;

	private volatile int index = 0;

	@Override
	public void run() 
	{
		while (index < list.size()) 
		{
			try
			{
				synchronized (monitor) 
				{
					if(toogle)
					{
						System.out.println(list.get(index++) + " >>> Accessed by "
								+ Thread.currentThread().getName());
						toogle=false;
						monitor.wait();
						
					}
					if(!toogle || !(index<list.size()))
					{
						toogle=true;
						monitor.notifyAll();
					}
				}

			} catch (Exception e) {

			}
		}
	}

}
