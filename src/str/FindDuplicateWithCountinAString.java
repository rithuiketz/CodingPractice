package str;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

import org.junit.Test;

public class FindDuplicateWithCountinAString {

	@Test
	public void test() {
		String s = "test string";
		Set<Entry<Character, Integer>> set = getDuplicatesWithCount(s);
		for (Entry<Character, Integer> entry : set) {
			System.out.println("char :" + entry.getKey() + " & noOfTimes :"
					+ entry.getValue());
		}
	}

	private Set<Entry<Character, Integer>> getDuplicatesWithCount(String input) {
		Map<Character, Integer> map = new HashMap<>();
		for (char c : input.toCharArray()) {
			if (map.containsKey(c)) {
				int value = map.get(c);
				map.put(c, value + 1);
			} else {
				map.put(c, 1);
			}

		}
		Set<Entry<Character, Integer>> set = map.entrySet().stream()
				.filter(entry -> entry.getValue() > 1).collect(Collectors.toSet());
		return set;
	}

}
