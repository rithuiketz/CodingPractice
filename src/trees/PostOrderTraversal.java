package trees;

import trees.TreeStructure.TreeNode;

public class PostOrderTraversal {

	public static void main(String[] args) {
		TreeStructure treeStructure = new TreeStructure();
		treeStructure.add(55);
		treeStructure.add(97);
		treeStructure.add(86);
		treeStructure.add(103);
		treeStructure.add(44);
		treeStructure.add(33);
		treeStructure.add(46);
		printPostOrder(treeStructure.getRoot());
	}

	private static void printPostOrder(TreeNode node) {
		if (node == null)
			return;
		printPostOrder(node.getLeft());
		printPostOrder(node.getRight());
		System.out.print(node.getData() + "; ");
	}
	
	private static void printPostOrderNonRec(TreeNode node)
	{
		
	}
}
