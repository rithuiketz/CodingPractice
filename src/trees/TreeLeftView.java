package trees;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Queue;

import org.junit.Test;

import trees.TreeStructure.TreeNode;

public class TreeLeftView {

	@Test
	public void test() {

		TreeStructure treeStructure = new TreeStructure();
		treeStructure.add(55);
		treeStructure.add(97);
		treeStructure.add(86);
		treeStructure.add(103);
		treeStructure.add(44);
		treeStructure.add(33);
		treeStructure.add(46);
		treeStructure.add(115);
		treeStructure.add(114);
		System.out.println();
		printLeftView(treeStructure);
	}

	private void printLeftView(TreeStructure treeStructure) {
		
		 printMethod1(treeStructure.getRoot());
		
	}

	private void printMethod1(TreeNode root) {
		
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(root);
		Collection<TreeNode> list = new ArrayList<>();
		while(!queue.isEmpty())
		{
			int curPos=0;
			int totalSize = queue.size();
			while(curPos < totalSize)
			{
				TreeNode currentNode = queue.poll();
				++curPos;
				if(1 == curPos)
				{
					list.add(currentNode);
				}
				if(currentNode.getLeft() != null)
				{
					queue.add(currentNode.getLeft());
				}
				if(currentNode.getRight() !=null)
				{
					queue.add(currentNode.getRight());
				}
							
			}	
		}
		System.out.println(list);
		
	}

}
