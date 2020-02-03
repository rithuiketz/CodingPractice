package sorting;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.function.BiFunction;
import java.util.function.Function;

import org.junit.Test;

public class SortingBasedOnFrequency {

	@Test
	public void test() {
	
		int[] testArr = {2, 5, 2, 6, -1, 9999999, 5, 8, 8, 8};
		int[] expec = {8, 8, 8, 2, 2, 5, 5, 6, -1, 9999999};
		sort(testArr);
		System.out.println(Arrays.toString(testArr));
		assertArrayEquals(testArr, expec);
		
	}
	
	public void sort(int[] arr)
	{
		TreeMap<Integer, Integer> treeMap = new TreeMap<>();		
	
		for(int num :  arr)
		{
			if(treeMap.containsKey(num))
			{
				int val =  treeMap.get(num);
				treeMap.put(num, val+1);
			}
			else
			{
				treeMap.put(num, 1);
			}
		}
		List<Entry<Integer,Integer>> entrySet = new ArrayList<>(treeMap.entrySet());
		Comparator<Entry<Integer,Integer>> cmptr = (entry1,entry2) -> entry2.getValue().compareTo(entry1.getValue());
		entrySet.sort(cmptr);
		entrySet.forEach((e -> System.out.println(e.getKey()+" :"+e.getValue())) );
		int index=0;
		for(Entry<Integer,Integer> entry : entrySet)
		{
			int key =  entry.getKey();
			int value = entry.getValue();
			while(value-- >0)
			{
				arr[index++]=key;
				
			}
			
		}
		
	}

}
