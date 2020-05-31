package datastructures.heap;

public class MinHeap 
{
	private int[] heapArr;
	
	private int maxCapacity;

	public int getMaxCapacity() {
		return maxCapacity;
	}

	public void setMaxCapacity(int maxCapacity) {
		this.maxCapacity = maxCapacity;
		this.heapArr = new int[maxCapacity];
	}
	
	public int getParent(int pos)
	{
		return (pos-1)/2;
	}
	
	public int getLeft(int pos)
	{
		return (2*pos)+1;
	}
	public int getRight(int pos)
	{
		return (2*pos)+2;
	}
	
	
}
