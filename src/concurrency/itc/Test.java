package concurrency.itc;

import java.util.Arrays;
import java.util.List;

public class Test 
{
	

	public static void main(String[] args) 
	{
		ThreadObject tObject = new ThreadObject();
		
		Thread t1 = new Thread(tObject, "Thread1");
		Thread t2 = new Thread(tObject, "Thread2");
	
		
		t1.start();
		t2.start();
	}

}
