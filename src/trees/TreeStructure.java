package trees;

public class TreeStructure {
	private TreeNode root;

	protected class TreeNode 
	{
		private Integer data;

		private TreeNode left;

		private TreeNode right;

		public TreeNode(Integer data) {
			this.data = data;
		}

		public void setLeft(TreeNode leftNode) {
			this.left = leftNode;
		}

		public void setRight(TreeNode rightNode) {
			this.left = rightNode;
		}

		public Integer getData() {
			return this.data;
		}

		public TreeNode getLeft() {
			return this.left;
		}

		public TreeNode getRight() {
			return this.right;
		}
	}

	public void add(Integer data) {
		if (this.root == null)
			this.root = new TreeNode(data);
		else {
			TreeNode targetNode = this.root;
			TreeNode temp = null;
			while (targetNode.left != null && data < targetNode.data) {
				targetNode = targetNode.left;
			}
			while (targetNode.right != null && data > targetNode.data ) {
				targetNode = targetNode.right;
			}

			if (data < targetNode.data) {
				temp = targetNode.left;
				targetNode.left = new TreeNode(data);
				targetNode.left.left = temp;
			}
			if (data > targetNode.data) {
				temp = targetNode.right;
				targetNode.right = new TreeNode(data);
				targetNode.right.right = temp;
			}

		}
	}

	public TreeNode getRoot() {
		return this.root;
	}
}
