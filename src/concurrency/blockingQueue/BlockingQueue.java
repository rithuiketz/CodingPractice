package concurrency.blockingQueue;

public interface BlockingQueue<T> {
	
	public T get() throws Exception;
	
	public void put(T obj) throws Exception;

}
