package trees;

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
		printPreOrder(treeStructure.getRoot());
	}

	private static void printPreOrder(TreeNode node) {
		if (node == null)
			return;
		printPreOrder(node.getLeft());
		System.out.print(node.getData() + "; ");
		printPreOrder(node.getRight());

	}

}
