package trees;

import static org.junit.Assert.*;

import java.util.LinkedList;
import java.util.Queue;
import org.junit.Test;

import trees.TreeStructure.TreeNode;

public class BinaryTreeHeight {

	@Test
	public void test() {
		
		TreeStructure ts =  new TreeStructure();
		ts.add(3);
		ts.add(2);
		ts.add(1);
		ts.add(5);
		ts.add(4);
		ts.add(6);
		ts.add(7);
		
		int height = findTreeHeight(ts.getRoot());
		System.out.println(height);
	}

	private int findTreeHeight(TreeNode root) 
	{
		int height =0;
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);
		while(!queue.isEmpty())
		{
			int totalSize = queue.size();
			int cp =0;
			while(cp  < totalSize)
			{
				TreeNode data =  queue.poll();
				if(data.getLeft() != null)
				{
					queue.add(data.getLeft());
				}
				if(data.getRight() !=null)
				{
					queue.add(data.getRight());
				}
				++cp;
			}	
			++height;
		}
		return height-1;
	}

}
