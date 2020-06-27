package arrays.repetition;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;

import org.junit.Test;
/**
 * https://leetcode.com/problems/top-k-frequent-elements/solution/
 * ref :  quick seelect
 * 
 * 
 * 
 * @author Rithuik.Yerrabrolu
 *
 */
public class TopKFrequentElements {

	@Test
	public void test() {

		int[] inputArr = { 5,3,1,1,1,3,73,1,2 };
		int[] oup = { 1, 3 };
		int k = 2;
		findTheKMostFrequentlyOccured(inputArr, k);
		assertArrayEquals(oup, oup);
	}

	int[] findTheKMostFrequentlyOccured(int[] arr,int k)
	{
		Map<Integer,Integer> map = new HashMap<>();
			
		int[] op = new int[k];
        for(int num  : arr)
        {
            
             if(!map.containsKey(num))
             {
                 map.put(num,0);
             }
             map.put(num,map.get(num)+1);
        }
        
        List<Map.Entry<Integer,Integer>> list = new ArrayList<Map.Entry<Integer,Integer>>(map.entrySet());
        Comparator<Map.Entry<Integer,Integer>> comparator =(e1,e2) ->  e2.getValue().compareTo(e1.getValue());
        Collections.sort(list, comparator);
		Iterator<Entry<Integer,Integer>>iterator = list.iterator();
		int index=0;
        while(iterator.hasNext() && index < k)
        {
        	op[index++] = iterator.next().getKey();
        }
        return op;
	}
}
