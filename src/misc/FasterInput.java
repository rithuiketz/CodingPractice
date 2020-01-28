package misc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * https://www.geeksforgeeks.org/fast-io-in-java-in-competitive-programming/
 * 
 * @author Rithuik.Yerrabrolu
 *
 */
public class FasterInput {
	public static void main(String[] args) throws Exception {
		BufferedReader _br = new BufferedReader(
				new InputStreamReader(System.in));
		int noTestCases = _br.read();
		int input = -1;
		System.out.println(noTestCases);
		while ((input = Integer.parseInt(_br.readLine())) != -1) {
			System.out.println(input);
		}
	}

	private static class FastReader {
		private BufferedReader _reder;
		private StringTokenizer tokenizer;

		FastReader() {
			_reder = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while(tokenizer ==null || !tokenizer.hasMoreElements())
			{
				//tokenizer = new StringTokenizer(_reder.readLine());
			}
			return tokenizer.nextToken();

		}

	}
}
