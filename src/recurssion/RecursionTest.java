package recurssion;
/**
 * InterviewBit Questions
 * @author Rithuik Yerrabrolu
 *
 */
public class RecursionTest {

	public static void main(String[] args) 
	{
		System.out.println(foo(3,5));
		

	}
	
	private static  int  bar(int x,int y)
	{
		if(y==0)
			return 0;
		else
			return x+bar(x,y-1);
	}
	
	private static int foo(int x,int y)
	{
		if(y==0)
			return 1;
		else
			return bar(x,foo(x,y-1));
	}

}
