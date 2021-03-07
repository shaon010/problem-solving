package leetcode.binaryTree.binaryTreeMaxDepth_104;

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

public class SolutionRecursiveDfs {
	public int maxDepth(TreeNode root) {
		int maxDepth = 0;
		if (root == null) {
			return maxDepth;
		}
		System.out.println(root.val); // dfs traversal values
		int leftMaxDepth = maxDepth(root.left);
		int rightMaxDepth = maxDepth(root.right);
		maxDepth = Math.max(leftMaxDepth, rightMaxDepth) + 1;
		return maxDepth;
	}

	public static void main(String[] args) {
		TreeNode node1 = new TreeNode(5);
		TreeNode node2 = new TreeNode(9);
		TreeNode node3 = new TreeNode(7);
		TreeNode node4 = new TreeNode(5);
		TreeNode node5 = new TreeNode(2);
		node1.left = node2;
		node1.right = node3;
		node3.left = node4;
		node3.right = node5;

		System.out.println("Max depth: " + new SolutionRecursiveDfs().maxDepth(node1));
		System.out.println("Max depth: " + new SolutionRecursiveDfs().maxDepth(null));
	}
}