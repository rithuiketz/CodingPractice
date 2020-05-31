package bitmanipulation;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Test;

/*
 * https://www.hackerearth.com/practice/basic-programming/bit-manipulation/basics-of-bit-manipulation/
 * practice-problems/algorithm/mystery-30/
 * 
 */
public class Mystery {

	long num=4816781326358l;
	
	@Test
	public void test() {
		System.out.println(getSetBitCount(num));
	}
	
	public int getSetBitCount(long num)
	{
		int count=0;
		while(num !=0)
        {
            if((num&1) !=0)
            {
                ++count;
            }
            num= num>>1;
        }
		return count;
	}

}
