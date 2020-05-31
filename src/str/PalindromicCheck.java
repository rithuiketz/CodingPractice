package str;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class PalindromicCheck {

	@Test
	public void test() {
		String testString1 = "geeksogeeks", testString2 = "geeksforgeeks";
		boolean isPalindrome = check(testString1);
		assertEquals(isPalindrome, true);

	}

	private boolean check(String testString1) {

		List<Character> list = new ArrayList<>();
		for (int i = 0; i < testString1.length(); i++) {
			Character c = testString1.charAt(i);
			if (list.contains(c)) {
				list.remove(c);
			} else {
				list.add(c);
			}
		}
		if ((testString1.length() % 2 == 0 && list.isEmpty())
				|| (list.size() == 1 && testString1.length() % 2 == 1))
			return true;
		return false;
	}

}
