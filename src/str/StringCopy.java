package str;

/**
 * https://www.geeksforgeeks.org/function-copy-string-iterative-recursive/
 * 
 * @author Rithuik Yerrabrolu
 *
 */
public class StringCopy {

	public static void main(String[] args) {
		String s1 ="abc";
		char[] s2 = new char[s1.length()];
		
		//copyStrItr(s1.toCharArray(),s2);
		copyStringRec(s1.toCharArray(),s2,0);
		
		System.out.println("s1= "+s1+"########s2= "+String.valueOf(s2));

	}

	private static void copyStrItr(char[] src, char[] dest) 
	{
		 int length = src.length;
		// dest = new char[length];
		 for(int i=0;i<length;i++)
		 {
			 dest[i] =src[i];
		 }
	}
	
	private static void copyStringRec(char[] src,char[] dest,int index)
	{
		
		  if(index >src.length-1)
			  return;
		dest[index] = src[index++];
		copyStringRec(src, dest, index);
		
	}

}
