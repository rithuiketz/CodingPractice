package trees;

import java.util.Stack;

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
		printPostOrderRec(treeStructure.getRoot());
		System.out.println();
		printPostOrderNonRec(treeStructure.getRoot());
	}

	private static void printPostOrderRec(TreeNode node) {
		if (node == null)
			return;
		printPostOrderRec(node.getLeft());
		printPostOrderRec(node.getRight());
		System.out.print(node.getData() + "; ");
	}
	
	 private static void printPostOrderNonRec(TreeNode root) {
			
			if(root==null)
				return;
			TreeNode pre=null;
			Stack<TreeNode> s = new Stack();      
			while(root!=null || !s.empty()){
				if(root!=null){				
					s.push(root);
					root = root.getLeft();
				}
				else{
					root = s.peek();
					if(root.getRight()==null || root.getRight()==pre){
					    System.out.println(root.getData());;
					    s.pop();
					    pre=root;
					    root = null;
					}
					else
					    root = root.getRight();
				}
			}
		}
}
