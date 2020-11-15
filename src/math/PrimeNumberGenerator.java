package math;

import java.util.Scanner;

public class PrimeNumberGenerator {

	public static void main(String[] args) 
	{
		Scanner sc   = new Scanner(System.in);
		int noTestcases = sc.nextInt();
		for(int i=1;i<=noTestcases;i++)
		{
			int start = sc.nextInt();
			int end = sc.nextInt();
			for(int k=start;k<=end;k++)
			{
				if(isPrime(k) && k!=1)
				{
					System.out.println(k);
				}
			}
		}

	}
	static boolean isPrime(int i)
	{
		if(i <=3)
			return true;
		else
		{
			int range  = (int) Math.sqrt(i);
			for(int m=1;m<=range;m++)
			{
				if(i%m == 0 && m!=1)
					return false;
			}
		}
		return true;
	}

}
