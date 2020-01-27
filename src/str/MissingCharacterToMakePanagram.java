package str;

import java.util.LinkedList;
import java.util.List;

/**
 * To understand what a pangrammatic lipogram is we will break this term down
 * into 2 terms i.e. a pangram and a lipogram
 * 
 * Pangram: A pangram or holoalphabetic sentence is a sentence using every
 * letter of a given alphabet at least once. The best-known English pangram is
 * “The quick brown fox jumps over the lazy dog.”
 * 
 * Lipogram: A lipogram is a kind of constrained writing or word game consisting
 * of writing paragraphs or longer works in which a particular letter or group
 * of letters is avoided—usually a common vowel, and frequently E, the most
 * common letter in the English language. Example: The original “Mary Had a
 * Little Lamb” was changed by A. Ross Eckler Jr. to exclude the letter ‘S’.
 * 
 * A pangrammatic lipogram is a text that uses every letter of the alphabet
 * except one. For example, “The quick brown fox jumped over the lazy dog” omits
 * the letter S, which the usual pangram includes by using the word jumps.
 * 
 * Given a string, our task is to check whether this string is a pangrammatic
 * lipogram or not
 * 
 * @author Rithuik Yerrabrolu
 *
 */
public class MissingCharacterToMakePanagram {

	public static void main(String[] args) {

		
		String s = "The quick brown fox jumped over the lazy dog";
		String s1 = "The quick brown fox jumps over the lazy dog";
		String s3 = "The quick brown fox jumps over the lazy dog";
		
		panagramaticLipogram(s,'s');
		panagramaticLipogram(s1,'s');
		panagramaticLipogram(s3,'s');

	}

	public static void panagramaticLipogram(String s,char c1) 
	{
		List<Character> list = new LinkedList<Character>();
		int[] arr = new int[26];
		s = s.toLowerCase();
		for (char c : s.toCharArray()) {
			int targetPos = c % 97;
			if (targetPos > 26) {
				continue;
			}
			arr[targetPos] += 1;

		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0)
				list.add((char) (i + 'a'));
		}
		System.out.println( (list.contains(c1) &&list.size()==1)  ? "TRUE" :"FALSE");
	}

}
