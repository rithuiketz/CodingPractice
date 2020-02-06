package str;

import static org.junit.Assert.*;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.Test;

public class FirstNonRepeatatedWordFromASentence {

	private static final Character DEFAULT_OUTPUT='\u0000';
	
	@Test
	public void test() {
		String input= "GeeksQuiz";
		Character expectedOutPut = 'G';
		Character actualOutput=findRepeatedString(input);
		assertEquals(expectedOutPut, actualOutput);
	}

	private Character findRepeatedString(String input) 
	{
		Map<Character,Integer> map = new LinkedHashMap<>();
		char[]  chars =  input.toCharArray();
		for(char charc : chars)
		{
			if(map.containsKey(charc))
			{
				int count  =  map.get(charc);
				map.put(charc, count+1);
			}
			else
			{
				map.put(charc, 1);
			}
		}
		for(Entry<Character,Integer> entry: map.entrySet())
		{
			if(entry.getValue() ==1)
				return entry.getKey();
		}
		return DEFAULT_OUTPUT;
	}

}
