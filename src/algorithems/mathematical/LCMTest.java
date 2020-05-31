package algorithems.mathematical;

import static org.junit.Assert.*;

import org.junit.Test;

public class LCMTest {

	@Test
	public void test() {
		int num1,num2,expected,actual;
		num1 =20;
		num2 =15;
		expected =60;
		assertEquals(expected, lcm(num1,num2));
	}
	
	public static int lcm(int num1,int num2)
	{
		
		int prod =num1*num2;
		return prod/gcd(num1,num2);
		
	}
	
	public static int gcd(int a,int b)
	{
		if(a==0)
			return b;
		else
			return gcd(b%a,a);
	}

}
