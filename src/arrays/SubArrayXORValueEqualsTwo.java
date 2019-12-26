package arrays;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

/**
 * https://www.geeksforgeeks.org/find-number-of-subarrays-with-xor-value-a-power
 * -of-2/
 * 
 * @author Rithuik.Yerrabrolu
 *
 */
public class SubArrayXORValueEqualsTwo {

	@Test
	public void test() {

		int[] testArr={2, 4, 8, 16} ;
		int noSubArrays = noSubArrays(testArr);
		assertEquals(4, noSubArrays);
		
		
	}
	
	public static int noSubArrays(int[] arr)
	{
		int ans=0,value=1,length=arr.length,prevXor=0,max=10;
		Map<Integer,Integer> hashMap = new HashMap<>();
		hashMap.put(0, 1);
		for(int i=0;i<length;i++)
		{
			value=1;
			prevXor^=arr[i];
			for(int j=0;j<max;j++)
			{
				int y =  prevXor^value;
				if(hashMap.containsKey(y))
				{
					++ans;
				}
				value*=2;
			}
			if(hashMap.containsKey(prevXor))
			{
				hashMap.put(prevXor, hashMap.get(prevXor)+1);
			}
			else
			{
				hashMap.put(prevXor, 1);
			}
		}
		return ans;
	}

}
