package misc;

import static org.junit.Assert.*;

import java.util.LinkedList;

import org.junit.Test;

/**
 * when song gets b the next person should be removed and
 * 
 * @author Rithuik Yerrabrolu
 *
 */
public class PassingPillows {

	private static final String clockwise = "CLOCKWISE";

	private static final String anticlockwise = "ANTICLOCKWISE";

	@Test
	public void test() {
		String song = "aab";
		int totalPersons = 3, expectedWinner = 3;
		int winner = findTheWinner(totalPersons, song);
		assertEquals(expectedWinner, winner);
	}

	private int findTheWinner(int totalPersons, String song) {
		LinkedList<Integer> ppl = new LinkedList<Integer>();
		char[] songBits = song.toCharArray();
		String direction = clockwise;
		int pos = 0;
		for (int i = 1; i <= totalPersons; i++)
			ppl.add(i);
		while (true) {
			for (char songBit : songBits)
			{
				
			}
			if (ppl.size() == 1)
				break;
			else
				continue;
		}
		return ppl.get(0);
	}

}
