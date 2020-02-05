package trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import trees.TreeStructure.TreeNode;

public class PreOrderTraversing {

	public static void main(String[] args) 
	{
		TreeStructure treeStructure = new TreeStructure();
		treeStructure.add(55);
		treeStructure.add(97);
		treeStructure.add(86);
		treeStructure.add(103);
		treeStructure.add(44);
		treeStructure.add(33);
		treeStructure.add(46);
		printPreOrderStack(treeStructure.getRoot());
	}

	private static void printPreOrderRec(TreeNode node) 
	{
		if(node == null)
			return;
		System.out.print(node.getData()+"; ");
		printPreOrderRec(node.getLeft());
		printPreOrderRec(node.getRight());
		
	}
	
	private static void printPreOrderStack(TreeNode node)
	{
		Stack<TreeNode> stack = new Stack<>();
		stack.push(node);
		while(!stack.isEmpty())
		{
			node  =  stack.pop();
			System.out.print(node.getData()+"; ");
			if(node.getRight() !=null)
				stack.push(node.getRight());
			if(node.getLeft() !=null)
				stack.push(node.getLeft());
						
		}		
	}
	
	private static void printPreOrderQueue(TreeNode node)
	{
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(node);
		while(!queue.isEmpty())
		{
			TreeNode current = queue.poll();
			System.out.print(current.getData()+"; ");
			if(current.getRight() != null)
			{
				queue.add(current.getRight());
			}
			if(current.getLeft() != null)
			{
				queue.add(current.getLeft());
			}
			
		}
		
	}

}
