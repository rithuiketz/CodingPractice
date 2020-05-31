package algorithems.mathematical;

import static org.junit.Assert.*;

import org.junit.Test;

public class ArrayLCM {

	@Test
	public void test() {
		int arr[] = { 2, 7, 3, 9, 4 }; 
		int expected = 252,length=arr.length,i=0,lcm;
		lcm=arr[i];
		for(int k=1;k<k;k++)
		{
			lcm= LCMTest.lcm(lcm, arr[k]);
		}
		System.out.println(lcm);
	}

}
