package arrays.matrix;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class RotateMatrix {

	@Test
	public void test() {
		int[][] inputArr ={{1,2,3},{4,5 ,6},{7, 8, 9 } };
		
		int[][] expectedArr ={{7,4,1},{8,5,2},{9,6,3}};
		rotate(inputArr);	    
		for(int i=0;i<inputArr.length;i++)
		{
			for(int j=0;j<inputArr.length;j++)
			{
				System.out.print(inputArr[i][j]+" ");
			}
			System.out.println();
		}
	}

	private void rotate(int[][] inputArr) {		
		transpose(inputArr);
		for(int i=0;i<inputArr.length;i++)
		{
			reverseArray(inputArr[i]);
		}
	}

	private void reverseArray(int[] is) {
		
		int l=0,r=is.length-1,temp=0;
		while(l<r)
		{
			temp = is[l];
			is[l] =is[r];
			is[r] =temp;
			l+=1;
			r-=1;
		}
	}

	private void transpose(int[][] inputArr) {
		
		for(int i=0;i<inputArr.length;i++)
		{
			for(int j=i;j<inputArr.length;j++)
			{
				//swap
				int temp =  inputArr[i][j];
				inputArr[i][j] =inputArr[j][i];
				inputArr[j][i] =temp;
			}
		}
		
	}
}
