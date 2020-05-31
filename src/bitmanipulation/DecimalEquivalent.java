package bitmanipulation;

import static org.junit.Assert.*;

import org.junit.Test;

public class DecimalEquivalent {

	@Test
	public void test() {
		
		int num=3;
	    String s="";
		for(int i=1;i<=num;i++)
		{
			s+=Integer.toBinaryString(i);
		}
		System.out.println(s.length());
		int pow=0,sum=0;
		for(char c : s.toCharArray())
		{
			if('1' == c)
			{
				sum+=(long)Math.pow(2, pow);
			}
			++pow;
		}
		System.out.println(sum);
	}

}
