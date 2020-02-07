package trees;

import java.util.Stack;

import trees.TreeStructure.TreeNode;

public class InOrderTraversal {

	public static void main(String[] args) {
		TreeStructure treeStructure = new TreeStructure();
		treeStructure.add(55);
		treeStructure.add(97);
		treeStructure.add(86);
		treeStructure.add(103);
		treeStructure.add(44);
		treeStructure.add(33);
		treeStructure.add(46);
		printInOrderRec(treeStructure.getRoot());
		System.out.println("");
		printInOrderNonRec(treeStructure.getRoot());
		
	}

	private static void printInOrderRec(TreeNode node) {
		if (node == null)
			return;
		printInOrderRec(node.getLeft());
		System.out.print(node.getData() + "; ");
		printInOrderRec(node.getRight());
	}

	private static void printInOrderNonRec(TreeNode node)
	{
		Stack<TreeNode> stack  = new Stack<>();
		TreeNode current =  node;
		while(true)
		{
			while(current !=null)
			{
				
				stack.push(current);
				current =current.getLeft();
			}
			current = stack.pop();
			System.out.print(current.getData()+"; ");
			current =current.getRight();
			if(stack.isEmpty() && current==null)
				return;
		}
	}

}
