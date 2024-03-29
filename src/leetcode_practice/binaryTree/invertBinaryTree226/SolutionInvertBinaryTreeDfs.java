package leetcode_practice.binaryTree.invertBinaryTree226;

/**
 * Accepted solution
 * DFS
 * 0ms
 */

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x) { val = x; }
}

public class SolutionInvertBinaryTreeDfs {
	public TreeNode invertTree(TreeNode root) {
		if (root != null) {
			TreeNode temp = root.left;
			root.left = root.right;
			root.right = temp;
			invertTree(root.left);
			invertTree(root.right);
		}
		return root;
	}

	public static void main(String[] args) {
		TreeNode node1 = new TreeNode(4);
		TreeNode node2 = new TreeNode(2);
		TreeNode node3 = new TreeNode(7);
		TreeNode node4 = new TreeNode(1);
		TreeNode node5 = new TreeNode(3);
		TreeNode node6 = new TreeNode(6);
		TreeNode node7 = new TreeNode(9);

		node1.left = node2;
		node1.right = node3;
		node2.left = node4;
		node2.right = node5;
		node3.left = node6;
		node3.right = node7;
/*

				   4
				 /   \
				2     7
			   / \   / \
		      1   3 6   9
*/

		new SolutionInvertBinaryTreeDfs().invertTree(node1);
	}
}