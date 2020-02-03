package misc;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * https://www.hackerrank.com/challenges/strange-code/problem?utm_campaign=challenge-recommendation&utm_medium=email&utm_source=24-hour-campaign
 * 
 * @author Rithuik Yerrabrolu
 *
 */
public class StrangeCounter {

	@Test
	public void test() {
	
		System.out.println(test2(4));
	}
	
	private long test2(int t)
	{
		long cycle = Double.valueOf(Math.ceil(Math.log((new Double(t) + 3) / 3) / Math.log(2))).longValue(); 
		double p = Math.pow(2, cycle - 1); 
		long start = 3 * new Double(p).longValue(); 
		long rem = t - (3 * (new Double(p).longValue() - 1));
		return start - (rem - 1);
	}

}
