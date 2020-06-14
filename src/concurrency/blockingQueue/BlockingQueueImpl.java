package concurrency.blockingQueue;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BlockingQueueImpl<T> implements BlockingQueue<T> {
	private volatile Queue<T> dataStore = new LinkedList<>();
	private int capacity;

	public BlockingQueueImpl(int capacity) {
		super();
		this.capacity = capacity;
	}

	@Override
	public T get() throws InterruptedException 
	{
		T data =null;
		synchronized (this) {
			while (this.dataStore.isEmpty()) {
				System.out.println("#### NO Data Available So Waiting....####");
				wait();
			}
			if (!this.dataStore.isEmpty()) {
				data=dataStore.poll();
				notifyAll();
			}
			return data;
		}
		
	}

	@Override
	public void put(T obj) throws InterruptedException 
	{
		synchronized (this) 
		{
			if (this.dataStore.size() == this.capacity) {
				System.out.println("#### QUEUE Is Full So Waiting...####");
				wait();
			}
			if (this.dataStore.size() < this.capacity) 
			{
				this.dataStore.add(obj);
				notifyAll();
			}
		}
	}

}
