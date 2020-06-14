package concurrency.blockingQueue;



import org.junit.Test;

public class BlockingQueueTest {

	@Test
	public void test() throws Exception{
		BlockingQueue<Integer> blockingQueue = new BlockingQueueImpl<>(5);
		for(int i=0;i<5;i++)
		{
			Runnable r = () -> {try {
				System.out.println("######Getting :"+blockingQueue.get());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}};
			
			Thread t =  new Thread(r,String.valueOf(i));
			t.start();
			
		}
		for(int i=0;i<5;i++)
		{
			final int j =i;
			Runnable r = () -> {try {
				blockingQueue.put(Integer.valueOf(j));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}};
			
			Thread t =  new Thread(r,String.valueOf(i));
			t.start();
			
		}
	}

}
