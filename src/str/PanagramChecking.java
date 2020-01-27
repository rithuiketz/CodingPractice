package str;

import java.util.LinkedList;

public class PanagramChecking {
	/**
	 * Given a string check if it is Pangram or not. A pangram is a sentence
	 * containing every letter in the English Alphabet.
	 * 
	 * Examples : The quick brown fox jumps over the lazy dog ” is a Pangram
	 * [Contains all the characters from ‘a’ to ‘z’] “The quick brown fox jumps over
	 * the dog” is not a Pangram [Doesn’t contains all the characters from ‘a’ to
	 * ‘z’, as ‘l’, ‘z’, ‘y’ are missing]
	 * 
	 * @param args
	 */

	public static void main(String[] args) 
	{
		
		String s = "The quick brown fox jumps over the dog";
		s = s.toLowerCase();
		int[] arr = new int[26];
		int totalFilledPos = 0;
		for(char c : s.toCharArray())
		{
			int targetPos = c%97;
			if(targetPos >26)
			{
				continue;
			}
			if(arr[targetPos] ==0)
				++totalFilledPos;
			arr[targetPos]+=1;
			
		}
		System.out.println(totalFilledPos==26 ? true :  false);

	}

}
