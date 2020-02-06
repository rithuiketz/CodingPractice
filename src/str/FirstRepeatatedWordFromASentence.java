package str;

import static org.junit.Assert.*;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.Test;

public class FirstRepeatatedWordFromASentence {

	private static final String DEFAULT_OUTPUT="No Repetition";
	
	@Test
	public void test() {
		String input= "Ravi had been saying that";
		String expectedOutPut = DEFAULT_OUTPUT;
		String actualOutput=findRepeatedString(input);
		assertEquals(expectedOutPut, actualOutput);
	}

	private String findRepeatedString(String input) 
	{
		Map<String,Integer> map = new LinkedHashMap<>();
		String[]  words =  input.split(" ");
		for(String word : words)
		{
			if(map.containsKey(word))
			{
				int count  =  map.get(word);
				map.put(word, count+1);
			}
			else
			{
				map.put(word, 1);
			}
		}
		for(Entry<String,Integer> entry: map.entrySet())
		{
			if(entry.getValue() >1)
				return entry.getKey();
		}
		return DEFAULT_OUTPUT;
	}

}
