package trees;

import java.util.LinkedList;
import java.util.Queue;

import trees.TreeStructure.TreeNode;

public class LevelOrderTraversal {

	public static void main(String[] args) {
		TreeStructure treeStructure = new TreeStructure();
		treeStructure.add(55);
		treeStructure.add(97);
		treeStructure.add(86);
		treeStructure.add(103);
		treeStructure.add(44);
		treeStructure.add(33);
		treeStructure.add(46);
		printLevelOrderUsingQueue(treeStructure.getRoot());
		
	}

	private static void printLevelOrderUsingQueue(TreeNode root)
	{
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(root);
		while(!queue.isEmpty())
		{
			//get the node
			TreeNode node = queue.poll();
			System.out.print(node.getData()+"; ");
			if(node.getLeft() != null)
			{
				queue.add(node.getLeft());
			}
			if(node.getRight() != null)
			{
				queue.add(node.getRight());
			}
		}
		
	}

}
